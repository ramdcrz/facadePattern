package labAssignment4;

public class Valet implements HotelService {
    private String plateNumber;

    public void pickUpVehicle(String plateNumber) {
        this.plateNumber = plateNumber;
        provideService();
    }

    @Override
    public void provideService() {
        System.out.println("Valet: Picking up vehicle with plate number " + plateNumber + ".");
    }
}