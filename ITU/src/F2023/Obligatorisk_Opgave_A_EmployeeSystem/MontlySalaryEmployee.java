package F2023.Obligatorisk_Opgave_A_EmployeeSystem;

import java.util.*;

class MonthlySalaryEmployee extends PermanentEmployee{
    private int projectCounter;

    MonthlySalaryEmployee(String name, double salary){
        super(name, salary);
        this.projectCounter = 0;
    }

    @Override
    void addProject(String project){
        projects.add(project);
        this.projectCounter++;

        if(projectCounter % 3 == 0){
            this.salary += 1000;
        }
    }
}
