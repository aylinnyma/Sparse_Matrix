public class Node {

    int col;
    double value; // don't change this!! math library works with doubles
    Node next;

    // constructor
    public Node(int col, double val) {
        this.col = col;
        value = val;
        next = null;
    }
}
