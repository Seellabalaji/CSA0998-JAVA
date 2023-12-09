import java.util.Scanner;
public class MatrixAdd {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of rows: ");
int rows = s.nextInt();
System.out.print("Enter the number of columns: ");
int columns = s.nextInt();
System.out.println("Enter elements for the first matrix:");
int[][] matrixA = readMatrixElements(rows, columns, s);
System.out.println("Enter elements for the second matrix:");
int[][] matrixB = readMatrixElements(rows, columns, s);
int[][] resultMatrix = addMatrices(matrixA, matrixB);
System.out.println("Resultant matrix after addition:");
printMatrix(resultMatrix);
}
public static int[][] readMatrixElements(int rows, int columns, Scanner s) {
int[][] matrix = new int[rows][columns];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
matrix[i][j] = s.nextInt();
}
}
return matrix;
}
public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
int rows = matrixA.length;
int columns = matrixA[0].length;
int[][] resultMatrix = new int[rows][columns];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
}
}
return resultMatrix;
}
public static void printMatrix(int[][] matrix) {
for (int[] row : matrix) {
for (int element : row) {
System.out.print(element + " ");
}
System.out.println();
}
}
}
