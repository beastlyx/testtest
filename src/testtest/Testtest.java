package testtest;
import java.util.*;

public class Testtest {
    public static void main(String[] args) {
        int[] a = {21, 16, 3, 7, 23, 12};
        
        for (int i = 1; i < 6; i++) {
            for (int j = i; j > 0 && a[j] < a[j-1]; j--) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
            
            System.out.printf("i = %d: \n", i);
            printArr(a);
            System.out.println();
        }
    }
    
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("]");
    }
}
