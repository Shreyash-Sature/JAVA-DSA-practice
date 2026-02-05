public class H_String_Compression {

    //  compress string "aaabbcccdd" =>  a3b2c3d

    public static String StringCompress(String str){
        StringBuilder sb = new StringBuilder("");
        int counter = 1;

        //append first letter
        sb.append(str.charAt(0));

        for(int i =0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                counter ++;
            }

            else{
                sb.append(counter);
                sb.append(str.charAt(i+1));
                counter = 1;
            }
        }
        sb.append(counter);
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aabbffffcccdd";
        System.out.println(StringCompress(str));
    }
}
// Output : a3b2c3d