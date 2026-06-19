error id: file://<HOME>/Coding/JAVA-DSA-practice/G_Object%20Oriented%20Programming/B_Access_Modifiers.java:java/lang/System#
file://<HOME>/Coding/JAVA-DSA-practice/G_Object%20Oriented%20Programming/B_Access_Modifiers.java
empty definition using pc, found symbol in pc: java/lang/System#
empty definition using semanticdb
empty definition using fallback
non-local guesses:

offset: 530
uri: file://<HOME>/Coding/JAVA-DSA-practice/G_Object%20Oriented%20Programming/B_Access_Modifiers.java
text:
```scala
/*
Access Modifiers : Access modifiers control where a class, variable, method, or 
                   constructor can be accessed from.*/
import java.util.*;
public class B_Access_Modifiers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAcc myAcc = new BankAcc();
        
        System.out.println("Set your user name : ");
        myAcc.set_usrname(sc.nextLine()); 

        System.out.println("Set your password : ");
        myAcc.set_pass(sc.nextLine()); 

        @@System.out.println("Your user name is : " + myAcc.username);
    }
}

class BankAcc{
    public String username = "username";
    private String password = "password";

    void set_usrname(String usrname){
        this.username = usrname;
    }
    void set_pass(String pass){
        this.password = pass;
    }
    String get_pass(){
        return this.password;
    }
}


```


#### Short summary: 

empty definition using pc, found symbol in pc: java/lang/System#