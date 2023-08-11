import java.util.*;
public class Task_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int num_n = sc.nextInt();
        System.out.println("Enter r");
        int num_r = sc.nextInt();

        int n = 1;
        int r = 1;
        int n_r = 1;
        int min = num_n - num_r;
        for (int i = 1; i <= num_n; i++) {
            n = n*i;
        }
        for (int j = 1; j <= num_r; j++) {
            r = r*j;
        }
        for (int j = 1; j <= min; j++) {
            n_r = n_r*j;
        }
        System.out.println("n! = "+n);
        System.out.println("r! = "+r);
        System.out.println("(n-r)! = "+n_r);

        // combination

        int comb = n/(n_r*r);

        // permutation
        int perm = n/n_r;

        System.out.println("combination : "+comb+"  permutation : "+perm);
        sc.close();
    }
}
