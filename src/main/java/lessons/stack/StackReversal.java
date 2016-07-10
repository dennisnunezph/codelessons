package lessons.stack;

import java.util.Stack;

/**
 * Created by dennis on 4/1/16.
 */
public class StackReversal<E> {

    public static void main(String[] args) {
        Stack<Integer> stack =  new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack);
        reverseStack(stack);
        System.out.println(stack);
    }

    public static <E> void reverseStack(Stack<E> stack){
       // System.out.println("reverseStack - " + stack);
        if(stack.isEmpty()){

            return;
        }
        E e  = stack.pop();
       // System.out.println("reverseStack pop stack - " + e);
        reverseStack(stack);
        System.out.println("");
        System.out.println("passing to addBottom - " + stack + " E " + e);
        System.out.println("end addbottom");
        addBottom(stack, e);
    }
    private static <E> void addBottom(Stack<E> stack, E e){
        System.out.println("");
        System.out.println("accepting to addBottom - " + stack + " E " + e);
        if(stack.isEmpty()){
            stack.push(e);
            System.out.println("Return result stack - " + stack + " adding " + e);

            return;
        }
        E temp  = stack.pop();
        System.out.println("addBottom pop stack " + stack + " e - new " + e);
        addBottom(stack, e);
        stack.push(temp);
    }
}