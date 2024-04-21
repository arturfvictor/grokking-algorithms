import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    private final static Scanner KEYBOARD = new Scanner(System.in);

    public static void main(String[] args) {
        int arraySize = readIntFromKeyboard("Insert the array size: ");
        int searchingFor = readIntFromKeyboard("Insert the number that you are looking for: ");

        int[] array = generateArray(arraySize);

        Integer result = BinarySearch.binarySearch(array, searchingFor);
        if (result == null) {
            System.out.println("The selected number was not found!");
            return;
        }

        System.out.println("The selected number was found on position: " + result);
    }

    private static int[] generateArray(int size) {
        return IntStream.range(0, size).toArray();
    }

    private static int readIntFromKeyboard(String inputText) {
        System.out.print(inputText);
        return KEYBOARD.nextInt();
    }
}