package lessons.stack;

import java.util.Stack;

/**
 * Created by dennis on 4/1/16.
 */
public class StackReversal<E> {

    public static void main(String[] args) {
        Stack<Integer> stack =  new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(3);
        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }

    public static <E> void reverseStack(Stack<E> stack){
        if(stack.isEmpty()){
            return;
        }
        E e  = stack.pop();
        reverseStack(stack);
        addBottom(stack, e);
    }
    private static <E> void addBottom(Stack<E> stack, E e){
        if(stack.isEmpty()){
            stack.push(e);
            return;
        }
        E temp  = stack.pop();
        addBottom(stack, e);
        stack.push(temp);
    }
}