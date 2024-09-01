package F2023.Exam.Exam3;

public class OnlineOrder{
    private String costumer;
    private String product;
    private int cost;
    private Boolean beingDelivered;
    private String courier;

    OnlineOrder(String costumer, String product, int cost){
        if(product == null || costumer == null){
            throw new IllegalArgumentException("*** Kunde eller produkt mangler!");
        }
        this.costumer = costumer;
        this.product = product;
        this.cost = cost;
        beingDelivered = false;

    }

    void deliver(String courier){
        if(courier.equalsIgnoreCase("Louise") || courier.equalsIgnoreCase("Sebastian") || courier.equalsIgnoreCase("Claus")){
            throw new IllegalCourierException(courier);
        }
        this.courier = courier;
        this.beingDelivered = true;
    }

    void notifyCostumer() throws IncompleteDeliveryException {
        if(beingDelivered){
            System.out.println("Informerer " + costumer + " om ordren på " + product + " for " + cost + "kr (via " + courier + ")");
        } else {
            throw new IncompleteDeliveryException();
        }
    }

    void handleOrder(){
        System.out.println("Vi arbejder nu på ordren . . .");
        try{
            notifyCostumer();
        } catch(IncompleteDeliveryException e){
            System.out.println(e.getMessage());
        }
    }
}

