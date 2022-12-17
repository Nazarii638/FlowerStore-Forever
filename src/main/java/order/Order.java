package order;

import java.util.ArrayList;
import  java.util.List;

public class Order {
    List<User> users = new ArrayList<User>();

    public Order(){
        notifyUsers("Order was created!!!!");
    }

    public void addUser(User user){
        this.users.add(user);
    }

    public void removeUser(User user){
        this.users.remove(user);
    }

    public void notifyUsers(String status){
        for(User user : this.users){
            user.update(status);
        }
    }
}
