package decorators;
import flowers.*;

public abstract class Decorator extends Item{
    private Item item;

    public Decorator(Item item){this.item = item;};

    @Override
    public String getDescription(){
        return item.getDescription();
    };

    @Override
    public double getPrice(){
        return item.getPrice();
    }
}
