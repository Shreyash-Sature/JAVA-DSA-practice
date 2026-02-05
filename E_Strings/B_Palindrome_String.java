import java.util.*;
public class B_Palindrome_String {

    // public static boolean CheckPalindrome(String str){
    //     int i =0;
    //     int j = str.length();
    //     while(i <j){
    //         if(str.charAt(i) == str.charAt(j-1)){
    //             i++;
    //             j--;
    //         }
    //         else{
    //             System.out.println("The String is not palindrome.");
    //             return false;
    //         }
            
    //     }
    //     System.out.println("The Stirng is Palindrome.");
    //     return true;
    // }

    // Following is more clean and optimal code

    public static boolean CheckPalindrome(String str){
        
        if(str.length() == 0 || str.length() == 1){
            return true;
        } // no need of this normally but for empty or single char string gives instant answer(doesnt run loop)

        int left = 0;
        int right = str.length()-1;

        
        while(left < right ){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("This string isnt a palindrome.");
                return false;
            }
            left++;
            right--;
        }
        System.out.print("This String is a palindrome.");
        return true;
    }

    public static boolean IsPalindrome(String str){
        for(int i =0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                System.out.print("This String is not a palindrome.");
                return false;
            }
        }
        System.out.print("This String is a palindrome.");
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check palindrome : ");
        String str = sc.nextLine();
        CheckPalindrome(str);
        IsPalindrome(str);

    }
}
