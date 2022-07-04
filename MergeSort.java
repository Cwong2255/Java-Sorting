import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] tempArr = { 1, 5, 43, 6, 7, 8, 5, 3, 23, 6, };
        mergeSort(tempArr);
        System.out.println(Arrays.toString(tempArr));
    }

    public static void mergeSort(int[] arr) {

        if (arr.length < 2) {
            return;
        }
        int middleIndex = arr.length / 2;
        int[] left = new int[middleIndex];
        int[] right = new int[arr.length - middleIndex];
        for (int i = 0; i < middleIndex; i++) {
            left[i] = arr[i];
        }
        for (int i = middleIndex; i < arr.length; i++) {
            right[i - middleIndex] = arr[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

}