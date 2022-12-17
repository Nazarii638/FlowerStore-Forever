package flowers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower flower = new Flower(FlowerType.Rose, Color.RED, 2, 100);

    @Test
    void getSepalLength() {
        assertEquals(2, flower.getSepalLength());
    }

    @Test
    void getColor() {
        assertEquals(Color.RED, flower.getColor());
    }

    @Test
    void getPrice() {
        assertEquals(100, flower.getPrice());
    }

    @Test
    void getFlowerType() {
        assertEquals(FlowerType.Rose, flower.getFlowerType());
    }
}