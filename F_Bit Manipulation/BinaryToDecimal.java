import java.util.*;
public class BinaryToDecimal{
    public static int BinaToDeci(int n){
        int lastdig;
        int deci =0;
        int base =1;
        while(n>=0){
            lastdig = n %10;
            if(lastdig == 0){
                deci = base * 1;
            }
            if(lastdig == 1){
                deci = base + deci;
            }
            base = base * 2;
            n = n/10;
        }
        return deci;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(BinaToDeci(n));
    }
}