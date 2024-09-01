package F2023.Exam.Exam2;

public class GasolineCar extends Car {
    int tank;


    GasolineCar(String model){
        super(model);
        this.speed = 0;
        this.tank = 10;
    }

    @Override
    public void accelerate(){
        super.accelerate();
        tank--;
    }

    @Override
    public String toString(){
        return super.toString() + " med " + tank + "L tilbage i tanken,";
    }

}

