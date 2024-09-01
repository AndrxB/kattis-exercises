package F2023.Obligatorisk_Opgave_A_EmployeeSystem;

import java.util.*;

class PermanentEmployee extends Employee{
    protected ArrayList<String> projects;

    public PermanentEmployee(String name, double salary){
        super(name, salary);
        this.projects = new ArrayList<>();
    }

    void addProject(String project){
        projects.add(project);
    }

    @Override
    void display(){
        super.display();
        if(projects.size() > 0){
            for(String project : projects){
                System.out.println("- " + project);
            }
        }
    }
}

