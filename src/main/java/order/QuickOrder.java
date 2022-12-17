package order;
import java.util.*;

public class QuickOrder {
    public static Order generate(int n){
        Order result = new Order();
        Random r = new Random();
        for(int i = 0; i<n; i++) {
            boolean is_receiver  = r.nextBoolean();
            if(is_receiver){
                User temp = new Receiver();
                result.addUser(temp);
            }
            else {
                User temp = new Sender();
                result.addUser(temp);
            }
        }
        return result;
    }
}
