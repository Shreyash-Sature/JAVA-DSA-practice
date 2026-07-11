/*
Encapsulation is the process of binding data (variables) and methods (functions) together into a single unit (class) 
and restricting direct access to the data by making it private.

-GETTERS : Used to read a private variable.
-SETTERS : Used to modify a private variable.
 */
import java.util.*;
class BankAccount{

        private double balance; //balance varable to store balance

        public void deposit(double amount){ //function to deposit balance
            if(amount>0){
                balance +=amount;
                System.out.println(amount+" deposited successfully!");
            }
            else{
                System.out.println("Invalid Deposit Amount!");
            }
        }
        public void withdraw(double amount){
            if(amount<=0){
                System.out.println("Invalid withdraw amount!");
            }
            else if(amount<=balance){
                balance-=amount;
                System.out.println(amount+" withdrawen successfully!");
            }
            else{
                System.out.println("Insufficient Balance!");
            }
        }

        public double getBalance(){ //getter function to get balance (balance is private)
            return balance;
        }
    }

public class D_Encapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();
        while(true){
            System.out.print("\nEnter number according to service you want ");
            System.out.println("\n1.Check Bank Balance ");
            System.out.println("2.Deposit Money ");
            System.out.println("3.Withdraw money");
            System.out.println("4.Exit");
            String line = "----------****----------";
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println(line);
                    System.out.println("Balance: "+acc.getBalance());
                    System.out.println(line);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depo= sc.nextDouble();
                    System.out.println(line);
                    acc.deposit(depo);
                    System.out.println("Current Balance: " + acc.getBalance());
                    System.out.println(line);
                    break;
                case 3:
                    System.out.print("Enter amount to be withdrawed: ");
                    double withd = sc.nextDouble();
                    System.out.println(line);
                    acc.withdraw(withd);
                    System.out.println("Current Balance: " + acc.getBalance());
                    System.out.println(line);
                    break;
                case 4:
                    System.out.println("Thank you!");
                    System.out.println(line);
                    sc.close();
                    return;
                
                default:
                    System.out.println("Invalid choice!");
            }

        }
    
        
    }
}
