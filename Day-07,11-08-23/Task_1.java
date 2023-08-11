import java.util.*;
public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ') {
                continue;
            }
            else{
                System.out.print(str.charAt(i));
            }
        }
        sc.close();
    }
}
