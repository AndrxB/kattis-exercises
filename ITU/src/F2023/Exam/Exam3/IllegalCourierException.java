package F2023.Exam.Exam3;

public class IllegalCourierException extends RuntimeException{
    protected String illegal_courier;

    IllegalCourierException(String illegal_courier){
        super("*** Ulovligt bud: ");
        this.illegal_courier = illegal_courier;
    }

    String getIllegalCourier(){
        return illegal_courier;
    }
}
