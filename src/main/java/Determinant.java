public class Determinant {
    public static double calculate(SparseMatrix matrix, int[]activeRows, int[]activeCols){
        // simplest base case
        if (activeRows.length == 1) {
            return matrix.getPosition(activeRows[0], activeCols[0]);
        }
        // second base case 2x2 matrix
        else if (activeRows.length == 2) {
            return (matrix.getPosition(activeRows[0],activeCols[0]) * matrix.getPosition(activeRows[1],activeCols[1])) - (matrix.getPosition(activeRows[0],activeCols[1]) * matrix.getPosition(activeRows[1], activeCols[0]));
        }

        // determinant storing
        double det = 0;

        // recursive loop
        for(int j=0; j < activeCols.length; j++) {
            // define sign of number to be multiplied
            double sign = Math.pow(-1, j);
            // if a value is found in current row -> repeat the Laplace on that position until base case is hit
            if (matrix.getPosition(activeRows[0], activeCols[j]) != 0) {
                det += sign * matrix.getPosition(activeRows[0], activeCols[j]) * calculate(matrix, removeIndex(activeRows, 0), removeIndex(activeCols, j));
            }
        }

        return det;

    }

    // since arrays are fixed, this method generates a copy of them minus row/col with a value != 0
    private static int[] removeIndex(int[] arr, int index) {
        int[] newList = new int[arr.length - 1];
        int indexed = 0;
        for(int i = 0; i < arr.length; i++){
            if(i != index) {
                newList[indexed] = arr[i];
                indexed ++;
            }
        }
        return newList;
    }
}
