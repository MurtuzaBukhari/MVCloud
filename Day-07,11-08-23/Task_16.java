import java.util.*;

public class Task_16 {
    public static void main(String[] args) {
        // int count=0;
        // for (int i = 1; i <=6; i++) {
        // for (int j = 1; j <=6; j++) {
        // if( i+j == 7){
        // count++;
        // }
        // }
        // }
        // System.out.println(count);

        Random ram = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("the number of dice rolled");
        int num_1 = sc.nextInt();
        System.out.println("the outcome of the roll");
        int num_2 = sc.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < num_1; i++) {
            int num = ram.nextInt(1,7);
            sum = sum + num;
            System.out.println(num);
            if (sum == num_2) {
                count++;
            }
        }
        System.out.println(count);

    }
}
