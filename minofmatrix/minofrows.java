package minofmatrix;

import java.util.Arrays;
import java.util.Scanner;

public class minofrows {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("INPUT ROWS : ");
        int rows = scan.nextInt();          // broi redove ot konzolata
        System.out.println("INPUT COLUMNS : ");
        int cols = scan.nextInt();          // broi koloni ot konzolata
        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.printf("[%d][%d] = ", i, j);
                arr[i][j] = scan.nextInt();         // vuvejdame elementite na masiva
            }
        }
        int[] minarr = new int[rows];

        System.out.println();
        System.out.println("YOUR ARRAY : ");

        for (int i = 0; i < rows; i++) {
            int min = Integer.MAX_VALUE;
            System.out.println(Arrays.toString(arr[i]));        // printirame suzdadeniq masiv
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    minarr[i] = min;            // namirame nai-malkite chisla v RED
                }
            }
        }
        System.out.println();
        System.out.println("THE SMALLEST NUMBER ON EACH ROW IS : ");
        System.out.println(Arrays.toString(minarr));
    }
}