package UB10.Aufgabe2;

import java.util.LinkedList;

public class TrieNode {

    private char letter;
    private int value;
    LinkedList<TrieNode> children;
    private final int R = 26;
    boolean isEnd;

    public TrieNode(char letter) {
      children = new LinkedList<TrieNode>();
      isEnd = false;
      setValue(-1);
      setLetter(letter);
    }

    public TrieNode(char letter, int value) {
      children = new LinkedList<TrieNode>();
      isEnd = false;
      setValue(value);
      setLetter(letter);
    }

    public int getValue() {
      return value;
	  }

    public void setValue(int value) {
      this.value = value;
	  }

    public char getLetter() {
      return letter;
    }

    public void setLetter(char letter) {
      this.letter = letter;
    }

    public TrieNode getChild(char c)
    {
    if (children != null)
    	for (TrieNode eachChild : children)
    		if (eachChild.getLetter() == c)
    			return eachChild;
    return null;
    }

    /**
     * Adds a new child node with the given key and value to this node.
     * @param letter The character of this node
     * @param value The value associated with this node, or -1 if no value is associated
     * @return The new child if it could be added or if a node with the given key is already
     *         there, null if there are already three children
     */
    public TrieNode addChild(char letter, int value) {
      if (children != null) {
        for (TrieNode eachchild : children) {
          if (eachchild.getLetter() == letter) {
            if (eachchild.getValue() == value) {
              return eachchild;
            }
          }
        }
      } 
      children.add(new TrieNode(letter, value));
      if (children != null) {
        for (TrieNode eachchild : children) {
          if (eachchild.getLetter() == letter) {
            if (eachchild.getValue() == value) {
              return eachchild;
            }
          }
        }
      }
      TrieNode dummy = new TrieNode(letter, value);
      return dummy; 
	  }

    /**
     * Searches this node's direct children for a node with the given key.
     * @param letter The character to look for
     * @return Returns the TrieNode with the given key if it was found, or null otherwise
     */
    public TrieNode find(char letter) {
      if (children != null) {
        for (TrieNode eachchild : children) {
          if (eachchild.getLetter() == letter) {
            return eachchild;
          }
        }
      }
      return null;
    }
}