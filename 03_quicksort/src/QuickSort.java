import java.util.Arrays;

public class QuickSort {

    public static int[] sort(int[] array) {
        if (array.length < 2) {
            return array;
        }

        int aux = array[0];

        int[] pivot = Arrays.stream(array).filter(el -> el == aux).toArray();
        int[] lower = Arrays.stream(array).filter(el -> el < aux).toArray();
        int[] higher = Arrays.stream(array).filter(el -> el > aux).toArray();

        return concat(sort(lower), pivot, sort(higher));
    }

    private static int[] concat(int[] lower, int[] pivot, int[] higher) {
        int length = lower.length + pivot.length + higher.length;

        int[] newArray = new int[length];

        for (int i = 0; i < length; i++) {
            if (i < lower.length) {
                newArray[i] = lower[i];
            } else if (i < lower.length + pivot.length) {
                newArray[i] = pivot[i - lower.length];
            } else {
                newArray[i] = higher[i - (lower.length + pivot.length)];
            }
        }

        return newArray;
    }
}
