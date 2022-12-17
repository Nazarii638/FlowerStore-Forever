package flowers;
import decorators.*;
import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    public Item itemSet() {
        Flower f = new Flower(FlowerType.Rose, Color.RED, 5, 20);
        FlowerPack fp = new FlowerPack(f, 10);
        FlowerBucket fb = new FlowerBucket(fp);
        Item item = fb;
        item = new PaperDecorator(item);
        return item;
    }

    void getPrice() {
    Item item = itemSet();
    assertEquals(213, item.getPrice());
    }
}