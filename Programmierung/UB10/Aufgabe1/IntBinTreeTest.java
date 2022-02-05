package UB10.Aufgabe1;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntBinTreeTest {

    // Tree 1

    IntBinTree a5 = new IntBinTree(5);
    IntBinTree a6 = new IntBinTree(6);
    IntBinTree a7 = new IntBinTree(7);
    IntBinTree a8 = new IntBinTree(8);
    IntBinTree a3 = new IntBinTree(a5, 3, a6);
    IntBinTree a4 = new IntBinTree(a7, 4, a8);
    IntBinTree a2 = new IntBinTree(a3, 2, a4);
    IntBinTree tree1 = new IntBinTree(a2, 1, null);

    // Tree 2
    IntBinTree b4 = new IntBinTree(4);
    IntBinTree b5 = new IntBinTree(5);
    IntBinTree b2 = new IntBinTree(b4, 2, null);
    IntBinTree b3 = new IntBinTree(null, 3, b5);
    IntBinTree tree2 = new IntBinTree(b2, 1, b3);

    // Tree 3
    IntBinTree c3 = new IntBinTree(3);
    IntBinTree c2 = new IntBinTree(c3, 2, null);
    IntBinTree tree3 = new IntBinTree(c2, 1, null);

    // Tree 4
    IntBinTree tree4 = new IntBinTree(1);

    // Tree 5
    IntBinTree e4 = new IntBinTree(4);
    IntBinTree e5 = new IntBinTree(5);
    IntBinTree e2 = new IntBinTree(e4, 2, e5);
    IntBinTree e3 = new IntBinTree(3);
    IntBinTree tree5 = new IntBinTree(e2, 1, e3);

    // Tree 6
    IntBinTree f6 = new IntBinTree(6);
    IntBinTree f7 = new IntBinTree(7);
    IntBinTree f4 = new IntBinTree(f6, 4, f7);
    IntBinTree f5 = new IntBinTree(5);
    IntBinTree f2 = new IntBinTree(f4, 2, f5);
    IntBinTree f3 = new IntBinTree(3);
    IntBinTree tree6 = new IntBinTree(f2, 1, f3);

    // Tree 7
    IntBinTree g2 = new IntBinTree(2);
    IntBinTree g4 = new IntBinTree(4);
    IntBinTree g5 = new IntBinTree(5);
    IntBinTree g3 = new IntBinTree(g4, 3, g5);
    IntBinTree tree7 = new IntBinTree(g2, 1, g3);

    // Tree 8
    IntBinTree h4 = new IntBinTree(4);
    IntBinTree h5 = new IntBinTree(5);
    IntBinTree h6 = new IntBinTree(6);
    IntBinTree h7 = new IntBinTree(7);
    IntBinTree h2 = new IntBinTree(h4, 2, h5);
    IntBinTree h3 = new IntBinTree(h6, 3, h7);
    IntBinTree tree8 = new IntBinTree(h2, 1, h3);

    // Tree 9
    IntBinTree tree9 = new IntBinTree();

    // Auto Created Trees
    Integer[] values14 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
    Integer[] values15 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    Integer[] values16 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
    Integer[] values8 = { 1, 2, 3, 4, 5, 6, 7, 8 };
    IntBinTree treec8 = IntBinTree.createTree(values8);
    IntBinTree treec14 = IntBinTree.createTree(values14);
    IntBinTree treec15 = IntBinTree.createTree(values15);
    IntBinTree treec16 = IntBinTree.createTree(values16);

    @Test
    @DisplayName("Count all inner nodes from given tree")
    void testCountInnerNodes() {
        assertEquals(4, tree1.countInnerNodes());
        assertEquals(3, tree2.countInnerNodes());
        assertEquals(2, tree3.countInnerNodes());
        assertEquals(0, tree4.countInnerNodes());
        assertEquals(2, tree5.countInnerNodes());
        assertEquals(3, tree6.countInnerNodes());
        assertEquals(2, tree7.countInnerNodes());
        assertEquals(3, tree8.countInnerNodes());
        assertEquals(0, tree9.countInnerNodes());
        assertEquals(4, treec8.countInnerNodes());
        assertEquals(7, treec14.countInnerNodes());
        assertEquals(7, treec15.countInnerNodes());
        assertEquals(8, treec16.countInnerNodes());
    }

    @Test
    @DisplayName("Count all leaves from given tree")
    void testCountLeaves() {
        assertEquals(4, tree1.countLeaves());
        assertEquals(2, tree2.countLeaves());
        assertEquals(1, tree3.countLeaves());
        assertEquals(1, tree4.countLeaves());
        assertEquals(3, tree5.countLeaves());
        assertEquals(4, tree6.countLeaves());
        assertEquals(3, tree7.countLeaves());
        assertEquals(4, tree8.countLeaves());
        assertEquals(0, tree9.countLeaves());
        assertEquals(4, treec8.countLeaves());
        assertEquals(7, treec14.countLeaves());
        assertEquals(8, treec15.countLeaves());
        assertEquals(8, treec16.countLeaves());
        ;
    }

    @Test
    @DisplayName("Count all nodes from given tree")
    void testCountNodes() {
        assertEquals(8, tree1.countNodes());
        assertEquals(5, tree2.countNodes());
        assertEquals(3, tree3.countNodes());
        assertEquals(1, tree4.countNodes());
        assertEquals(5, tree5.countNodes());
        assertEquals(7, tree6.countNodes());
        assertEquals(5, tree7.countNodes());
        assertEquals(7, tree8.countNodes());
        assertEquals(0, tree9.countNodes());
        assertEquals(8, treec8.countNodes());
        assertEquals(14, treec14.countNodes());
        assertEquals(15, treec15.countNodes());
        assertEquals(16, treec16.countNodes());
    }

    @Test
    @DisplayName("Create Tree")
    void testCreateTree() {
        Integer[] values = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16 };
        assertEquals(IntBinTree.class, IntBinTree.createTree(values).getClass());
    }

    @Test
    @DisplayName("Get height of tree")
    void testGetHeight() {
        assertEquals(4, tree1.getHeight());
        assertEquals(3, tree2.getHeight());
        assertEquals(3, tree3.getHeight());
        assertEquals(1, tree4.getHeight());
        assertEquals(3, tree5.getHeight());
        assertEquals(4, tree6.getHeight());
        assertEquals(3, tree7.getHeight());
        assertEquals(3, tree8.getHeight());
        assertEquals(-1, tree9.getHeight());
        assertEquals(4, treec8.getHeight());
        assertEquals(4, treec14.getHeight());
        assertEquals(4, treec15.getHeight());
        assertEquals(5, treec16.getHeight());
    }

    @Test
    void testInorder() {
        assertEquals("[5, 3, 6, 2, 7, 4, 8, 1]", Arrays.toString(tree1.inorder()));
        assertEquals("[4, 2, 1, 3, 5]", Arrays.toString(tree2.inorder()));
        assertEquals("[3, 2, 1]", Arrays.toString(tree3.inorder()));
        assertEquals("[1]", Arrays.toString(tree4.inorder()));
        assertEquals("[4, 2, 5, 1, 3]", Arrays.toString(tree5.inorder()));
        assertEquals("[6, 4, 7, 2, 5, 1, 3]", Arrays.toString(tree6.inorder()));
        assertEquals("[2, 1, 4, 3, 5]", Arrays.toString(tree7.inorder()));
        assertEquals("[4, 2, 5, 1, 6, 3, 7]", Arrays.toString(tree8.inorder()));
        assertEquals(null, tree9.inorder());
        assertEquals("[8, 4, 2, 5, 1, 6, 3, 7]", Arrays.toString(treec8.inorder()));
        assertEquals("[8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7]", Arrays.toString(treec14.inorder()));
        assertEquals("[8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15]", Arrays.toString(treec15.inorder()));
        assertEquals("[16, 8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15]", Arrays.toString(treec16.inorder()));
    }

    @Test
    void testIsComplete() {
        assertEquals(false, tree1.isComplete());
        assertEquals(false, tree2.isComplete());
        assertEquals(false, tree3.isComplete());
        assertEquals(true, tree4.isComplete());
        assertEquals(true, tree5.isComplete());
        assertEquals(false, tree6.isComplete());
        assertEquals(false, tree7.isComplete());
        assertEquals(true, tree8.isComplete());
        assertEquals(true, tree9.isComplete());
        assertEquals(true, treec8.isComplete());
        assertEquals(true, treec14.isComplete());
        assertEquals(true, treec15.isComplete());
        assertEquals(true, treec16.isComplete());
    }

    @Test
    void testIsEmpty() {
        assertEquals(false, tree1.isEmpty());
        assertEquals(false, tree2.isEmpty());
        assertEquals(false, tree3.isEmpty());
        assertEquals(false, tree4.isEmpty());
        assertEquals(false, tree5.isEmpty());
        assertEquals(false, tree6.isEmpty());
        assertEquals(false, tree7.isEmpty());
        assertEquals(false, tree8.isEmpty());
        assertEquals(true, tree9.isEmpty());
        assertEquals(false, treec8.isEmpty());
        assertEquals(false, treec14.isEmpty());
        assertEquals(false, treec15.isEmpty());
        assertEquals(false, treec16.isEmpty());
    }

    @Test
    void testIsFull() {
        assertEquals(false, tree1.isFull());
        assertEquals(false, tree2.isFull());
        assertEquals(false, tree3.isFull());
        assertEquals(true, tree4.isFull());
        assertEquals(true, tree5.isFull());
        assertEquals(true, tree6.isFull());
        assertEquals(true, tree7.isFull());
        assertEquals(true, tree8.isFull());
        assertEquals(false, tree9.isFull());
        assertEquals(false, treec8.isFull());
        assertEquals(false, treec14.isFull());
        assertEquals(true, treec15.isFull());
        assertEquals(false, treec16.isFull());
    }

    @Test
    void testIsPerfect() {
        assertEquals(false, tree1.isPerfect());
        assertEquals(false, tree2.isPerfect());
        assertEquals(false, tree3.isPerfect());
        assertEquals(true, tree4.isPerfect());
        assertEquals(false, tree5.isPerfect());
        assertEquals(false, tree6.isPerfect());
        assertEquals(false, tree7.isPerfect());
        assertEquals(true, tree8.isPerfect());
        assertEquals(true, tree9.isPerfect());
        assertEquals(false, treec8.isPerfect());
        assertEquals(false, treec14.isPerfect());
        assertEquals(true, treec15.isPerfect());
        assertEquals(false, treec16.isPerfect());
    }
}