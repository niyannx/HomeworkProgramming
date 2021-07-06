import java.util.Arrays;
import java.util.Scanner;

public class rows {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("INPUT ROWS : ");
        int rows = scan.nextInt();              // брой редове от конзолата
        System.out.println("INPUT COLUMNS : ");
        int cols = scan.nextInt();              // брой колони от конзолата
        int[][] arr = new int[rows][cols];

        System.out.println("FILL ARRAY : ");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                System.out.printf("[%d][%d] = ", i, j);
                arr[i][j] = scan.nextInt();           // запълваме масива
            }
        }
        int[] min_array = new int[rows];        // масив, който ще съдържа минимумите
        int[] max_array = new int[rows];
        int[] sums_array = new int[rows];
        float[] averages_array = new float[rows];

        System.out.println();
        System.out.println("YOUR ARRAY : ");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(arr[i]));        // принтираме масива
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            float sum = 0;
            float average;

            for (int j = 0; j < cols; j++) {
                sum = sum + arr[i][j];        // намираме сбора
                sums_array[i] = (int) sum;        // въвеждаме сумите от редовете в масив

                average = sum/cols;          // намираме ср. ар.
                averages_array[i] = average;     // въвеждаме ср. аритметичните в масив

                if (arr[i][j] < min) {
                    min = arr[i][j];          // намираме мин
                    min_array[i] = min;          // въвеждаме минимумите в масив
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];          // намираме макс
                    max_array[i] = max;          // въвеждаме максимумите в масив
                }
            }
        }
        System.out.println();
        System.out.println("THE SMALLEST NUMBERS ON EACH ROW : ");
        System.out.println(Arrays.toString(min_array));        // принтираме мин
        System.out.println();
        System.out.println("THE LARGEST NUMBERS ON EACH ROW : ");
        System.out.println(Arrays.toString(max_array));        // принтираме макс
        System.out.println();
        System.out.println("THE SUM OF EACH ROW  : ");
        System.out.println(Arrays.toString(sums_array));        // принтираме сбор
        System.out.println();
        System.out.println("THE AVERAGE OF EACH ROW : ");
        System.out.println(Arrays.toString(averages_array));    // принтираме ср. ар.
    }
}
