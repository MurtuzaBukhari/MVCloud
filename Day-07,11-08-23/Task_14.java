public class Task_14 {
    public static void main(String[] args) {
        // String[] str = new String[5];
        // for (int i = 0; i < str.length; i++) {
        // System.out.println(str[i]);
        // }
        String str = null;
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.print("NullPointerException Caught");
        }

    }

}
