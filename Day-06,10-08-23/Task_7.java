import java.util.*;
public class Task_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int num_1 = sc.nextInt();
        System.out.println("Enter Number 2");
        int num_2 = sc.nextInt();
        System.out.println("Before Swapping");
        System.out.println("NUMBER 1 :"+num_1+" NUMBER 2 :"+num_2);
        num_1 = num_1+num_2;
        num_2 = num_1-num_2;
        num_1=num_1-num_2;
        System.out.println("After Swapping");
        System.out.println("NUMBER 1 :"+num_1+" NUMBER 2 :"+num_2);
        sc.close(); 
    }
}
