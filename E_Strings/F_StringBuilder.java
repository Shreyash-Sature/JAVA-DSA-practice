public class F_StringBuilder {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("");

        // append characters from 'a' to 'z' to string
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch + " "); // appends at end
        }
        System.out.println(sb);
    }
}
