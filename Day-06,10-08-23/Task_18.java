import java.util.Scanner;

public class Task_18 {

    public static String encryptData(String inputStr, int shiftKey) {

        inputStr = inputStr.toLowerCase();

        String encryptStr = "";

        for (int i = 0; i < inputStr.length(); i++) {

            char ch = inputStr.charAt(i);

            ch += shiftKey;
            
            encryptStr += ch;
        }

        return encryptStr;
    }

    public static String decryptData(String inputStr, int shiftKey) {

        inputStr = inputStr.toLowerCase();

        String decryptStr = "";

        for (int i = 0; i < inputStr.length(); i++) {

            char pos = inputStr.charAt(i);

            pos -= shiftKey;

            decryptStr += pos;
        }

        return decryptStr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string for encryption using Caesar Cipher: ");
        String inputStr = sc.nextLine();

        System.out.println("Enter the value by which each character in the plaintext message gets shifted: ");
        int shiftKey = Integer.valueOf(sc.nextLine());

        System.out.println("Encrypted Data ===> " + encryptData(inputStr, shiftKey));
        System.out.println("Decrypted Data ===> " + decryptData(encryptData(inputStr, shiftKey), shiftKey));

        sc.close();
    }
}