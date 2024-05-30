package Strategy;

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

class Service {
    private Transport transport;

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void deliveryTransport() {
        this.transport.delivery();
    }
}

public class DeliveryServiceStrategy {
//    public static void main(String[] args) {
//        Service service = new Service();
//        service.setTransport(new Ship());
//
//        service.deliveryTransport();
//    }
}
