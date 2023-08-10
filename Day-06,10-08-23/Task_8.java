import java.util.ArrayList;
import java.util.List;

public class Task_8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(0, 1);
        list.add(1, 3);
        list.add(2, 4);
        list.add(3, 7);
        list.add(4, 11);
        list.add(5, 18);
        list.add(6, 29);

        for (int i : list) {
            if (i%2 == 0) {
                System.out.println("List Contain An Even Number ");
                break;
            }
            // else{
            //     System.out.println("List Does Not Contain An Even Number");
            // }
        }
    }
}
