package delivery;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(String address){
        System.out.println("Delivered on "+address+" by DHL");
        return true;
    }
}
