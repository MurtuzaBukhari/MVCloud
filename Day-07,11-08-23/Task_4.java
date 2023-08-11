public class Task_4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                // System.out.print("*");
                if (i == 2) {
                    if (j == 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                } else if (i == 3) {
                    if (j == 1) {
                        System.out.print(" ");
                    } else if (j == 2) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }

                else {
                    System.out.print("*");
                }

            }
            System.out.print("\n");
        }
    }
}
