package UB11.Aufgabe1;

import java.util.Queue;

import javax.swing.text.StyledEditorKit.BoldAction;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntBinTree {

    public IntNode root;

    public IntBinTree() {}

    public IntBinTree(Integer content) {
        this.root = new IntNode(content);
    }

    public IntBinTree(IntBinTree left, Integer content, IntBinTree right) {
        this.root = new IntNode(content);
        if (left != null) {
            root.setLeft(left.root);   
        }
        if (right != null) {
            root.setRight(right.root);
        }
    }

    private IntBinTree(IntNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Integer getValue() {
        if (isEmpty()) {
            return null;            //Error
        }
        return root.getContent();
    }

    public IntBinTree getLeft() {
        if(isEmpty()) {
            return null;            // Error
        }
        return new IntBinTree(root.getLeft());
    }
    
    public IntBinTree getRight() {
        if(this.isEmpty()) {
            return null;            // Error
        }
        return new IntBinTree(root.getRight());
    }
    
    public void setLeft(IntBinTree tree) {
        root.setLeft(tree.root);
    }

    public void setRight(IntBinTree tree) {
        root.setRight(tree.root);
    }

    public Integer[] inorder() {
        ArrayList<Integer> content = new ArrayList<Integer>();
        return pirvateinorder(content);
    }

    private Integer[] pirvateinorder(ArrayList<Integer> content) {
        if (!isEmpty()) {
            getLeft().pirvateinorder(content);
            content.add(getValue());
            getRight().pirvateinorder(content);
            Integer[] n = content.toArray(new Integer[0]);
            return n;
        }
        return null;
    }

    public static IntBinTree createTree(Integer[] values) {
        if (values.length == 0) {
            IntBinTree tree = new IntBinTree();
            return tree;
        }
        IntNode mainroot = new IntNode(values[0]);
        IntBinTree tree = new IntBinTree(mainroot);
        tree.root = tree.root.insertLevelOrder(values, mainroot, 0);
        return tree;   
    }

    public int countNodes() {
       int count = this.countInnerNodes() + this.countLeaves();
       return count;
    }

    public int countInnerNodes() {
        if (root == null) {
            return 0;  
        }
        Queue<IntNode> queue = new LinkedList<IntNode>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            IntNode temp = queue.poll();
            if (temp.getLeft() != null || temp.getRight() != null) {
                count++;
            }
            
            // Falls vorhanden Kinder des Nodes in die Queue packen
            if (temp.getLeft() != null)
            {
                queue.add(temp.getLeft());
            }
 
            if (temp.getRight() != null)
            {
                queue.add(temp.getRight());
            }
        }
        return count;
    }

    public int countLeaves() {
        if (root == null) {
            return 0;  
        }
        Queue<IntNode> queue = new LinkedList<IntNode>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            IntNode temp = queue.poll();
            if (temp.getLeft() == null && temp.getRight() == null) {
                count++;
            }
            
            // Falls vorhanden Kinder des Nodes in die Queue packen
            if (temp.getLeft() != null)
            {
                queue.add(temp.getLeft());
            }
 
            if (temp.getRight() != null)
            {
                queue.add(temp.getRight());
            }
        }
        return count;
    }

    public int getLeftHeight(IntNode node) {
        if (node == null) {
            return 0;  
        }

        Queue<IntNode> queue = new LinkedList<IntNode>();
        queue.add(node);
        int count = 0;

        while (!queue.isEmpty()) {
            IntNode temp = queue.poll();
            if (temp.getLeft() != null || temp.getLeft() == null ) {
                count++;
            }
            
            // Falls vorhanden Linke Kinder des Nodes in die Queue packen
            if (temp.getLeft() != null)
            {
                queue.add(temp.getLeft());
            } 
        }
        return count;
    }

    public int getRightHeight(IntNode node) {
        if (node == null) {
            return 0;  
        }

        Queue<IntNode> queue = new LinkedList<IntNode>();
        queue.add(node);
        int count = 0;

        while (!queue.isEmpty()) {
            IntNode temp = queue.poll();
            if (temp.getRight() != null || temp.getRight() == null ) {
                count++;
            }
            
            // Falls vorhanden Linke Kinder des Nodes in die Queue packen
            if (temp.getRight() != null)
            {
                queue.add(temp.getRight());
            } 
        }
        return count;
    }

    public int getHeight() {
        if (root == null) {
            return -1;
        }
        return maxDepth(this.root) + 1;
    }

    private int maxDepth(IntNode node) {
        if (node == null) {
            return -1;            
        } else {
            int leftDepth = maxDepth(node.getLeft());
            int rightDepth = maxDepth(node.getRight());
            if (leftDepth > rightDepth) {
                return (leftDepth + 1);
            } else {
                return (rightDepth + 1);
            }
        }
    }

    public boolean isFull() {
        if (root == null) {
            return false;  
        }
        if (this.countNodes() == 2) {
            return true;            
        }

        Queue<IntNode> queue = new LinkedList<IntNode>();
        queue.add(root);
        int count = 0;

        while (!queue.isEmpty()) {
            IntNode temp = queue.poll();
            if (temp.getLeft() != null && temp.getRight() == null ) {
                count++;
            }
            if (temp.getLeft() == null && temp.getRight() != null ) {
                count++;
            }
                        
            // Falls vorhanden, Kinder des Nodes in die Queue packen
            if (temp.getLeft() != null)
            {
                queue.add(temp.getLeft());
            }

            if (temp.getRight() != null)
            {
                queue.add(temp.getRight());
            }
        }
        if (count > 0) {
            return false;    
        } else {
            return true;
        }
    }

    public boolean isComplete() {
        if (root == null) {
            return true; 
        }
        Queue<IntNode> queue = new LinkedList<>();
        boolean nonfullnode = false;

        queue.add(root);
        while (!queue.isEmpty()) {
            IntNode temp = queue.poll();
            
            if (temp.getLeft() != null) {
                if (nonfullnode) {
                    return false;
                }
                
                queue.add(temp.getLeft());
            } else {
                nonfullnode = true;
            }

            if (temp.getRight() != null) {
                if (nonfullnode) {
                    return false;
                }
                
                queue.add(temp.getRight());
            } else {
                nonfullnode = true; 
            }

        }
        return true;
    }

    public boolean isPerfect() {
        if (root == null) {
            return true;  
        }
        if (getLeftHeight(this.root) != getRightHeight(this.root)) {
            return false;
        }
        Queue<IntNode> queue = new LinkedList<IntNode>();
        queue.add(root);
        boolean leavediscorverd = false;
        int leavedepth = 10;
     
        while (!queue.isEmpty()) {
            IntNode temp = queue.poll();
            if (temp.getLeft() != null && temp.getRight() != null)
            {
                if (leavediscorverd)
                    return false;
                else {   
                    queue.add(temp.getLeft());
                    queue.add(temp.getRight());
                }
            }
            else if (temp.getLeft() == null && temp.getRight() == null)
            {
                leavediscorverd = true;
 
            }
            else if (temp.getLeft() == null || temp.getRight() == null)
                return false;
        }
        return true;
    }

    ///////////// Aufgabe 3 UB 11 /////////////

    public boolean isSearchTree() {
        if (!privateisSearchTree(this.root)) {
            return false;
        }
        return true;
    }

    private boolean privateisSearchTree(IntNode node) {
        if (node == null) {
            return true;
        }

        // False if left > root
        if (node.getLeft() != null && root.getLeft().getContent() > node.getContent()) {
            return false;
        }

        // False if right < root
        if (node.getRight() != null && node.getRight().getContent() < node.getContent()) {
            return false;    
        }
        
        // False if left or right is not a SearchTree
        if (!privateisSearchTree(node.getLeft()) || !privateisSearchTree(node.getRight())) {
            return false;
        }
        
        // All passed
        return true;
    }
    
    public boolean isAVLTree() {
        
        // Leere Bäume sind AVL Bäume
        if (root == null) {
            return true;    
        }

        // AVL Bäume sind BST
        if (!privateisAVLTree(this.root)) {
            return false;
        }
        return true;
    }

    private boolean privateisAVLTree(IntNode node) {
        if (node == null) {
            return true;
        }

        // Falsch falls das Delta nicht -1, 0, oder 1 ist
        if (node.getRightHeight(node) - node.getLeftHeight(node) >= 2 || node.getRightHeight(node) - node.getLeftHeight(node) <= -2 ) {
            return false;    
        }

        // Rekusion
        if (node.getLeft() == null && node.getRight() == null) {
            return true;
        }

        if (node.getLeft() == null && node.getRight() != null) {
            if (!privateisAVLTree(node.getRight())) {
                return false;    
            }    
        }
        if ((node.getLeft() != null && node.getRight() == null)) {
            if (!privateisAVLTree(node.getLeft())) {
                return false;    
            }
        }
        if (!privateisAVLTree(node.getLeft()) || !privateisAVLTree(node.getRight())) {
            return false;    
        }

        // All passed
        return true;
    }
}