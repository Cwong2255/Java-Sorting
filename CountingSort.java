import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] testArr = { 1, 4, 1, 2, 7, 5, 2, 0, 0, 0, 0, 0 };
        System.out.println(Arrays.toString(countingSort2(testArr)));
    }

    public static int[] countingSort(int[] arr) {
        int maximum = Integer.MIN_VALUE;
        for (int val : arr) {
            maximum = Math.max(maximum, val);
        }
        int[] map = new int[maximum + 1];
        for (int val : arr) {
            map[val]++;
        }

        int index = 0;
        for (int i = 0; i < map.length; i++) {
            if (map[i] != 0) {
                while (map[i] != 0) {
                    arr[index++] = i;
                    map[i]--;
                }
            }
        }
        return arr;
    }

    public static int[] countingSort2(int[] arr) {
        int maximum = Integer.MIN_VALUE;
        for (int val : arr) {
            maximum = Math.max(val, maximum);
        }

        int[] map = new int[maximum + 1];
        int[] res = new int[arr.length];
        for (int val : arr) {
            map[val]++;
        }
        for (int i = 1; i < map.length; i++) {
            map[i] += map[i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            res[map[arr[i]] - 1] = arr[i];
            map[arr[i]]--;
        }
        return res;
    }

}