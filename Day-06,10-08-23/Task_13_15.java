import java.util.*;
public class Task_13_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Decimal Number");
        double doub = sc.nextDouble();
        // System.out.println(doub);

        String str = Double.toString(doub);
        int len = str.length();
        String  str1 = "";
        for (int i = len-1; i >=0 ; i--) {
            str1 = str1+str.charAt(i);
        }
        double doub2 = Double.parseDouble(str1);
        System.out.println(doub2);
        sc.close(); 
    }
}
