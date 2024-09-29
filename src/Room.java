public class Room {
    private int roomNumber;
    private String roomType;
    private double price;
    private boolean available;

    public Room(int roomNumber, String roomType, double price, boolean available) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.available = available;
    }

    // Check if the room is available for given dates (for simplicity, we assume all rooms are available if not booked)
    public boolean isAvailable(String checkInDate, String checkOutDate) {
        return available;
    }

    // Method to book a room (for now, just setting it to unavailable)
    public void bookRoom(String checkInDate, String checkOutDate) {
        this.available = false;
    }
}
