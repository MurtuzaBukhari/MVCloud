import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.*;
public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many char you have to input ");
        int num = sc.nextInt();
        List<String> list = new ArrayList<String>();
        for (int i = 0; i < num; i++) {
            System.out.println("At index "+i+" enter Char ");
            list.add(i, sc.nextLine());
        }
        Collections.sort(list);
        for (String string : list) {
            System.out.println(string);
        }
        sc.close();
    }
}
