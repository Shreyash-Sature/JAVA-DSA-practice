public class J_x_to_power_n_Optimized {

    public static int HalfPow(int x, int pow){
        if(pow == 0){
            return 1;
        }
        int halfPow = HalfPow(x, pow/2);
        int ans = halfPow * halfPow;

        if(pow%2 !=0){
            ans = x * ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        int x =2;
        int pow =4;
        System.out.println(HalfPow(x, pow));

    }
    
}
