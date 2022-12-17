package payment;

public class PayPalStrategy implements Payment{
    @Override
    public boolean pay(double price){
        System.out.println("Calling payment manager.....");
        System.out.println("Processing payment.....");
        System.out.println("Paid "+price+"$ successfully with PayPal!");
        return true;
    }
}
