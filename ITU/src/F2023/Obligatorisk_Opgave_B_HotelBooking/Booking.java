package F2023.Obligatorisk_Opgave_B_HotelBooking;

public class Booking {
    private String contactPerson;
    private int guests;
    private boolean breakfastIncluded;
    private Room room;

    public Booking(String contactPerson, int guests, boolean breakfastIncluded, Room room)
            throws RoomAlreadyBookedException,InvalidGuestsException {
        if(guests <= 0){
            throw new InvalidGuestsException();
        }
        this.contactPerson = contactPerson;
        this.guests = guests;
        this.breakfastIncluded = breakfastIncluded;
        this.room = room;
    }

    public int getGuests() { return guests; }

    public boolean getBreakfastIncluded() { return breakfastIncluded; }
}
