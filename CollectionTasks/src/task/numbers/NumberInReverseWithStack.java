package task.numbers;

import task.InputHelper;

import java.util.*;

public class NumberInReverseWithStack {

    public static void main(String[] args) {
        char[] chars = InputHelper.getCharArrayFromInputNumber();
        Stack<Integer> stack = new Stack();
        for (int i = 0; i < chars.length; i++) {
            stack.push(Character.getNumericValue(chars[i]));
        }
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }
    }

}
