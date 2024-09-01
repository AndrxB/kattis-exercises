package F2023.Obligatorisk_Opgave_B_HotelBooking;

public class InvalidGuestsException extends Exception{
    public InvalidGuestsException(){
        super("Invalid guest selection");
    }
}
