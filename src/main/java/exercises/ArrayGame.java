package exercises;

import java.util.List;

public class ArrayGame {

    //Jessica has an array, numbers, consisting od n integers. She plays a game
    //countMoves
    public static long countMoves(List<Integer> numbers) {
        long arraySum, smallest, arr_size = numbers.size();
        arraySum = 0;
        smallest = numbers.get(0);
        for (int i = 0; i < arr_size ; i ++)
        {
            /* If current element is smaller than
               update smallest */
            if (numbers.get(i) < smallest)
                smallest = numbers.get(i);

            /*find array sum */
            arraySum += numbers.get(i);
        }

        long minOperation = arraySum - arr_size * smallest;

        return minOperation;
    }
}
