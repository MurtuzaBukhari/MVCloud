import java.util.*;

public class Task_9_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        // System.out.println(str.charAt(2));
        String[] Array = null;
        
        
        Array = str.split(" ");
        System.out.println("Enter Number From 0 To "+(Array.length-1));
        int num = sc.nextInt();
        System.out.println(Array[num]);
        sc.close(); 
    }
}
