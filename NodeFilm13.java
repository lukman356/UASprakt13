package UASPrakt13;

public class NodeFilm13 {
    public Film13 data;
    public NodeFilm13 left;
    public NodeFilm13 right;

    // Constructor
    public NodeFilm13(Film13 data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // Method to get film data
    public Film13 getData() {
        return data;
    }

    // Method to set film data
    public void setData(Film13 data) {
        this.data = data;
    }

    // Method to get left node
    public NodeFilm13 getLeft() {
        return left;
    }

    // Method to set left node
    public void setLeft(NodeFilm13 left) {
        this.left = left;
    }

    // Method to get right node
    public NodeFilm13 getRight() {
        return right;
    }

    // Method to set right node
    public void setRight(NodeFilm13 right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "NodeFilm{" +
                "data=" + data +
                '}';
    }
}
