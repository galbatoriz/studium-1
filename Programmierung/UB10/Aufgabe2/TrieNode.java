package UB10.Aufgabe2;

public class TrieNode {

    private char letter;
    private int value;
    private TrieNode[] children;

    public TrieNode() {
        // this.letter ist nicht definiert
        this.value = -1;
        this.children = new TrieNode[3];
    }

    public TrieNode(char inLetter) {
        this.letter = inLetter;
        this.value = -1;
        this.children = new TrieNode[3];
    }

    // Getter und Setter

    public int getLetter() {
        return letter;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int inValue) {
        this.value = inValue;
    }

    /**
     * Adds a new child node with the given key and value to this node.
     * 
     * @param letter The character of this node
     * @param value  The value associated with this node, or -1 if no value is
     *               associated
     * @return The new child if it could be added or if a node with the given key is
     *         already
     *         there, null if there are already three children
     */
    public TrieNode addChild(char letter, int value) {
        TrieNode tn = find(letter);
        if (tn != null)
            return tn;
        for (int idx = 0; idx < 3; idx++) {
            if (children[idx] != null) {
                continue;
            }
            tn = new TrieNode(letter);
            tn.setValue(value);
            children[idx] = tn;
            return tn;
        }
        return null;
    }

    /**
     * Searches this node's direct children for a node with the given key.
     * 
     * @param letter The character to look for
     * @return Returns the TrieNode with the given key if it was found, or null
     *         otherwise
     */
    public TrieNode find(char letter) {
        for (TrieNode tn : children) {
            if (tn == null) {
                continue;
            } else {
                if (tn.getLetter() == letter) {
                    return tn;
                }
            }
        }
        return null;
    }

}