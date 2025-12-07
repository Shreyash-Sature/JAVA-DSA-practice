import java.util.*;

public class F_areaof0 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of circle : ");
        int rad = sc.nextInt();
        double area = rad* rad* 3.14;

        System.out.print("Area of Circle is : ");
        System.out.println(area);

    }
    
}
