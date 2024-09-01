package F2023.Exam.Exam1;

public class Sow extends Pig{
    protected int piglets;

    Sow(String name){
        super(name);
        this.piglets = 0;
    }

    @Override
    public void grow(){
        super.grow();

        if(weight < 2 && piglets == 0){
            this.piglets += 12;
        }
    }

    @Override
    public String toString(){
        return super.toString() + " og har " + piglets + " grislinger";
    }
}
