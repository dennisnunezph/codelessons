package lessons.inheritance;

class Base
{
    int i = 99;
    public void amethod()
    {
        System.out.println("Base.amethod()");
    }

    Base()
    {
        amethod();
    }
}
public class Derived extends Base
{
    int i = -1;

    public static void main(String argv[])
    {
        Base b = new Derived();
        System.out.println(b.i);
        b.amethod();
    }

    public void amethod()
    {
        System.out.println("Derived.amethod()");
    }
}
