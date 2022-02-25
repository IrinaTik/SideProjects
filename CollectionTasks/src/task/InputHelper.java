package task;

import java.util.Scanner;

public class InputHelper {

    private static final Scanner scanner = new Scanner(System.in);

    private static int inputNumber() {
        int inputNumber;
        while (true) {
            try {
                System.out.print("Input a number: ");
                inputNumber = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid. Try again.");
                scanner.next();
            }
        }
        return inputNumber;
    }

    private static String inputString() {
        System.out.print("Input a string: ");
        return scanner.nextLine();
    }

    public static char[] getCharArrayFromInputString() {
        return String.valueOf(inputString()).toCharArray();
    }

    public static char[] getCharArrayFromInputNumber() {
        return String.valueOf(inputNumber()).toCharArray();
    }
}
