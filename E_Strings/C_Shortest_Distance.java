//find the shortest distance from origin(0,0) to final position.

public class C_Shortest_Distance {

    public static float shortDist(String str){
        int x =0;
        int y =0;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)=='E'){
                x++;
            }
            if(str.charAt(i)=='W'){
                x--;
            }
            if(str.charAt(i)=='N'){
                y++;
            }
            if(str.charAt(i)=='S'){
                y--;
            }  
        }
        double sqrs = Math.pow(x, 2) + Math.pow(y,2);
        double shortest_Dis = Math.sqrt(sqrs);
        return (float)shortest_Dis; //typecasted
    }

    public static float ShortesDis(String str){
        int x =0;
        int y =0;
        for(int i =0; i<str.length(); i++){
            if()
        }
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortDist(str));
    }
}