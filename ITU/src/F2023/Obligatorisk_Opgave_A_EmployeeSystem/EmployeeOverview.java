package F2023.Obligatorisk_Opgave_A_EmployeeSystem;

import java.util.*;

class EmployeeOverview{
    private ArrayList<Employee> employees;

    EmployeeOverview(){
        this.employees = new ArrayList<>();
    }

    void display(){
        int counter = 1;
        for(Employee e : employees){

            for(int i = 0; i < counter; i++){
                System.out.print("i");
            }
            System.out.print(". ");
            e.display(); // Display metode her.
            counter++;
            System.out.println();
        }
    }

    void addEmployee(Employee e){
        employees.add(e);
    }
}
