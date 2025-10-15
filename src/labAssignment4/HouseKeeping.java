package labAssignment4;

public class HouseKeeping implements HotelService {
    private int roomNumber;

    public void cleanRoom(int roomNumber) {
        this.roomNumber = roomNumber;
        provideService();
    }

    @Override
    public void provideService() {
        System.out.println("House Keeping: Cleaning room number " + roomNumber + ".");
    }
}