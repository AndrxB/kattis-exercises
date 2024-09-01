package F2023.Exam.Exam1;

public class Pig{
    protected String name;
    protected Double weight;

    Pig(String name){
        this.name = name;
        this.weight = 1.5;
    }

    public String getName(){
        return name;
    }

    public Double getWeight(){
        return weight;
    }

    public void grow(){
        this.weight += 0.3;
    }

    public String toString(){
        return "- " + name + " vejer " + weight + "kg";
    }
}
