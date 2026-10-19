package Assignment_1;
import java.util.Scanner;

public class Find_Maximum_Element_in_Array {
    static int maximum(int[] arr,int n){
        if(n == arr.length - 1){
           return arr[n];
        }
        int max = maximum(arr, n + 1);

        if(arr[n]>max){
            return arr[n];
        }
        else{
            return max;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter the elements of an Array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println(maximum(arr, 0));
    }
}
