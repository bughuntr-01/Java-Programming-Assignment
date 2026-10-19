
package Assignment_1;

import java.util.Scanner;

public class Count_Occurrences_of_a_Character {

    static int countOccurr(String str, char ch) {
        if (str.length() == 0) {
            return 0;
        }

        if (str.charAt(0) == ch) {
            return 1 + countOccurr(str.substring(1), ch);
        }

        return countOccurr(str.substring(1), ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter a character to count occurrences: ");
        char ch = sc.next().charAt(0);

        System.out.println(countOccurr(str, ch));

    }
}
