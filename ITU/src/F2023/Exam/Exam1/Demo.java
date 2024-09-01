package F2023.Exam.Exam1;

public class Demo{
    public static void test(){
        Farm farm = new Farm("ITUs grisefarm");

        farm.add(new Sow("Blomst"));
        farm.grow();

        farm.add(new Pig("Nugget"));
        farm.add(new Pig("Fersken"));
        farm.grow();

        System.out.println("//display");
        farm.display();
        System.out.println();

        System.out.println("//display(Nugget)");
        farm.display("Nugget");
        System.out.println();

        System.out.println("//tallest()");
        System.out.println("Gårdens største basse er:");
        System.out.println(farm.largest().toString());
    }
}
