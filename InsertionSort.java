import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] tempArr = { 1, 4, 5, 3, 6, 7, 8, 3, 2, 5 };
        System.out.println(Arrays.toString(selectionSort(tempArr)));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentValue = arr[i];
            int j = i - 1;
            while (j > -1 && arr[j] > currentValue) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = currentValue;
        }
        return arr;
    }
}