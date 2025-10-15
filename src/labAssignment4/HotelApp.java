package labAssignment4;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        frontDesk.guestCheckIn("CAR-123", 204, 2);
        frontDesk.guestCheckIn("VAN-456", 501, 4);
        frontDesk.guestCheckIn("CAR-293", 451, 1);
    }
}