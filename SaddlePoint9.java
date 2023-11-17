import java.util.Scanner;

public class SaddlePoint9{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the matrix (n): ");
        int n = in.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        boolean foundSaddlePoint = false;
        for (int i = 0; i < n; i++) {
            int rowMin = matrix[i][0];
            int colIdx = 0;

            // Find minimum element in the row
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIdx = j;
                }
            }

            // Check if it's also maximum in its column
            int k;
            for (k = 0; k < n; k++) {
                if (rowMin < matrix[k][colIdx]) {
                    break;
                }
            }

            if (k == n) {
                foundSaddlePoint = true;
                System.out.println("Saddle Point: " + rowMin);
                break;
            }
        }

        if (!foundSaddlePoint) {
            System.out.println("No Saddle Point");
        }

    
    }

}
