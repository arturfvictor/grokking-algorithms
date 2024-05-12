import chapter4.ArrayUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Insert array lenth: ");
        int length = scanner.nextInt();

        int[] array = ArrayUtils.generateArray(length);
        System.out.println("Array: " + Arrays.toString(array));

        System.out.println("4.1 - Sum array elements recursively: " + ArrayUtils.sumElements(array));
        System.out.println("4.2 - Count array element recursively: " + ArrayUtils.countElements(array));
        System.out.println("4.3 - Find highest element recursively: " + ArrayUtils.findHighestElement(array));

        Arrays.sort(array);
        System.out.println("Ordered Array: " + Arrays.toString(array));

        System.out.print("Which value do you wanna find: ");
        int searchFor = scanner.nextInt();
        System.out.println("4.4 - Recursive binary search: " + ArrayUtils.binarySearch(array, searchFor));
    }
}