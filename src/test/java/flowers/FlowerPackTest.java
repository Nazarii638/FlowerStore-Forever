package flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerPackTest {
    public Flower flower = new Flower(FlowerType.Rose, Color.RED, 2, 100);
    private FlowerPack flowerpack = new FlowerPack(flower, 10);

    @Test
    void getPrice() {
        assertEquals(1000, flowerpack.getPrice());
    }

    @Test
    void getFlower() {
        assertEquals(flower, flowerpack.getFlower());
    }
}