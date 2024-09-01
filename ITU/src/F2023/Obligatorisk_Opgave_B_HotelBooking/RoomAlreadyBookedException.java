package F2023.Obligatorisk_Opgave_B_HotelBooking;

public class RoomAlreadyBookedException extends RuntimeException{
    int requestedFloor;
    int requestedRoom;

    public RoomAlreadyBookedException(int requestedFloor,int requestedRoom){
        super("Room already Booked");
        this.requestedFloor = requestedFloor;
        this.requestedRoom = requestedRoom;
    }

    public String requestedRoom(){
        return "Requested room: floor " + requestedFloor + ", room " + requestedRoom;
    }
}
