public class Task_17 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("This is StringBuffer_0");
        System.out.println(str);
        // using Delete Method

        System.out.println(str.delete(0, str.length()));

        // using setLength
        StringBuffer str1 = new StringBuffer("This is StringBuffer_1");
        System.out.println(str1);
        str1.setLength(0);
        System.out.println(str1);

        // Createing New object
        StringBuffer str2 = new StringBuffer("This is StringBuffer_2");
        System.out.println(str2);
        str2 = new StringBuffer();
        System.out.println(str2);
    }
}
