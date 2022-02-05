package UB11.Aufgabe3;

public class IntBinTree {

	private IntNode root;

	public IntBinTree() {
	}

	public IntBinTree(Integer content) {
		this.root = new IntNode(content);
	}

	public IntBinTree(IntBinTree left, Integer content, IntBinTree right) {
		root = new IntNode(content);
		if (left != null) {
			root.setLeft(left.root);
		}
		if (right != null) {
			root.setRight(right.root);
		}
	}

	public boolean isAVLTree() {
		if (isEmpty()) {
			return true;
		}

		if (!isSearchTree()) {
			return false;
		}

		int balance = getRight().getHeight() - getLeft().getHeight();
		if (balance > 1 || balance < -1) {
			return false;
		}

		if (getLeft().getValue() != null) {
			return getLeft().isAVLTree();
		}

		if (getRight().getValue() != null) {
			return getRight().isAVLTree();
		}

		return true;
	}

	public boolean isSearchTree() {
		if (isEmpty()) {
			return true;
		}

		if (getLeft().getValue() != null) {
			if (getLeft().getValue() > getValue()) {
				return false;
			}
			if (!getLeft().isSearchTree()) {
				return false;
			}
		}

		if (getRight().getValue() != null) {
			if (getRight().getValue() < getValue()) {
				return false;
			}
			if (!getRight().isSearchTree()) {
				return false;
			}
		}

		return true;
	}

	private IntBinTree(IntNode root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public Integer getValue() {
		if (isEmpty()) {
			return null; // error
		}
		return root.getContent();
	}

	public IntBinTree getLeft() {
		if (isEmpty()) {
			return null; // error
		}
		return new IntBinTree(root.getLeft());
	}

	public void setLeft(IntBinTree tree) {
		if (isEmpty()) {
			return; // error
		}
		root.setLeft(tree.root);
	}

	public IntBinTree getRight() {
		if (this.isEmpty()) {
			return null; // error
		}
		return new IntBinTree(root.getRight());
	}

	public void setRight(IntBinTree tree) {
		if (this.isEmpty()) {
			return; // error
		}
		this.root.setRight(tree.root);
	}

	public int getHeight() {
		if (isEmpty()) {
			return 0;
		}
		return 1 + Math.max(getLeft().getHeight(), getRight().getHeight());
	}

}
