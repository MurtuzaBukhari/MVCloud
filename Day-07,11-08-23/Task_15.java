import java.util.*;
public class Task_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number To Check Armstrong ");
        String str = sc.nextLine();
        double sum = 0;
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            double j =Integer.parseInt(String.valueOf(ch));
             double mul = Math.pow(j, len);
             sum = sum + mul;
        }
        double d=Double.parseDouble(str);
        if (sum == d) {
            System.out.println("Number Is Armstrong");
        }
        else{
            System.out.println("Number Is Not Armstrong");
        }
        sc.close();
    }
}