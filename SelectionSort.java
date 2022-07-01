import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] tempArr = { 1, 3, 5, 2, 3, 6, 7, 4, 8, 23 };
        System.out.println((Arrays.toString(selectionSort(tempArr))));
    }

    public static int[] selectionSort(int[] arr) {
        int index;
        for (int i = 0; i < arr.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;

        }
        return arr;
    }

}