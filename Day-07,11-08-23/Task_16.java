
import java.util.Scanner;

public class Task_16 {
    public static int countWays(int num_1, int num_2) {
        if (num_2 < num_1 || num_2 > num_1 * 6) {
            return 0;
        }

        if (num_1 == 1 || num_2 == 0) {
            return 1;
        }

        int ways = 0;
        for (int i = 1; i <= 6; i++) {
            ways += countWays(num_1 - 1, num_2 - i);
        }
        return ways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of dice: ");
        int num_1=sc.nextInt();

        System.out.print("Enter the desired outcome: ");
        int num_2 = sc.nextInt();

        int waysToGetOutcome = countWays(num_1, num_2);
        System.out.println("Number of ways to get the outcome: " + waysToGetOutcome);

        sc.close();
    }

}