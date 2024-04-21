public class Sorter {

    public static Integer[] selectionSort(Integer[] array) {
        Integer[] orderedArray = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            int highest = findHighestValue(array);
            removeFirst(array, highest);
            orderedArray[i] = highest;
        }

        return orderedArray;
    }

    private static Integer findHighestValue(Integer[] array) {
        Integer highest = null;
        for (Integer integer : array) {
            if (integer != null) {
                if (highest == null || integer > highest) {
                    highest = integer;
                }
            }
        }
        return highest;
    }

    private static void removeFirst(Integer[] array, int toBeRemoved) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i] == toBeRemoved) {
                array[i] = null;
                break;
            }
        }
    }
}
