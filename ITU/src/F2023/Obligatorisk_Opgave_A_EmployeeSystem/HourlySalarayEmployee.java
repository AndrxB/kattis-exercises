package F2023.Obligatorisk_Opgave_A_EmployeeSystem;

import java.util.ArrayList;

class HourlySalaryEmployee extends PermanentEmployee{
    private double salaryPerHour;
    private int hours;

    HourlySalaryEmployee(String name, double salaryPerHour, int hours){
        super(name, salaryPerHour * hours);
        this.salaryPerHour = salaryPerHour;
        this.hours = hours;
    }

    @Override
    void display(){
        super.display();
        System.out.println(this.hours + " timer");
    }

    void registerHours(int hours){
        this.hours += hours;
    }
}
