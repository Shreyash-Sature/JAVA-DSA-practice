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

        System.out.println("Your user name is : " + myAcc.username);
        System.out.println("Your password is : " + myAcc.get_pass());
    }
}

class BankAcc{
    public String username = "username";
    private String password = "password";

    public void set_usrname(String usrname){
        this.username = usrname;
    }
    public void set_pass(String pass){
        this.password = pass;
    }
    public String get_pass(){
        return this.password;
    }
}

