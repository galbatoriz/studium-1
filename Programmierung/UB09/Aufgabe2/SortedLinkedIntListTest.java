package UB09.Aufgabe2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SortedLinkedIntListTest {

    SortedLinkedIntList list;

    @BeforeEach
    void setUp() {
        list = new SortedLinkedIntList(); // Start-Element
    }

    @Test
    void empty() {
        list.reset();
        assertFalse(list.hasNext());
    }

    @Test
    void firstElement() {
        list.add(3);
        list.reset();
        assertTrue(list.hasNext());
        assertEquals(3, list.getNext());
        assertFalse(list.hasNext());
    }

    @Test
    void testCase4() {
        list.add(8);
        list.add(90);
        list.add(-2);
        list.add(10);

        assertArrayEquals(new int[] { -2, 8, 10, 90 }, list.toArray());
    }
}
