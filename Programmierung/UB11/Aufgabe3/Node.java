package UB11.Aufgabe3;

public class Node {

    private Integer content; // Used as Key
    private IntBinTree left;
    private IntBinTree right;

    public Node(Integer content) {
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

    public IntBinTree getLeft() {
        return left;
    }

    public void setLeft(IntBinTree left) {
        this.left = left;
    }

    public IntBinTree getRight() {
        return right;
    }

    public void setRight(IntBinTree right) {
        this.right = right;
    }
}
