public class A_ClassNObjects {
    public static void main(String args[]){
        //created a new object pen
        Pen p1 = new Pen();

        // set color of p1
        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setTip(23);
        System.out.println(p1.tip_size);

    }
}

class Pen{
    String color;
    int tip_size;

    void setColor(String newColor){
        color = newColor;

    }
    void setTip(int newTip){
        tip_size = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calPercentage(int phy, int chem, int maths){
        percentage = (phy + chem + maths)/3;
    }
    

}
