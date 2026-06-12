package UASPrakt13;

public class BinarySearchTreeFilm13 {
    private NodeFilm13 root;

    // Constructor
    public BinarySearchTreeFilm13() {
        this.root = null;
    }

    // Method to check if tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Method to add film data to the tree
    public void add(Film13 data) {
        if (isEmpty()) {
            root = new NodeFilm13(data);
        } else {
            addRecursive(root, data);
        }
    }

    // Helper method to add data recursively
    private void addRecursive(NodeFilm13 node, Film13 data) {
        int comparison = data.getKodeFilm().compareTo(node.getData().getKodeFilm());

        if (comparison < 0) {
            if (node.getLeft() == null) {
                node.setLeft(new NodeFilm13(data));
            } else {
                addRecursive(node.getLeft(), data);
            }
        } else if (comparison > 0) {
            if (node.getRight() == null) {
                node.setRight(new NodeFilm13(data));
            } else {
                addRecursive(node.getRight(), data);
            }
        }
    }

    // Method to find film by code
    public boolean find(String kodeFilm) {
        return findRecursive(root, kodeFilm);
    }

    // Helper method to find data recursively
    private boolean findRecursive(NodeFilm13 node, String kodeFilm) {
        if (node == null) {
            return false;
        }

        int comparison = kodeFilm.compareTo(node.getData().getKodeFilm());

        if (comparison == 0) {
            return true;
        } else if (comparison < 0) {
            return findRecursive(node.getLeft(), kodeFilm);
        } else {
            return findRecursive(node.getRight(), kodeFilm);
        }
    }

    // Method to traverse in-order (ascending)
    public void traverseInOrder(NodeFilm13 node) {
        if (node != null) {
            traverseInOrder(node.getLeft());
            node.getData().tampilInformasi();
            System.out.println();
            traverseInOrder(node.getRight());
        }
    }

    // Method to traverse pre-order
    public void traversePreOrder(NodeFilm13 node) {
        if (node != null) {
            node.getData().tampilInformasi();
            System.out.println();
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }

    // Method to count total films in tree
    public int hitungJumlahFilm(NodeFilm13 node) {
        if (node == null) {
            return 0;
        }
        return 1 + hitungJumlahFilm(node.getLeft()) + hitungJumlahFilm(node.getRight());
    }

    // Method to find film with highest rating
    public Film13 cariRatingTertinggi(NodeFilm13 node) {
        if (node == null) {
            return null;
        }

        Film13 maxFilm = node.getData();
        Film13 leftMax = cariRatingTertinggi(node.getLeft());
        Film13 rightMax = cariRatingTertinggi(node.getRight());

        if (leftMax != null && leftMax.getRating() > maxFilm.getRating()) {
            maxFilm = leftMax;
        }
        if (rightMax != null && rightMax.getRating() > maxFilm.getRating()) {
            maxFilm = rightMax;
        }

        return maxFilm;
    }

    // Getter for root
    public NodeFilm13 getRoot() {
        return root;
    }
}
