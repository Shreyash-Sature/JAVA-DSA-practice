import java.util.*;
public class B_Input_Output_Update_ofArray {

    public static void Input_Arr(int marks[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enters marks of English :");
        marks[0]= sc.nextInt();
        System.out.print("Enters marks of Physics :");
        marks[1]= sc.nextInt();
        System.out.print("Enters marks of Maths :");
        marks[2]= sc.nextInt();
    }

    public static void Output_Arr(int marks[]){
        System.out.println("English Marks : "+ marks[0]);
        System.out.println("Physics Marks : "+ marks[1]);
        System.out.println("Maths Marks : "+ marks[2]);

    }
    public static void Update_Arr(int marks[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enters updated marks of English :");
        marks[0]=sc.nextInt();
        System.out.println("Updated English Marks : "+ marks[0]);

    }

    public static void main(String[] args) {
        int marks[]=new int[5];

        System.out.println("Length of Array is : " + marks.length);

        Input_Arr(marks);
        Output_Arr(marks);
        Update_Arr(marks);


    }
    
}
