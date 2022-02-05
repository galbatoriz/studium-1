package UB11.Aufgabe3;

import java.util.LinkedList;
import java.util.Queue;

public class IntNode {

    private Integer content;
    private IntNode left;
    private IntNode right;

    public IntNode(Integer content) {
        this.content = content;
        left = null;
        right = null;
    }

    public Integer getContent() {
        return content;
    }

    public void setContent(Integer content) {
        this.content = content;
    }

    public IntNode getLeft() {
        return left;
    }

    public void setLeft(IntNode left) {
        this.left = left;
    }

    public IntNode getRight() {
        return right;
    }

    public void setRight(IntNode right) {
        this.right = right;
    }

    public IntNode insertLevelOrder(Integer[] arr, IntNode root, int i) {

        if (i < arr.length) {
            IntNode temp = new IntNode(arr[i]);
            root = temp;

            root.left = insertLevelOrder(arr, root.left, 2 * i + 1);

            root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
        }
        return root;
    }

    ///////////// Aufgabe 3 UB 11 /////////////

    public int getLeftHeight(IntNode node) {
        if (node == null) {
            return 0;
        }

        Queue<IntNode> queue = new LinkedList<IntNode>();
        queue.add(node);
        int count = 0;

        while (!queue.isEmpty()) {
            IntNode temp = queue.poll();
            if (temp.getLeft() != null || temp.getLeft() == null) {
                count++;
            }

            // Falls vorhanden Linke Kinder des Nodes in die Queue packen
            if (temp.getLeft() != null) {
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
            if (temp.getRight() != null || temp.getRight() == null) {
                count++;
            }

            // Falls vorhanden Linke Kinder des Nodes in die Queue packen
            if (temp.getRight() != null) {
                queue.add(temp.getRight());
            }
        }
        return count;
    }
}