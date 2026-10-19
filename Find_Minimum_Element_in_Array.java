package Assignment_1;

import java.util.Scanner;
public class Find_Minimum_Element_in_Array {
    static int minimum(int[] arr, int n){
        if(n == arr.length - 1){
            return arr[n];
        }
        int min = minimum(arr, n + 1);

        if(arr[n]>min){
            return min;
        }
        else{
            return arr[n];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int []  arr = new int[n];
        
        for(int i = 0;i<n;i++){
            System.out.print("Enter the elements of the array: ");
            arr[i] = sc.nextInt();
        }

        System.out.println(minimum(arr, 0));

    }
}
