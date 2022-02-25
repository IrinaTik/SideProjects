package task.string;

import task.InputHelper;

import java.util.ArrayDeque;
import java.util.Deque;

import static task.string.Brackets.*;

public class StringWithBrackets {

    public static void main(String[] args) {
        char[] chars = InputHelper.getCharArrayFromInputString();
        Deque<Character> stack = new ArrayDeque<>();

        boolean rightSequence = true;
        int i = 0;
        while ((i < chars.length)&&(rightSequence)) {
            char charElement = chars[i];
            i = i + 1;
            if ((charElement == ROUND_BEGIN.label) || (charElement == SQUARE_BEGIN.label) || (charElement == CURVED_BEGIN.label)) {
                stack.addFirst(charElement); //push()
                continue;
            }

            switch (Brackets.fromValue(charElement)) {
                case ROUND_END:
                    rightSequence = peekAndPop(ROUND_END, stack);
                    break;
                case CURVED_END:
                    rightSequence = peekAndPop(CURVED_END, stack);
                    break;
                case SQUARE_END:
                    rightSequence = peekAndPop(SQUARE_END, stack);
                    break;
                default:
                    System.out.println("Input string should contain only brackets!");
            }
        }
        if (rightSequence) {
            System.out.println("Nice!");
        } else {
            System.out.println("WRONG!");
        }
    }

    private static boolean peekAndPop(Brackets bracket, Deque<Character> stack) {
        if ((!stack.isEmpty())&&(stack.peekFirst() == bracket.opposite().label)) { //peek()
            stack.removeFirst(); //pop()
            return true;
        }
        return false;
    }
}
