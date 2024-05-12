package chapter4;

import java.util.stream.IntStream;

public class ArrayUtils {
    public static int sumElements(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        return array[0] + sumElements(ArrayUtils.removeFirstElement(array));
    }

    public static int countElements(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        return 1 + countElements(ArrayUtils.removeFirstElement(array));
    }

    public static Integer findHighestElement(int[] array) {
        if (array.length == 1) {
            return array[0];
        }

        Integer highest = findHighestElement(ArrayUtils.removeFirstElement(array));
        return array[0] > highest ? array[0] : highest;
    }

    public static Integer binarySearch(int[] array, int value) {
        return binarySearch(array, value, 0, array.length - 1);
    }

    private static Integer binarySearch(int[] array, int value, int low, int high) {
        int middle = (low + high)/2;

        int aux = array[middle];

        if (high == low && aux != value) {
            return null;
        }

        if (aux == value) {
            return middle;
        } else if (value > aux) {
            return binarySearch(array, value, middle+1, high);
        } else {
            return binarySearch(array, value, low, middle);
        }
    }

    public static int[] generateArray(Integer length) {
        int[] array = new int[length];

        IntStream.range(0, length).forEach(i -> {
            array[i] = (int) (Math.random() * length);
        });

        return array;
    }

    public static int[] removeFirstElement(int[] array) {
        int[] newArray = new int[array.length-1];

        // Could use `System.arraycopy(array, 1, newArray, 0, array.length - 1);` instead
        for (int i = 1; i < array.length; i++) {
            newArray[i-1] = array[i];
        }

        return newArray;
    }
}
