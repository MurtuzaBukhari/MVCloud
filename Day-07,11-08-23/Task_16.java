import java.util.Scanner;

public class Task_16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of dice: ");
        int num_1 = scanner.nextInt();

        System.out.print("Enter the outcome: ");
        int num_2 = scanner.nextInt();

        int[][] array = new int[num_1 + 1][num_2 + 1];
        array[0][0] = 1;

        for (int i = 1; i <= num_1; i++) {
            for (int j = 1; j <= num_2; j++) {
                for (int k = 1; k <= 6 && k <= j; k++) {
                    array[i][j] = array[i][j] + array[i - 1][j - k];
                }
            }
        }

        System.out.println("Output"+ array[num_1][num_2]);

        scanner.close();
    }
}