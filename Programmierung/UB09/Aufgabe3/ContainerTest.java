package UB09.Aufgabe3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContainerTest {

    Container list;

    @BeforeEach
    void setUp() {
        list = new Container(100); // Start-Element
    }

    @Test
    void empty() {
        list.reset();
        assertFalse(list.hasNext());
    }

    @Test
    void firstElement() {
        Package test = new Package(10);
        list.add(test);
        list.reset();
        assertTrue(list.hasNext());
        assertEquals(test, list.getNext());
        assertFalse(list.hasNext());
    }

    @Test
    void testCaseNormal() {
        Package test1 = new Package(10);
        Package test2 = new Package(10);
        Package test3 = new Package(10);

        list.add(test1);
        list.add(test2);
        list.add(test3);

        assertArrayEquals(new Package[] { test1, test2, test3, }, list.toArray());
    }

    @Test
    void testCaseOverflow() {
        Package test1 = new Package(10);
        Package test2 = new Package(35);
        Package test3 = new Package(60);

        assertTrue(list.add(test1));
        assertTrue(list.add(test2));
        assertFalse(list.add(test3));

    }
}
