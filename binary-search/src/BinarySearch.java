public class BinarySearch {
    public static Integer binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middle = (high + low) / 2;
            System.out.printf("low: %d, middle: %d, high: %d\n", low, middle, high);

            if (array[middle] == key) {
                return middle;
            } else if (array[middle] > key) {
                high = middle - 1;
            } else if (array[middle] < key) {
                low = middle + 1;
            }
        }
        return null;
    }
}
