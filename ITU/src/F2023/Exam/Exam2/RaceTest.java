package F2023.Exam.Exam2;

/**
 * Testklassen RaceTest.
 *
 * @author André
 * @version 18-10-2023
 */
public class RaceTest
{
    public static void main(){
        Race race = new Race("København Grand Prix");

        Car car1 = new GasolineCar("Ulovlig Bil");
        race.addCar(car1);

        race.accelerate();

        Car car2 = new Car("Citroen Berlingo");
        Car car3 = new Car("Citroen Berlingo");
        race.addCar(car2);
        race.addCar(car3);

        race.accelerate();


        race.display();

    }
}

