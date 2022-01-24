package UB11.Aufgabe1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // IntBinTree a = new IntBinTree(4);
        // IntBinTree b = new IntBinTree(5);
        // IntBinTree m = new IntBinTree(a, 10, b);
        // IntBinTree f = new IntBinTree(3);
        // IntBinTree p = new IntBinTree(f, 20, m);
        // IntBinTree x = new IntBinTree(8);
        // IntBinTree y = new IntBinTree(2);
        // IntBinTree n = new IntBinTree(x, 30, y);
        // IntBinTree d = new IntBinTree(p, 40, n);

        // System.out.println("Aufgabe 1b):");
        // ArrayList<Integer> content = new ArrayList<Integer>();
        // System.out.println(Arrays.toString(d.inorder()));

        // content.clear();
        // Integer[] values = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10 , 11, 12, 13, 14, 15, 16};
        // IntBinTree tree = IntBinTree.createTree(values);
        // System.out.println("Aufgabe 1c):");
        // System.out.println(Arrays.toString(tree.inorder()));
        // System.out.println("Aufgabe 1d) InnerNodes:");
        // System.out.println(tree.countInnerNodes());
        // System.out.println("Aufgabe 1d) Leaves:");
        // System.out.println(tree.countLeaves());
        // System.out.println("Aufgabe 1d) All Nodes:");
        // System.out.println(tree.countNodes());
        // System.out.println("Aufgabe 1d) Left Height:");
        // System.out.println(tree.getLeftHeight(tree.root));
        // System.out.println("Aufgabe 1d) Right Height:");
        // System.out.println(tree.getRightHeight(tree.root));
        // System.out.println("Aufgabe 1d) Real? Height:");
        // System.out.println(tree.getHeight());
        // System.out.println("Aufgabe 1e) isFull:");
        // System.out.println(tree.isFull());
        // System.out.println("Aufgabe 1e) isPerfect:");
        // System.out.println(tree.isPerfect());
        // System.out.println("Aufgabe 1e) iscomplete:");
        // System.out.println(tree.isComplete());

        // System.out.println("-------------------------------------");

        // Integer[] val = { };
        // IntBinTree tree2 = IntBinTree.createTree(val);
        // System.out.println("Aufgabe 1c):");
        // System.out.println(Arrays.toString(tree2.inorder()));
        // System.out.println("Aufgabe 1d) InnerNodes:");
        // System.out.println(tree2.countInnerNodes());
        // System.out.println("Aufgabe 1d) Leaves:");
        // System.out.println(tree2.countLeaves());
        // System.out.println("Aufgabe 1d) All Nodes:");
        // System.out.println(tree2.countNodes());
        // System.out.println("Aufgabe 1d) Left Height:");
        // System.out.println(tree2.getLeftHeight(tree2.root));
        // System.out.println("Aufgabe 1d) Right Height:");
        // System.out.println(tree2.getRightHeight(tree2.root));
        // System.out.println("Aufgabe 1d) Real? Height:");
        // System.out.println(tree2.getHeight());
        // System.out.println("Aufgabe 1e) isFull:");
        // System.out.println(tree2.isFull());
        // System.out.println("Aufgabe 1e) isPerfect:");
        // System.out.println(tree2.isPerfect());
        // System.out.println("Aufgabe 1e) iscomplete:");
        // System.out.println(tree2.isComplete());
        // System.out.println("In Order:");
        // ArrayList<Integer> content2 = new ArrayList<Integer>();
        // System.out.println(tree2.inorder());
        IntBinTree bts4 = new IntBinTree(4);
        IntBinTree bts7 = new IntBinTree(7);
        IntBinTree bts1 = new IntBinTree(1);
        IntBinTree bts13 = new IntBinTree(13);
        IntBinTree bts6 = new IntBinTree(bts4, 6, bts7);
        IntBinTree bts3 = new IntBinTree(bts1, 3, bts6);
        IntBinTree bts14 = new IntBinTree(bts13, 14, null);
        IntBinTree bts10 = new IntBinTree(null, 14, bts14);
        IntBinTree binarysearchtree1 = new IntBinTree(bts3, 8, bts10);
    
        // BTS2
        IntBinTree bta4 = new IntBinTree(4);
        IntBinTree bta7 = new IntBinTree(7);
        IntBinTree bta1 = new IntBinTree(1);
        IntBinTree bta13 = new IntBinTree(13);
        IntBinTree bta6 = new IntBinTree(bta4, 6, bta7);
        IntBinTree bta3 = new IntBinTree(bta1, 3, bta6);
        IntBinTree bta14 = new IntBinTree(null, 14, bta13);
        IntBinTree bta10 = new IntBinTree(null, 14, bta14);
        IntBinTree binarysearchtree2 = new IntBinTree(bta3, 8, bta10);

        System.out.println(binarysearchtree1.isAVLTree());
        System.out.println(binarysearchtree2.isAVLTree());
    }
    
}