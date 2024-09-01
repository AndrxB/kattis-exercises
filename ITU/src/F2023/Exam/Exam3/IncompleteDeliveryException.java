package F2023.Exam.Exam3;

public class IncompleteDeliveryException extends Exception{
    IncompleteDeliveryException(){
        super("*** Ordren er ikke under levering");
    }
}
