
import java.util.Scanner;

public class Task_16 {
    public static int meth(int num_1, int num_2) {
        if (num_2 < num_1 || num_2 > num_1 * 6) {
            return 0;
        }

        if (num_1 == 1 || num_2 == 0) {
            return 1;
        }

        int num_4 = 0;
        for (int i = 1; i <= 6; i++) {

            num_4 = num_4 + meth(num_1 - 1, num_2 - i);
        }
        return num_4;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dice roll: ");
        int num_1=sc.nextInt();

        System.out.print("Enter the outcome: ");
        int num_2 = sc.nextInt();

        int num_3 = meth(num_1, num_2);
        System.out.println("output : " + num_3);

        sc.close();
    }

}