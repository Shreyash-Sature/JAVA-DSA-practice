import java.util.*;
public class C_Inverted_half_Pyr_with_Numbers {

    public static void Inverted_Pyr(int num){
        for(int i =1; i<=num;i++){
            for(int j=1;j<=num-i+1;j++){
                System.out.print(j +" ");            
            }
            System.out.println(" ");
        }
        

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of num : ");
        int num = sc.nextInt();

        Inverted_Pyr(num);
    }
}
/*
Output : 
Enter value of num : 5
1 2 3 4 5  
1 2 3 4  
1 2 3  
1 2  
1  
*/
