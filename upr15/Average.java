package upr15;

import java.util.Scanner;
import java.util.Arrays;

public class Average {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("INPUT NUMBER OF ROWS : ");
        int rows = scan.nextInt();          // number of rows from console
        System.out.println("INPUT NUMBER OF COLUMNS : ");
        int cols = scan.nextInt();          // number of cols from console

        System.out.println();
        System.out.println("INPUT ELEMENTS : ");
        int[][] matrix = new int[rows][cols];           // implement 2d array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                matrix[i][j] = scan.nextInt();         // import elements from console
            }
        }

        System.out.println("YOUR ARRAY IS : ");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));           // print the 2d array
        }

        float sum = 0;
        float average = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum = sum + matrix[i][j];           // sum of all elements in row
                average = sum/cols;             // finding the average
            }
            System.out.println("AVERAGE OF ROW " + i + " IS : " + average);
            sum = 0;
            average = 0;
        }
    }
}
