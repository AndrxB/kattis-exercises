package F2023.Exam.Exam3;

public class Test{
    public static void test1(){
        OnlineOrder oo = new OnlineOrder("Sebastian", "en Macbook", 7000);
        oo.deliver("Claus");
        oo.handleOrder();
    }

    public static void test21(){
        OnlineOrder oo = new OnlineOrder(null, "en Macbook", 7000);
    }

    public static void test22(){
        try{
            test21();
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }

    public static void test3(){
        OnlineOrder oo = new OnlineOrder("Sebastian", "en Macbook", 7000);
        oo.handleOrder();
    }

    public static void test41(){

        OnlineOrder oo = new OnlineOrder("Sebastian", "en Macbook", 7000);
        oo.deliver("Claus");

    }

    public static void test42(){
        try{
            test41();
        } catch(IllegalCourierException e){
            System.out.println(e.getMessage() + e.getIllegalCourier());
        }
    }
}
