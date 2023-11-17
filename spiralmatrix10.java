import java.util.Scanner;

public class spiralmatrix10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        fillReverseSpiralMatrix(matrix, n);

        // Print the filled matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void fillReverseSpiralMatrix(int[][] matrix, int n) {
        int num = n * n;
        int row = 0, col = 0;
        int direction = 0; // 0: right, 1: down, 2: left, 3: up

        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        for (int i = num; i >= 1; i--) {
            matrix[row][col] = i;

            if (direction == 0) {
                col++;
                if (col > right) {
                    col--;
                    row++;
                    direction = 1;
                    top++;
                }
            } else if (direction == 1) {
                row++;
                if (row > bottom) {
                    row--;
                    col--;
                    direction = 2;
                    right--;
                }
            } else if (direction == 2) {
                col--;
                if (col < left) {
                    col++;
                    row--;
                    direction = 3;
                    bottom--;
                }
            } else if (direction == 3) {
                row--;
                if (row < top) {
                    row++;
                    col++;
                    direction = 0;
                    left++;
                }
            }
        }
    }
}
