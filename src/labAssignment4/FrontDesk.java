package labAssignment4;

public class FrontDesk {
    private final Valet valet;
    private final HouseKeeping houseKeeping;
    private final Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void guestCheckIn(String plateNumber, int roomNumber, int numberOfCarts) {
        System.out.println("\n--- New Guest Arrived ---");
        valet.pickUpVehicle(plateNumber);
        houseKeeping.cleanRoom(roomNumber);
        cart.requestCart(numberOfCarts);
        System.out.println("--- Guest Served Successfully ---");
    }
}