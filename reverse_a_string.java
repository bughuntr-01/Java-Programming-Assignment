package Assignment_1;

import java.util.Scanner;
public class reverse_a_string {
    
    static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversedStr = reverseString(str);
        System.out.println("Reversed string: " + reversedStr);
    }
}
