import java.util.Scanner;

public class upr14_with_enhanced_for {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] marks = new double[5];  // дефинираме масив с 5 елемента
        double sum = 0; // сборът на оценките

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("INSERT MARK [%d] OF STUDENT (BETWEEN 2 AND 6) : ", i);
            marks[i] = scan.nextInt();  // въвеждаме елементите на масива (оценките на ученика)
        }

        System.out.println();
        findAndPrintAverage(marks, sum);  // извикваме метода за средния успех
        System.out.println("    THE LOWEST GRADE :" + findMin(marks, marks.length));  // извикваме за най-ниската оценка
        System.out.println("    THE HIGHEST GRADE :" + findMax(marks, marks.length));  // за най-високата оценка
    }
                                                    // UTILITIES

    public static void findAndPrintAverage(double[] marks, double sum) {
        for (double mark : marks) {            // USING ENHANCED FOR
            sum = sum + mark;
        }
        System.out.println("    AVERAGE GRADE: " + (sum / marks.length));  // формула за средно аритметично
    }

    static double findMin(double[] marks, int n) {
        double el = marks[0];

        for (int i = 1; i < n; i++)
            el = Math.min(el, marks[i]); // намиране на минимум
        return el;
    }

    static double findMax(double[] marks, int n) {
        double el = marks[0];

        for (int i = 1; i < n; i++)
            el = Math.max(el, marks[i]);  // намиране на максимум
        return el;
    }
}
