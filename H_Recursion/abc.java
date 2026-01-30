public class abc {
    public static void main(String[] args) {
        int n =12345;
        int sum = 0;
        while(n>0){
            int lastDig = n % 10;
            sum = sum + lastDig;
            n = n/10;
        }
        System.out.println(sum);
    }
    
}
