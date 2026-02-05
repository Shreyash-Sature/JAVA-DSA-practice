public class G_UpperCase {

    public static String UpperCase(String str){

        // StringBuilder sb = new StringBuilder("");

        // // making first letter capital
        // char ch = Character.toUpperCase(str.charAt(0));
        // sb.append(ch);

        // for(int i =1; i< str.length(); i++){
        //     sb.append(str.charAt(i));
        //     if(str.charAt(i) == ' '){

        //         char cha = Character.toUpperCase(str.charAt(i+1));
        //         sb.append(cha);
        //         i++;
                
        //     }
            
        // }

        // return sb.toString();
        
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i =1; i<str.length();i++){
            sb.append(str.charAt(i));
            if(str.charAt(i) == ' ' && i<str.length()-1){
                char cha = Character.toUpperCase(str.charAt(i+1));
                sb.append(cha);
                i++;
            }

        }
        return sb.toString();

    }
    public static void main(String[] args) {
        String str = "hi, i am shreyash";
        System.out.println(UpperCase(str));
    }
}
