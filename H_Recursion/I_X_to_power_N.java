public class I_X_to_power_N {
    

    //my approach
    // public static int XPow(int x, int pow){
    //     if(pow ==0){
    //         return 1;
    //     }
    //     int ans = 1 * XPow(x, pow-1);
    //     return ans * x;
    // }

    // best approach
    public static int XPow(int x, int pow){
        if(pow ==0){
            return 1;
        }
        x = x * XPow(x, pow-1);
        return x;
    }
    public static void main(String[] args) {
        int pow = 4;
        int x = 2;
        System.out.println(XPow(x,pow));
    }
}
