import java.util.*;
public class hollowrec{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter number of col : ");
        int col = sc.nextInt();

        for(int i = 1; i<=row; i++){
            if(i==1 || i== row){
                for(int j = 1; j<=col; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                System.out.print("* ");
            for(int j =1; j<=col-2;j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
            }           
        }      
    }
}
