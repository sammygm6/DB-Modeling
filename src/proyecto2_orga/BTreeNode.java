package proyecto2_orga;

public class BTreeNode {

    public int[] key;
    public BTreeNode[] c;
    boolean isLeaf;
    public int n;
    private int T; //Each node has at least T-1 and at most 2T-1 keys
    public int height = 23;

    public BTreeNode(int t) {
        T = t;
        isLeaf = true;
        key = new int[2 * T - 1];
        c = new BTreeNode[2 * T];
        n = 0;
    }

    public boolean isFull() {
        return n == (2 * T - 1);
    }

    public void insert(int newKey) {
        int i = n - 1;
        if (isLeaf) {
            while ((i >= 0) && (newKey < key[i])) {
                key[i + 1] = key[i];
                i--;
            }
            n++;
            key[i + 1] = newKey;
        } else {
            while ((i >= 0) && (newKey < key[i])) {
                i--;
            }
            int insertChild = i + 1;
            if (c[insertChild].isFull()) {
                n++;
                c[n] = c[n - 1];
                for (int j = n - 1; j > insertChild; j--) {
                    c[j] = c[j - 1];
                    key[j] = key[j - 1];
                }
                key[insertChild] = c[insertChild].key[T - 1];
                c[insertChild].n = T - 1;

                BTreeNode newNode = new BTreeNode(T);
                for (int k = 0; k < T - 1; k++) {
                    newNode.c[k] = c[insertChild].c[k + T];
                    newNode.key[k] = c[insertChild].key[k + T];
                }

                newNode.c[T - 1] = c[insertChild].c[2 * T - 1];
                newNode.n = T - 1;
                newNode.isLeaf = c[insertChild].isLeaf;
                c[insertChild + 1] = newNode;
                if (newKey < key[insertChild]) {
                    c[insertChild].insert(newKey);
                } else {
                    c[insertChild + 1].insert(newKey);
                }
            } else {
                c[insertChild].insert(newKey);
            }
        }
    }
    
    public void delete(){
        
    }

    public void print() {
        //Prints all keys in the tree in ascending order
        if (isLeaf) {
            for (int i = 0; i < n; i++) {
                System.out.print(key[i] + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                c[i].print();
                System.out.print(key[i] + " ");
            }
            c[n].print();
        }
    }

    public void printNodes() {
        for (int i = 0; i < n; i++) {
            System.out.print(key[i] + " ");
        }
        System.out.println(isLeaf);
        if (!isLeaf) {
            for (int i = 0; i <= n; i++) {
                c[i].printNodes();
            }
        }
    }
}
