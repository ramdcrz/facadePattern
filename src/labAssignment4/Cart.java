package labAssignment4;

public class Cart implements HotelService {
    private int numberOfCarts;

    public void requestCart(int numberOfCarts) {
        this.numberOfCarts = numberOfCarts;
        provideService();
    }

    @Override
    public void provideService() {
        System.out.println("Cart: Providing " + numberOfCarts + " luggage cart/s.");
    }
}