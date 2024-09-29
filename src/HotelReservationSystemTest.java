import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class HotelReservationSystemTest {

    private HotelReservationSystem hotelReservationSystem;
    private Room room1;
    private Room room2;

    @BeforeEach
    public void setUp() {
        room1 = new Room(101, "Standard", 100.0, true);
        room2 = new Room(102, "Deluxe", 150.0, true);

        List<Room> rooms = Arrays.asList(room1, room2);
        hotelReservationSystem = new HotelReservationSystem(rooms);
    }

    // Test to check available rooms
    @Test
    public void testGetAvailableRooms() {
        List<Room> availableRooms = hotelReservationSystem.getAvailableRooms("2024-10-01", "2024-10-05");
        assertEquals(2, availableRooms.size(), "Both rooms should be available.");
    }

    // Test to reserve a room successfully
    @Test
    public void testReserveRoomSuccessfully() {
        boolean isReserved = hotelReservationSystem.reserveRoom(room1, "2024-10-01", "2024-10-05");
        assertTrue(isReserved, "Room should be reserved successfully.");
        assertFalse(room1.isAvailable("2024-10-01", "2024-10-05"), "Room should no longer be available after reservation.");
    }
}
