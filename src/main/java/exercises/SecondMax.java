package exercises;

import java.lang.reflect.Array;

public class SecondMax {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 0, 4, 6, 6};
        int arr2[] = {1};
        int arr3[] = {-5, -4, -3, 0, 0};
        System.out.println(secondMax(arr3));
    }

    public static int secondMax(int array[]) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int second = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] > second && array[j] != max) {
                second = array[j];
            }
        }

        return second;
    }
}
