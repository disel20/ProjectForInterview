package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumMoves {

    public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
        int aLength = arr1.size();
        int counter = 0;

        if (arr1.size() != arr2.size()) {
            throw new RuntimeException("Make sure both arrays have equal elements");
        }

        for (int i = 0; i < aLength; i++) {
            String as = String.valueOf(arr1.get(i));
            String bs = String.valueOf(arr2.get(i));
            for (int c = 0; c < as.length(); c++) {
                int aValue = Integer.parseInt(Character.toString(as.charAt(c)));
                int bValue = Integer.parseInt(Character.toString(bs.charAt(c)));
                if (aValue > bValue) {
                    counter += aValue - bValue;
                } else {
                    counter += bValue - aValue;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(123);
        List<Integer> arr2 = new ArrayList<Integer>();
        arr1.add(321);

        minimumMoves(arr1,arr2);
    }
}
