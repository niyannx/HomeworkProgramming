package minofmatrix;

import java.util.Arrays;
import java.util.Scanner;

public class minofcols {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("INPUT ROWS : ");
        int rows = scan.nextInt();          // broi redove ot konzolata
        System.out.println("INPUT COLUMNS : ");
        int cols = scan.nextInt();          // broi koloni ot konzolata
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("[%d][%d] = ", i, j);
                arr[i][j] = scan.nextInt();         // vuvejdame elementite na masiva
            }
        }
        int[] minarr = new int[cols];

        System.out.println();
        System.out.println("YOUR ARRAY : ");
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }

        System.out.println();
        System.out.println("THE SMALLEST NUMBER ON EACH COLUMN IS : ");
        System.out.println();

        for(int i = 0; i < cols; i++) {
            int min = arr[0][i];
            for (int j = 0; j < rows; j++) {
                if (arr[j][i] < min) {
                    min = arr[j][i];
                    minarr[i] = min;
                }
            }
        }
        System.out.println(Arrays.toString(minarr));
    }
}