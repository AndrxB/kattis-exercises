package F2023.Exam.Exam2;

public class Car {
    protected String model;
    protected double speed;

    Car(String model){
        this.model = model;
        this.speed = 0;
    }

    void accelerate(){
        speed += 4.5;
    }

    double getSpeed(){
        return speed;
    }

    public String toString(){
        return "En " + model + " der kører " + speed + "km/t";
    }

}

