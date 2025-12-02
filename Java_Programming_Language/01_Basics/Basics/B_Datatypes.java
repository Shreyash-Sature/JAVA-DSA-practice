/*Data types in Java :

1)Premitive :

byte  : We can only store numbers from -128 to 127 (256 numbers) in byte data type
        size : (1byte/ 8bits)

short : size = 2 bytes

boolean : [true, false] 
          size = 1 byte

char : ['a' to 'z', 'A' to 'Z', '@','%',',']
       2 bytes 

int : 4 bytes, [-2B to 2B]

long : 8 bytes

float : 4 bytes

double : 8 bytes


2)Non Premitive :
String, Array, Class, Object, Interface*/

public class B_Datatypes {
    public static void main(String[] args) {
        byte a = 8;
        System.out.println(a);
        
        char b = 'B';
        System.out.println(b);

        boolean var = true;
        System.out.println(var);


        double price = 0.5;  //for small decimal no use float and for big use double
        System.out.println(price);

        int d = 23;
        System.out.println(d);

        long e = 28763681;
        System.out.println(e);



    }
    
}

