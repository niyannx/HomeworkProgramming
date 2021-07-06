import java.util.Arrays;
import java.util.Scanner;

public class upr18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("INPUT ROWS : ");
        int rows = scan.nextInt();              // брой редове от конзолата
        System.out.println("INPUT COLUMNS : ");
        int cols = scan.nextInt();              // брой колони от конзолата
        int[][] matrix = new int[rows][cols];

        System.out.println("FILL ARRAY : ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.printf("[%d][%d] = ", i, j);
                matrix[i][j] = scan.nextInt();           // запълваме масива
            }
        }
        System.out.println("YOUR ARRAY : ");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        int bestSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;
        for (int row = 0; row < matrix.length - 1; row++){
            for(int col = 0; col < matrix[0].length - 1; col++){
                int sum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if(sum > bestSum){
                    bestSum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }

        System.out.println("BEST RESULT IS : ");
        System.out.printf("    %d %d%n", matrix[bestRow][bestCol], matrix[bestRow][bestCol + 1]);
        System.out.printf("    %d %d%n", matrix[bestRow + 1][bestCol], matrix[bestRow + 1][bestCol + 1]);
        System.out.printf("MAX SUM IS : %d%n", bestSum);

    }
}
