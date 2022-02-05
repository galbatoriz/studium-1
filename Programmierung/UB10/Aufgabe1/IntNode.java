package UB10.Aufgabe1;

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
}