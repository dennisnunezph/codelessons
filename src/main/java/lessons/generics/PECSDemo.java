package lessons.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dennis on 3/29/16.
 */
public class PECSDemo {

    public static void main(String[] args) {

        /**
        List<? extends Animal> animals;
        animals = new ArrayList<Animal>();
        animals = new ArrayList<SeaAnimal>();
        animals = new ArrayList<Fish>();

        Animal a = new Fish(150);

        Animal animal = produceSeaAnimal(); //ok
        SeaAnimal seaAnimal = produceSeaAnimal(); //ok
        Fish fish = (Fish) produceSeaAnimal(); //Error - downcast
        //i

        List<Animal> animalsList = new ArrayList<Animal>();
        produceSomeSeaAnimals(animalsList);
        List<SeaAnimal> seaAnimals = new ArrayList<SeaAnimal>();
        produceSomeSeaAnimals(seaAnimals);

        List<SeaAnimal> seaAnimals = new ArrayList<>();
        seaAnimals.add(produceSeaAnimal());

        List<SeaAnimal> oldAnimals = new ArrayList<>();
        oldAnimals.add(produceSeaAnimal());

        getOldSeaAnimals(seaAnimals, oldAnimals);
        */
        List<SeaAnimal> input1 = new ArrayList<SeaAnimal>();
        List<Animal> output1 = new ArrayList<Animal>();
        input1.add(new Fish(200));
        input1.add(new Fish(150));
        input1.add(new Fish(300));

        getOldSeaAnimals(input1, output1);

        List<Fish> input2 = new ArrayList<Fish>();
        List<SeaAnimal> output2 = new ArrayList<SeaAnimal>();
        input2.add(new Fish(200));
        input2.add(new Fish(150));
        input2.add(new Fish(300));
        getOldSeaAnimals(input2, output2);

    }

    public static SeaAnimal produceSeaAnimal()
    {
        return new Fish(200);
    }

    public static void produceSomeSeaAnimals(List<? super SeaAnimal> seaAnimals)
    {
        seaAnimals.add(new Fish(100));
        seaAnimals.add(new Fish(200));
        seaAnimals.add(new Fish(350));
    }

    public static List<? super SeaAnimal> produceSomeSeaAnimals()
    {
        ArrayList<SeaAnimal> seaAnimals = new ArrayList<SeaAnimal>();
        seaAnimals.add(new Fish(100));
        seaAnimals.add(new Fish(200));
        seaAnimals.add(new Fish(350));
        return seaAnimals;
    }

    public static void getOldSeaAnimals(List<? extends SeaAnimal> animals,
                                        List<? super SeaAnimal> oldAnimals)
    {
        for (SeaAnimal animal:animals)
        {
            if (animal.getAge() > 100)
            {
                oldAnimals.add(animal);
            }
        }
    }
}
