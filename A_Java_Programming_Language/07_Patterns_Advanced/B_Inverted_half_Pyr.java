import java.util.*;
public class B_Inverted_half_Pyr {
    public static void Pyramid(int num){
        for(int i=1;i<num;i++){
            for(int j=1;j<=num-i;j++){   //Loop for spaces
                System.out.print("  ");
            }
            for(int k=1; k<=i;k++){      // Loop for Stars
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of num : ");
        int num = sc.nextInt();

        Pyramid(num);

    }
    
}

/*
Output : Enter value of num : 6
          * 
        * * 
      * * * 
    * * * * 
  * * * * * 
*/
