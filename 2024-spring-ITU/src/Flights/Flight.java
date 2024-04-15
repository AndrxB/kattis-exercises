package Flights;

public class Flight {
    boolean isActive = true;
    private String route;
    private Departure departure;

    public Flight(String HHMMSS, String Destination){
        if(HHMMSS == null || Destination == null){
            System.out.println("-");
            return;
        }

        this.departure = new Departure(HHMMSS);
        this.route = Destination;
    }

    public void cancellation(){
        isActive = false;
    }


    public boolean isActive(){
        return isActive;
    }

    public Departure getDeparture(){
        return this.departure;
    }

    public void reRoute(String newDestination){
        this.route = newDestination;
    }

    public String getRoute(){
        return this.route;
    }

    @Override
    public String toString(){
        return isActive ? this.route : "-";
    }
}
