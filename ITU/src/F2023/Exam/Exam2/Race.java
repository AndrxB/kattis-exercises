package F2023.Exam.Exam2;

import java.util.List;
import java.util.ArrayList;

public class Race {
    String name;
    List<Car> cars;

    Race(String name){
        this.name = name;
        this.cars = new ArrayList<>();
    }

    void addCar(Car car){
        cars.add(car);
    }

    void accelerate(){
        for(Car car : cars){
            car.accelerate();
        }
    }

    void display(){
        System.out.println("Følgende biler deltager i '" + name + "':");

        int i = 0;
        for(Car car : cars){
            i++;
            System.out.println(i + ") " + car.toString());

        }

        System.out.println();

        System.out.println(leading().toString() + " har taget føringen!");
    }

    Car leading(){
        Car c = null;
        double currentLeader = Integer.MIN_VALUE;

        for(Car car : cars){
            if(car.getSpeed() > currentLeader){
                currentLeader = car.getSpeed();
                c = car;
            }
        }
        return c;
    }
}

