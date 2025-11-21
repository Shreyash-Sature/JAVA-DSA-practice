
public class sum{

    static int Sum(int n ){
        int sum = 0;
        for(int i =0; i<=3; i++){
            int lastdig = n%10;
            sum = sum + lastdig;
            n = n/10;
            
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 678;
        System.out.println("Sum of digits is : "+ Sum(n));

        
    }
}