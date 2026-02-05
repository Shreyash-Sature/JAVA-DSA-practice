public class D_String_Functions {

    /*
    String Functions : 
    1) s1.equals(s2) : 
    */
    public static void main(String[] args) {
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        
        if(s1 == s2){
            System.out.println("s1 s2 Same same");
        }
        else{
            System.out.println("s1 s2 Different");
        }
        if(s1 == s3){
            System.out.println("s1 s3 Same same");
        }
        else{
            System.out.println("s1 s3 Different");
        }

        if(s1.equals(s3)){
            System.out.println("s1 s3 Same same");
        }
        else{
            System.out.println("s1 s3 Different");
        }
        
    }
}
