import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void factorial5() {
        Main m = new Main();
        assertEquals(120, m.calculatef(5));
    }

    @Test
    void factorial0() {
        Main m = new Main();
        assertEquals(1, m.calculatef(0));
    }

    @Test
    void factorialDecimal() {
        Main m = new Main();
        assertThrows(RuntimeException.class, () -> m.calculatef(2.5));
    }

    @Test
    void factorialNegativo() {
        Main m = new Main();
        assertThrows(RuntimeException.class, () -> m.calculatef(-3));
    }

    @Test
    void potencia23() {
        Main m = new Main();
        assertEquals(8.0, m.calculatee(2,3), 0.0001);
    }

    @Test
    void potencia51() {
        Main m = new Main();
        assertEquals(5.0, m.calculatee(5,1), 0.0001);
    }

    @Test
    void potencia00() {
        Main m = new Main();
        assertThrows(RuntimeException.class, () -> m.calculatee(0,0));
    }

}