import java.util.ArrayList;
import java.util.Collections;
public class D_SortingArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(13);
        list.add(23);
        list.add(14);
        list.add(35);
        list.add(51);
        list.add(91);
        list.add(11);

        System.out.println("ArrayList before sorting : "+list);

        // Sorting in ascending order
        Collections.sort(list);
        System.out.println("ArrayList in ascending order : "+ list);

        // Descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("ArrayList in descending order : "+list);
    }
    
}
