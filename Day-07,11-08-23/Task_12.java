import java.util.*;
public class Task_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        String str_1="";
        String[] array = null;     
        array = str.split(" ");
        int len = array.length;
        for (int i = len-1; i >=0 ; i--) {
            str_1 = str_1+array[i]+" ";
            
        }
        System.out.println(str_1);
       sc.close();
    }
}
