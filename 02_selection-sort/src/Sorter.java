public class Sorter {

    public static Integer[] selectionSort(Integer[] array) {
        Integer[] orderedArray = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {
            int lowest = findLowestValue(array);
            removeFirst(array, lowest);
            orderedArray[i] = lowest;
        }

        return orderedArray;
    }

    private static Integer findLowestValue(Integer[] array) {
        Integer lowest = null;
        for (Integer integer : array) {
            if (integer != null) {
                if (lowest == null || integer < lowest) {
                    lowest = integer;
                }
            }
        }
        return lowest;
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
