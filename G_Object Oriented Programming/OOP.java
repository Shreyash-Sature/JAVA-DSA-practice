public class OOP {

    public static void main(String[] args) {
        // create a new p1 object
        Pen p1 = new Pen();
        System.out.println("Before Setting (Default) : "+p1.get_tip_size());
        p1.set_tip_size(0.7);
        System.out.println("After setting : " + p1.get_tip_size());

    }
    
}

class Pen{
    private String color = "Yellow";
    private double tip_size = 0.5;

    void set_tip_size(double tip_size){
        this.tip_size = tip_size;
    }
    double get_tip_size(){
        return this.tip_size;
    }
}
