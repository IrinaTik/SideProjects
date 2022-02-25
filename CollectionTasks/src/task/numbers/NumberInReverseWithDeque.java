package task.numbers;

import task.InputHelper;

import java.util.ArrayDeque;
import java.util.Deque;

public class NumberInReverseWithDeque {

    public static void main(String[] args) {
        char[] chars = InputHelper.getCharArrayFromInputNumber();
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < chars.length; i++) {
            stack.addFirst(Character.getNumericValue(chars[i]));
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.removeFirst());
        }
    }
}
