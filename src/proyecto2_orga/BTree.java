/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_orga;

public class BTree {

    public BTreeNode root;
    private int T; 
    private int height;
    private boolean isEmpty = false;

    public BTree(){
        this.isEmpty = true;
    }
    
    public BTree(int t) {
        root = new BTreeNode(t);
        T = t;
        height = 0;
        this.isEmpty = false;
    }

    public void printHeight() {
        System.out.println("Tree height is " + height);
    }
    
    public boolean isEmpty(){
        return this.isEmpty;
    }
    
    public void insert(int newKey) {
        if (root.isFull()) {
            split();
            height++;
        }
        root.insert(newKey);
    }

    public void print() {
        root.print();
    }

    public void printNodes() {
        root.printNodes();
    }

    public void split() {
        BTreeNode leftChild = new BTreeNode(T);
        BTreeNode rightChild = new BTreeNode(T);
        leftChild.isLeaf = root.isLeaf;
        rightChild.isLeaf = root.isLeaf;
        leftChild.n = T - 1;
        rightChild.n = T - 1;
        int median = T - 1;
        for (int i = 0; i < T - 1; i++) {
            leftChild.c[i] = root.c[i];
            leftChild.key[i] = root.key[i];
        }
        leftChild.c[median] = root.c[median];
        for (int i = median + 1; i < root.n; i++) {
            rightChild.c[i - median - 1] = root.c[i];
            rightChild.key[i - median - 1] = root.key[i];
        }
        rightChild.c[median] = root.c[root.n];
        root.key[0] = root.key[median];
        root.n = 1;
        root.c[0] = leftChild;
        root.c[1] = rightChild;
        root.isLeaf = false;
    }
}
