import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 346, 37, 234, 234, 346, 457, 1, 2, 4, 65, 346, 37, 234, 124, 52, 457, 568, 568 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = new Random().nextInt(high - low) + low;
        swap(arr, pivotIndex, high);
        int pivot = arr[high], left = low, right = high;
        while (left < right) {
            while (arr[left] <= pivot && left < right) {
                left++;
            }
            while (arr[right] >= pivot && left < right) {
                right--;
            }
            swap(arr, left, right);
        }

        swap(arr, left, high);
        quickSort(arr, low, left - 1);
        quickSort(arr, left + 1, high);

    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}