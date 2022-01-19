package UB11.Aufgabe3;

public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = new Integer[] { 3, 2, 4, 5 };
        IntBinTree tree1 = IntBinTree.createTree(arr1);
        System.out.println(tree1.isSearchTree());
    }
}

// import static org.junit.jupiter.api.Assertions.*;

// import org.junit.Test;

// public class IntBinTreeTest {

// @Test
// void isSearchTreeTest() {
// Integer[] arr1 = new Integer[] { 3, 2, 4, 5 };
// IntBinTree tree1 = IntBinTree.createTree(arr1);
// assertFalse(tree1.isSearchTree());

// Integer[] arr2 = new Integer[] { 3, 2, 4, 3 };
// IntBinTree tree2 = IntBinTree.createTree(arr2);
// assertTrue(tree2.isSearchTree());
// }
// }
