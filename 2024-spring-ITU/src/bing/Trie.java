package bing;

import java.util.Scanner;

class TrieNode {
    TrieNode[] children;
    int wordCount; // Count of words that end at this node

    TrieNode() {
        children = new TrieNode[26]; // Assuming lowercase English alphabets
        wordCount = 0;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int charIndex = charToIndex(ch);
            if (node.children[charIndex] == null)
                node.children[charIndex] = new TrieNode();

            node = node.children[charIndex];
            node.wordCount++; // Increment the word count at each node
        }
    }

    public int countPreviousWordsWithPrefix(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int charIndex = charToIndex(ch);
            if (node.children[charIndex] == null)
                return 0; // If prefix not found, return 0

            node = node.children[charIndex];
        }
        return node.wordCount; // Return the word count at the node representing the prefix
    }

    private int charToIndex(char ch) {
        // Converts character to corresponding index in the children array
        return ch - 'a'; // Assuming lowercase English alphabets
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trie trie = new Trie();

        int n = sc.nextInt();

        for (int i = 0; i<n; i++){
            String word = sc.next();
            System.out.println(trie.countPreviousWordsWithPrefix(word));
            trie.insert(word);
        }
    }
}
