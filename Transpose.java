package Assignment4;

public class Transpose {
    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {3, 2, 1}, {6, 5, 4} };
        display(matrix);
        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        display(transpose);
    }
    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
