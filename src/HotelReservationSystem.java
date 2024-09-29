import java.util.ArrayList;
import java.util.List;

public class HotelReservationSystem {
    private List<Room> rooms;

    public HotelReservationSystem(List<Room> rooms) {
        this.rooms = rooms;
    }

    // Method to check room availability
    public List<Room> getAvailableRooms(String checkInDate, String checkOutDate) {
        List<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (room.isAvailable(checkInDate, checkOutDate)) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    // Method to reserve a room
    public boolean reserveRoom(Room room, String checkInDate, String checkOutDate) {
        if (room.isAvailable(checkInDate, checkOutDate)) {
            room.bookRoom(checkInDate, checkOutDate);
            return true;
        }
        return false;
    }
}
