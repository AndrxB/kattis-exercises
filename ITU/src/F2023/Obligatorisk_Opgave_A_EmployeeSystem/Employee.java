package F2023.Obligatorisk_Opgave_A_EmployeeSystem;

import java.util.*;

class Employee{
    protected String name;
    protected double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void display(){
        System.out.println("** EMPLOYEE INFO **");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

