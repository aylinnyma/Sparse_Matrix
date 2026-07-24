import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SparseMatrix matrix= MatrixReader.createMatrix("4x4.txt");

        // build initial arrays
        int[] activeRows = new int[matrix.getDimension()];
        int[] activeCols = new int[matrix.getDimension()];

        // populate lists from index 0
        for(int i=1; i <= activeRows.length; i++){
            activeRows[i-1] = i;
            activeCols[i-1] = i;
        }

        double res = Determinant.calculate(matrix, activeRows, activeCols);

        System.out.println(res);
    }
}
