package UB10.Aufgabe2;

public class Trie {

  private TrieNode root;

  public Trie() {
    this.root = new TrieNode(' ');
  }

  /**
   * Adds a new value with the given key to the trie, creating new TrieNodes as
   * required.
   * 
   * @param key   The character sequence associated with the new value
   * @param value The new value
   * @return True if the value could be added to the trie, false otherwise
   */
  public boolean addValue(char[] key, int value) {
    if (findValue(key) == value) {
      return true;
    }
    // System.out.println("Testing1");
    TrieNode current = root;
    // System.out.println("Main Root: "+current.getLetter());
    for (char character : key) {
      TrieNode child = current.getChild(character);
      // System.out.println("Currents Cild:
      // "+current.getChild(character).getLetter());
      // System.out.println("Testing");
      if (child != null) {
        current = child;
      } else {
        current.addChild(character, -1);
        // System.out.println("Adding: "+character);
        current = current.getChild(character);
        // System.out.println(current.getLetter());
      }
    }
    current.setValue(value);
    // System.out.println(current.getValue());
    current.isEnd = true;
    return true;
  }

  /**
   * Returns the value associated with a given key, or -1 if the key could not be
   * found.
   * 
   * @param key The given key
   * @return The associated value, or -1 if the key is not represented in this
   *         trie
   */
  public int findValue(char[] key) {
    TrieNode current = root;
    int lenght = key.length;
    char lastchar = key[lenght - 1];
    for (char character : key) {
      if (current.getChild(character) == null) {
        // System.out.println("Failed");
        return -1;
      } else {
        current = current.getChild(character);
      }
      if (current.isEnd == true && current.getLetter() == lastchar) {
        return current.getValue();
      }
    }
    return -1;
  }
}