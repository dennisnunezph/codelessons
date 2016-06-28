package lessons.generics;

/**
 * Created by dennis on 3/29/16.
 */
public class  Fish extends SeaAnimal
{

    private int mAge;

    public Fish(int aAge)
    {
        mAge = aAge;
    }

    @Override
    public void breathUnderWater()
    {

    }


    @Override
    public void move()
    {

    }

    @Override
    public int getAge()
    {
        return mAge;
    }

}
