package lessons.research.monads;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    /**
    public String getCarInsuranceName(Optional<Person> person) {
        return person.f.flatMap(p-> p.getCar())
                     .flatMap(car -> car.getInsurance())
                     .map(insurance -> insurance.getName)
                     .orElse("Unknown");
    }
    */
}
