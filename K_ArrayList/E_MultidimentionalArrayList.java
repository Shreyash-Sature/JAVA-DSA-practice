import java.util.ArrayList;
public class E_MultidimentionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(11); list1.add(14); list1.add(11); list1.add(21);
        mainList.add(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(43); list2.add(53); list2.add(49); list2.add(44); list2.add(93);
        mainList.add(list2);

        System.out.println(mainList);
    }
    
}
