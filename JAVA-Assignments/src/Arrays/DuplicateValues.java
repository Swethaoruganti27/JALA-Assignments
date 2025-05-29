package Arrays;
import java.util.Arrays;
public class DuplicateValues {
    static void duplicateValues(int[] arr) {
        System.out.println("Duplicate values : ");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] == arr[j] && (i != j))) {
                    System.out.print(arr[j] + " ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] my_arr = {11, 22, 33, 44, 55, 22, 44, 33};
        System.out.println("my_arr[] = " + Arrays.toString(my_arr));
        duplicateValues(my_arr);
    }
}
