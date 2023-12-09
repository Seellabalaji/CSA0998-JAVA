import java.util.Scanner;
public class MatrixMul {
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of rows for the first matrix: ");
int rowsA = s.nextInt();
System.out.print("Enter the number of columns for the first matrix: ");
int columnsA = s.nextInt();
System.out.println("Enter elements for the first matrix:");
int[][] matrixA = readMatrixElements(rowsA, columnsA, s);
System.out.print("Enter the number of rows for the second matrix: ");
int rowsB = s.nextInt();
System.out.print("Enter the number of columns for the second matrix: ");
int columnsB = s.nextInt();
System.out.println("Enter elements for the second matrix:");
int[][] matrixB = readMatrixElements(rowsB, columnsB, s);
if (columnsA != rowsB) {
System.out.println("Matrix multiplication not possible. Columns of first matrix should be equal to rows of the second matrix.");
return;
}
int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);
System.out.println("Resultant matrix after multiplication:");
printMatrix(resultMatrix);
}
public static int[][] readMatrixElements(int rows, int columns, Scanner scanner) {
int[][] matrix = new int[rows][columns];
for (int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
matrix[i][j] = scanner.nextInt();
}
}
return matrix;
}
public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
int rowsA = matrixA.length;
int columnsA = matrixA[0].length;
int columnsB = matrixB[0].length;
int[][] resultMatrix = new int[rowsA][columnsB];
for (int i = 0; i < rowsA; i++) {
for (int j = 0; j < columnsB; j++) {
for (int k = 0; k < columnsA; k++) {
resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
}
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
