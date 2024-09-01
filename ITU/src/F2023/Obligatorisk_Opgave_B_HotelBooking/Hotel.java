package F2023.Obligatorisk_Opgave_B_HotelBooking;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private Room[][] rooms;
    private ArrayList<Booking> bookings;

    public Hotel(String name, int floors, int roomsPerFloor) {
        this.name = name;
        rooms = buildHotel(floors, roomsPerFloor);
        bookings = new ArrayList<>();
    }

    /* Tilføjer en ny booking til listen bookings. */
    public void addBooking(String contact, int guests, boolean breakfast, int requestedFloor, int requestedRoomNo) {
        try{
            Room requestedRoom = rooms[requestedFloor][requestedRoomNo];
            bookings.add(new Booking(contact, guests, breakfast, requestedRoom));
            requestedRoom.setBooked();
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch(InvalidGuestsException e){
            System.out.println(e.getMessage());
        }
    }

    /* Udregner det gennemsnitlige antal gæster per booking. */
    public double avgGuests() {
        int sum = 0;
        try{
            for (Booking b : bookings) {
                sum += b.getGuests();
            }
            return sum / bookings.size();
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
            return 0.0;
        }
    }

    /* Hjælpemetode til constructoren.
    Opretter Room-objekter, som den tilføjer til rooms. */
    private Room[][] buildHotel(int floors, int roomsPerFloor) {
        Room[][] hotel = new Room[floors][roomsPerFloor];
        for (int i = 0; i < hotel.length; i++) {
            for (int j = 0; j < hotel[i].length; j++) {
                hotel[i][j] = new Room(i, j);
            }
        }
        return hotel;
    }

    public void checkAddBooking(String contact, int guests, boolean breakfast,
                                int requestedFloor, int requestedRoomNo) throws RoomAlreadyBookedException{
        Room r = rooms[requestedFloor][requestedRoomNo];

        if(r.getBooked()){
            throw new RoomAlreadyBookedException(requestedFloor,requestedRoomNo);
        } else {
            addBooking(contact, guests, breakfast, requestedFloor, requestedRoomNo);
        }
    }

    public void showHotel(){
        for(int i = 0; i < rooms.length; i++){

            for(int j = 0; j < rooms[i].length; j++){
                System.out.print("[");
                if(rooms[i][j].getBooked()){
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
                System.out.print("]");
            }
            System.out.println();
        }
    }

    public double breakfastFactor(){
        double totalRooms = 0;
        double totalBreakfast = 0;
        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < rooms[i].length; j++){
                totalRooms++;
            }
        }
        for(Booking b : bookings){
            if(b.getBreakfastIncluded()){
                totalBreakfast++;
            }
        }

        double factor = Math.round((totalBreakfast / totalRooms)*10000);



        return factor / 10000;
    }
}
