import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task_3 {
    public static void main(String[] args) {
        // 98,32,72,94,75,73,92,36,28,34

        List<Integer> list = new ArrayList<Integer>();
        list.add(0, 98);
        list.add(1, 32);
        list.add(2, 72);
        list.add(3, 94);
        list.add(4, 75);
        list.add(5, 73);
        list.add(6, 92);
        list.add(7, 36);
        list.add(8, 28);
        list.add(9, 34);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list.get(1));

    }
}
