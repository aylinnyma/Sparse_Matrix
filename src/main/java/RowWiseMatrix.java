public class RowWiseMatrix extends SparseMatrix{
    int dimension;
    Node [] rows;

    public RowWiseMatrix(int dimension){
        this.dimension = dimension;
        this.rows = new Node[dimension];
    }

    public int getDimension(){
        return dimension;
    }

    public double getPosition(int row, int col){
        Node current = rows[row - 1]; // start at head of that row
        while (current != null) {
            if (current.col == col){
                return current.value;
            }
            else {
                current = current.next;
            }
        }
        return 0; // not found
    }

    public void setRows(int row, int col, double val) {
        Node cell = new Node(col, val);
        if (rows[row - 1] != null) {
            cell.next = rows[row - 1];
        }
        rows[row - 1] = cell;
    }
}
