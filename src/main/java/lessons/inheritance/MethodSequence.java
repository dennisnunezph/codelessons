package lessons.inheritance;

/**
 * Created by dennis on 10/18/16.
 */
public class MethodSequence extends Parent{

    public static void main(String[] args){
        MethodSequence methodSequence = new MethodSequence();
        methodSequence.method2();
    }

    public void method1()
    {
        System.out.println("Childs method1()");
    }
}

class Parent
{
    private void method1()
    {
        System.out.println("Parent's method1()");
    }
    public void method2()
    {
        System.out.println("Parent's method2()");
        method1();
    }
}