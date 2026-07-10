import java.util.ArrayList;
public class B_MaxElement {

    public static void MaxElement(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<list.size(); i++){
            int element = list.get(i) ;
            if(element >max){
                max = element;
            }
        }
        System.out.println("Max Element is : " + max);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(14);
        list.add(35);
        list.add(51);
        list.add(91);
        list.add(11);

        MaxElement(list);
    }
}
