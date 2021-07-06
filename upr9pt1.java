import java.util.Arrays;

public class upr9pt1 {
    public static void main(String[] args) {
        int[] ARR = {8, 7, 3, 10, 2, 9, 12, 8, 1, 0, 5, 2};

        System.out.println("BEFORE SORTING : " + Arrays.toString(ARR));
        for (int i = 0; i < ARR.length; i++) {

            for (int k = 0; k < ARR.length - i; k++) {
                if (ARR[i] > ARR[i + k]) {
                    int a = ARR[i];

                    ARR[i] = ARR[i + k];
                    ARR[i + k] = a;
                }
            }
        } System.out.print("AFTER SORTING : ");
        System.out.print(Arrays.toString(ARR));
    }
}
