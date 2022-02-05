package UB10.Aufgabe1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IntBinTreeTest {

    @Test
    void emptyTreeTest() {
        IntBinTree emptyTree = new IntBinTree();
        assertTrue(emptyTree.isEmpty());
        assertNull(emptyTree.getValue());
    }

    @Test
    void getValueTest() {
        IntBinTree newTree = new IntBinTree(3);
        assertEquals(3, newTree.getValue());
    }

    @Test
    void getLeftTest() {
        IntBinTree left = new IntBinTree(1);
        IntBinTree right = new IntBinTree(5);
        IntBinTree tree = new IntBinTree(left, 3, right);
        IntBinTree emptyTree = new IntBinTree();
        assertEquals(left.getValue(), tree.getLeft().getValue());
        assertNull(emptyTree.getLeft());
    }

    @Test
    void getRightTest() {
        IntBinTree left = new IntBinTree(1);
        IntBinTree right = new IntBinTree(5);
        IntBinTree tree = new IntBinTree(left, 3, right);
        IntBinTree emptyTree = new IntBinTree();
        assertEquals(right.getValue(), tree.getRight().getValue());
        assertNull(emptyTree.getLeft());
    }

    @Test
    void buildTreeTest() {
        IntBinTree child5 = new IntBinTree(5);
        IntBinTree child6 = new IntBinTree(6);
        IntBinTree child7 = new IntBinTree(7);
        IntBinTree child8 = new IntBinTree(8);
        IntBinTree child3 = new IntBinTree(child5, 3, child6);
        IntBinTree child4 = new IntBinTree(child7, 4, child8);
        IntBinTree root = new IntBinTree(child3, 2, child4);

        assertEquals(2, root.getValue());
        assertEquals(3, root.getLeft().getValue());
        assertEquals(4, root.getRight().getValue());
        assertEquals(5, root.getLeft().getLeft().getValue());
        assertEquals(6, root.getLeft().getRight().getValue());
        assertEquals(7, root.getRight().getLeft().getValue());
        assertEquals(8, root.getRight().getRight().getValue());
        assertFalse(root.isEmpty());

    }

    @Test
    void inOrderTest() {
        IntBinTree root = new IntBinTree(5);
        assertFalse(root.isEmpty());
        IntBinTree leftNode = new IntBinTree(4);
        IntBinTree rightNode = new IntBinTree(6);
        root.setLeft(leftNode);
        root.setRight(rightNode);
        assertEquals(4, root.getLeft().getValue());
        assertEquals(6, root.getRight().getValue());

        assertArrayEquals(new Integer[] { 4, 5, 6 }, root.inorder());
    }

    @Test
    void test_einfacher_baum() {
        IntBinTree ibt1 = new IntBinTree(2);
        assertEquals(2, ibt1.getValue());
        IntBinTree ibt2 = new IntBinTree(4);
        assertEquals(4, ibt2.getValue());
        IntBinTree ibt3 = new IntBinTree(ibt1, 3, ibt2);

        assertFalse(ibt3.isEmpty());
        assertEquals(3, ibt3.getValue());
        assertEquals(ibt1, ibt3.getLeft());
        assertEquals(ibt2, ibt3.getRight());

        ibt1.setLeft(new IntBinTree(1));
        ibt2.setRight(new IntBinTree(5));

        assertArrayEquals(new Integer[] { 1, 2, 3, 4, 5 }, ibt3.inorder());
    }

    @Test
    void test_lueckenloser_insert() {
        Integer[] values = { 1, 2, 3, 4, 5, 6, 7, 8 };
        IntBinTree tree = IntBinTree.createTree(values);
        assertArrayEquals(new Integer[] { 8, 4, 2, 5, 1, 6, 3, 7 }, tree.inorder());
        assertEquals(8, tree.countNodes());
        assertEquals(4, tree.countInnerNodes());
        assertEquals(4, tree.countLeaves());
        assertEquals(4, tree.getHeight());
        assertFalse(tree.isPerfect());
        assertFalse(tree.isFull());
        assertTrue(tree.isComplete());
        //
        values = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        tree = IntBinTree.createTree(values);
        assertArrayEquals(new Integer[] { 8, 4, 9, 2, 10, 5, 11, 1, 12, 6, 13, 3, 14, 7, 15 }, tree.inorder());
        assertEquals(15, tree.countNodes());
        assertEquals(7, tree.countInnerNodes());
        assertEquals(8, tree.countLeaves());
        assertEquals(4, tree.getHeight());
        assertTrue(tree.isPerfect());
        assertTrue(tree.isFull());
        assertTrue(tree.isComplete());
    }

    @Test
    void test_complete() {
        IntBinTree tree = new IntBinTree();
        assertTrue(tree.isComplete());

        tree = IntBinTree.createTree(new Integer[] { 1 });
        assert tree != null;
        assertTrue(tree.isComplete());

        tree = IntBinTree.createTree(new Integer[] { 1, 2 });
        assert tree != null;
        assertTrue(tree.isComplete());

        tree = IntBinTree.createTree(new Integer[] { 1, 2, 3 });
        assert tree != null;
        assertTrue(tree.isComplete());

        tree = IntBinTree.createTree(new Integer[] { 1, 2, 3, 4 });
        assert tree != null;
        assertTrue(tree.isComplete());

        IntBinTree subtree = tree.getRight();
        subtree.setLeft(new IntBinTree(6));
        assertFalse(tree.isComplete());
    }

}