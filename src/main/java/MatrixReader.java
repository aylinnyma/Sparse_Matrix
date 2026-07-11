import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MatrixReader {

    // since this method id not going to be reused multiple times,
    // we can leave it as static, so no 'new' instances need to be declared
    public static SparseMatrix createMatrix(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        boolean firstLine = true;
        RowWiseMatrix matrix = null;

        while ((line = br.readLine()) != null) {
            // each line is a String, so we need to split it
            String[] parts = line.split(" ");
            // parts[0], parts[1], parts[2] are now the individual values as Strings
            if (firstLine) {
                firstLine = false;
                int num = Integer.parseInt(parts[0]);
                matrix = new RowWiseMatrix(num);
            } else {
                int row = Integer.parseInt(parts[0]);
                int col = Integer.parseInt(parts[1]);
                double val = Double.parseDouble(parts[2]);
                matrix.setRows(row, col, val);
            }
        }
        br.close();
        return matrix;

    }
}
