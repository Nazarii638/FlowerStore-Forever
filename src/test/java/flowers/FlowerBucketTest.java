package flowers;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FlowerBucketTest {
    private FlowerBucket flowerbucket = new FlowerBucket(new FlowerPack(new Flower(FlowerType.Rose, Color.RED, 2, 100), 10));

    @Test
    void getPrice() {
        assertEquals(1000, flowerbucket.getPrice());
    }
}