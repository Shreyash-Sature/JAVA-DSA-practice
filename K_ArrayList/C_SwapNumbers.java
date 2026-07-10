import java.util.ArrayList;
public class C_SwapNumbers {

    public static void SwapBaby(ArrayList<Integer> list, int idx1,int idx2){

        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);
        System.out.println("Updated list : "+ list);
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

        int idx1 = 2;
        int idx2 = 5;
        System.out.println("List : "+ list);
        SwapBaby(list, idx1, idx2);
    }
}
