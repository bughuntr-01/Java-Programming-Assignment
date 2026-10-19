package Assignment_1;
import java.util.Scanner;
public class Replace_a_Character_in_String {
    static String replace(String s, int n, char ch,char c){
        if(n == s.length()){
            return "";
        }
        if(s.charAt(n) == ch){
            return c + replace(s,n+1,ch,c);
        }
        return s.charAt(n) + replace(s,n+1,ch,c);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.next();
        
        System.out.print("Enter a character you want to change: ");
        char ch = sc.next().charAt(0);

        System.out.print("Enter a character you want to add: ");
        char c = sc.next().charAt(0);

        System.out.println(replace(s, 0, ch, c));
    }
}
