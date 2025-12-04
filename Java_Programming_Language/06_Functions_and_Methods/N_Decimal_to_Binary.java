import java.util.*;
public class N_Decimal_to_Binary {
    public static void Deci_to_Bina(int n){
        double binary =0;
        int i =0;
        while(n>0){
            int bina = n %2;
            binary = bina*Math.pow(10,i) + binary;
            n = n/2;
            i++;
            
        }
        System.out.println(binary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number :");
        int n = sc.nextInt();
        Deci_to_Bina(n);

    }
    
}
