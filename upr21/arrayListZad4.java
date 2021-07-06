package upr21;

import java.util.Scanner;

public class arrayListZad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (with spaces between every number) : ");

        String text = scanner.nextLine();
        String[] arr = text.split(" ");


        for (int i = 0; i < arr.length; i++) {
            String[] smallarr = arr[i].split("");

            for (int j = 0; j < smallarr.length/2; j++) {
                String buff = smallarr[j];
                smallarr[j] = smallarr[smallarr.length - j - 1];
                smallarr[smallarr.length - j - 1] = buff;
            }
            String all = "";
            for (int j = 0; j < smallarr.length; j++) {
                all += smallarr[j];
            }
            arr[i] = all;
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= Integer.parseInt(arr[i]);
        }
        System.out.println("The sum of the numbers backwards (12 34 56 -> 21+43+65=129) : ");
        System.out.println(sum);
    }
}
