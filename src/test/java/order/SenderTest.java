package order;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SenderTest {
    User temp = new Sender();
    @Test
    void getId() {
        assertEquals(1,temp.getId());
    }
}