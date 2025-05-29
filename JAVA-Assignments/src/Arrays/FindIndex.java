package Arrays;
import java.util.*;
public class FindIndex {
    static void arrIndex(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++)
            if (n == arr[i]) {
                System.out.println(n + " is at index " + i);
                return;
            }
    }

    public static void main(String[] args) {
        int index;
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.print("Select any value to find Index of array : ");
        Scanner sc = new Scanner(System.in);
        index = sc.nextByte();
        arrIndex(arr, index);
        sc.close();
    }
}