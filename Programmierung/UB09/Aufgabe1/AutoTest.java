package UB09.Aufgabe1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutoTest {

    Auto auto;
    Kofferraum kofferraum;
    Motor motor;
    Reifen reifen;

    @BeforeEach
    void setup() {
        auto = new Auto();
    }

    @Test
    void testGetGeschwindigkeit() {
        auto.setGeschwindigkeit(10);
        assertEquals(10, auto.getGeschwindigkeit());
    }

    @Test
    void testGetKofferrraum() {
        kofferraum = new Kofferraum(10);
        auto.setKofferraum(kofferraum);
        assertEquals(10, auto.getKofferraum().getVolumen());
    }

    @Test
    void testGetMotor() {
        motor = new Motor(10);
        auto.setMotor(motor);
        assertEquals(10, auto.getMotor().getHubraum());

    }

    @Test
    void testGetReifen() {
        Reifen[] arr = { new Reifen(10, false), new Reifen(5, true) };
        auto.setReifen(arr);
        assertFalse(auto.getReifen()[0].isPlatt());
        assertTrue(auto.getReifen()[1].isPlatt());
        assertEquals(10, auto.getReifen()[0].getProfilgüte());
        assertEquals(5, auto.getReifen()[1].getProfilgüte());
    }

    @Test
    void testGetSitze() {
        auto.setSitze(4);
        assertEquals(4, auto.getSitze());
    }

    @Test
    void testGetTueren() {
        auto.setTueren(5);
        assertEquals(5, auto.getTueren());
    }

    @Test
    void testReifenwechsel() {
        Reifen[] arr = { new Reifen(10, false), new Reifen(5, true) };
        Reifen neu = new Reifen(3, false);
        auto.setReifen(arr);
        assertEquals(arr[1], auto.getReifen()[1]);
        auto.reifenwechsel(1, neu);
        assertEquals(neu, auto.getReifen()[1]);
    }

    @Test
    void testSchneller() {
        auto.setGeschwindigkeit(100);
        Auto other = new Auto();
        other.setGeschwindigkeit(200);
        assertFalse(auto.schneller(other));
        assertTrue(other.schneller(auto));
    }
}
