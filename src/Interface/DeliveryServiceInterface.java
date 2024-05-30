package Interface;

interface Transport {
    void delivery();
}

class Truck implements Transport {

    @Override
    public void delivery() {
        System.out.println("Truck Delivery!");
    }
}

class Ship implements Transport {

    @Override
    public void delivery() {
        System.out.println("Ship Delivery");
    }
}

public class DeliveryServiceInterface {
    public static void main(String[] args) {
        Transport transport = new Truck();
        transport.delivery();
    }
}