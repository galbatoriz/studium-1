package UB09.Aufgabe3V2;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ContainerTest {
    @Test
    void aufgabe1() {
        // Neuer Container MaxWeight 10
        Container con10 = new Container(10);
        assertEquals(10, con10.getMaxWeight());

        // Add Packet Weight 2
        Package packet2 = new Package(2);
        assertEquals(true, con10.add(packet2));
        assertEquals(2, con10.getWeight());
        assertEquals(1, con10.size());

        // Add Packet Weight 4
        Package packet4 = new Package(4);
        assertEquals(true, con10.add(packet4));
        assertEquals(6, con10.getWeight());
        assertEquals(2, con10.size());

        // Add Packet Weight 4
        assertEquals(true, con10.add(packet4));
        assertEquals(10, con10.getWeight());
        assertEquals(3, con10.size());

        // Add Packet Weight 5
        Package packet5 = new Package(5);
        assertEquals(false, con10.add(packet5));
        assertEquals(10, con10.getWeight());
        assertEquals(3, con10.size());

        // Clear
        con10.clear();
        assertEquals(0, con10.getWeight());
        assertEquals(0, con10.size());

        // Try again
        assertEquals(true, con10.add(packet5));
        assertEquals(5, con10.getWeight());
        assertEquals(1, con10.size());


    }

	@Test
	void test_opt() {	// Aufgabe 3c
		Container con10 = new Container(10);
		assertEquals( 10, con10.getMaxWeight());
		
        // Packets erstellen
        Package packet1 = new Package(1);
		Package packet2 = new Package(2);
		Package packet3 = new Package(3);
		Package packet5 = new Package(5);
		Package packet6 = new Package(6);
		
        //
		con10.addOpt( new Package[] {packet6, packet5, packet3, packet2, packet1} );
		assertEquals( 3, con10.size());
		assertEquals( 6+3+1, con10.getWeight()); // Packet6 kann hinzugefügt werden, 5 nicht, 3 kann wieder hinzugefügt werden, 2 nicht und dann 1 kann hinzugefügt werden

    }
}
