public class Determinant {
    public static double calculate(SparseMatrix matrix){
        // simplest base case
        if (matrix.getDimension() == 1) {
            return matrix.getPosition(1, 1);
        }
        // second base case 2x2 matrix
        else if (matrix.getDimension() == 2) {
            return (matrix.getPosition(1,1) * matrix.getPosition(2,2)) - (matrix.getPosition(1,2) * matrix.getPosition(2, 1));
        }
    }
}
