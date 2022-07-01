import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] intArr = { 1, 3, 4, 5, 3, 4, 643, 235, 23, 12, 12, 5623, 645, 8, 65 };
        System.out.println(Arrays.toString(bubbleSort(intArr)));
    }

    public static int[] bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

}