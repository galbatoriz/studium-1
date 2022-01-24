package UB11.Aufgabe3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class IntBinTreeTest {

    @Test
    void checkSearchTree() {

        IntBinTree child6 = new IntBinTree(15);
        IntBinTree child3 = new IntBinTree(35);
        IntBinTree child4 = new IntBinTree(1);
        IntBinTree child5 = new IntBinTree(null, 30, child3);
        IntBinTree child1 = new IntBinTree(child4, 3, child6);
        IntBinTree child2 = new IntBinTree(child5, 39, null);
        IntBinTree root = new IntBinTree(child1, 27, child2);

        assertTrue(root.isSearchTree());

        IntBinTree child7 = new IntBinTree(20);
        child5.setRight(child7);

        assertFalse(root.isSearchTree());
    }

    @Test
    void checkAVLTree() {

        IntBinTree child6 = new IntBinTree(15);
        IntBinTree child3 = new IntBinTree(35);
        IntBinTree child4 = new IntBinTree(1);
        IntBinTree child5 = new IntBinTree(null, 30, child3);
        IntBinTree child1 = new IntBinTree(child4, 3, child6);
        IntBinTree child2 = new IntBinTree(child5, 39, null);
        IntBinTree root = new IntBinTree(child1, 27, child2);

        assertTrue(root.isAVLTree());

        IntBinTree child8 = new IntBinTree(10);
        IntBinTree child7 = new IntBinTree(child8, 12, null);
        child6.setLeft(child7);

        assertFalse(root.isAVLTree());
    }
}
