import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    private final static Scanner KEYBOARD = new Scanner(System.in);

    public static void main(String[] args) {
        int size = readIntFromKeyboard("Insert array size: ");

        Integer[] array = generateArray(size);
        System.out.println("Unordered array: " + Arrays.toString(array));

        array = Sorter.selectionSort(array);
        System.out.println("Ordered array: " + Arrays.toString(array));
    }

    private static Integer[] generateArray(int size) {
        Integer[] array = new Integer[size];

        IntStream.range(0, size).forEach(i -> {
            array[i] = (int) (Math.random() * size);
        });

        return array;
    }

    private static int readIntFromKeyboard(String inputText) {
        System.out.print(inputText);
        return KEYBOARD.nextInt();
    }
}