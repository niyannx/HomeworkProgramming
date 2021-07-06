package upr15;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("INPUT NUMBER OF ROWS : ");
        int row = scan.nextInt();
        System.out.println("INPUT NUMBER OF COLUMNS : ");
        int col = scan.nextInt();
        int[][] matrix = new int[row][col];

        System.out.println();
        System.out.println("INPUT ELEMENTS : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println();
        System.out.println("YOUR ARRAY : ");

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("[%d]", matrix[i][j]);
            }
        }
    }
}