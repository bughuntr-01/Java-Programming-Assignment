package Assignment_1;

import java.util.Scanner;
public class Remove_a_Character_From_String {
    static String remove(String s, int n,char ch){
        if( n == s.length()){
            return "";
        }
        if(s.charAt(n) == ch){
            return remove(s, n+1,ch);
        }
        return s.charAt(n) + remove(s,n+1,ch);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = sc.next();
        System.out.print("Enter the character you want to remove: ");
        char ch = sc.next().charAt(0);

        System.out.println(remove(s, 0, ch));
    }
}
