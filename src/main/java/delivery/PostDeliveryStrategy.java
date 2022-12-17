package delivery;

public class PostDeliveryStrategy implements Delivery{
    @Override
    public boolean deliver(String address){
        System.out.println("Delivered on "+address+" by post");
        return true;
    }
}
