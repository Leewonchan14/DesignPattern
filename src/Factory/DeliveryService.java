package Factory;

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

abstract class TransportCreator {
    public abstract Transport createTransport();

    public void deliveryTransport(){
        Transport transport = createTransport();
        transport.delivery();
    }
}


class TruckFactory extends TransportCreator {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class ShipFactory extends TransportCreator {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

public class DeliveryService {
    public static void main(String[] args) {
        TransportCreator truckFactory = new TruckFactory();
        truckFactory.deliveryTransport();


        TransportCreator shipFactory = new ShipFactory();
        shipFactory.deliveryTransport();
    }
}
