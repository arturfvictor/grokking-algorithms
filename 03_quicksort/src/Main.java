import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert array length: ");
        int length = scanner.nextInt();

        int[] array = new int[length];
        IntStream.range(0, length).forEach(i ->
                array[i] = (int) (Math.random() * i)
        );

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Sorted array: " + Arrays.toString(QuickSort.sort(array)));
    }
}