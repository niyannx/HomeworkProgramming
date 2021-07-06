package upr20;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListZad3 {
    public static void main(String[] args) {
        int cap = 5;
        ArrayList<String> arr = new ArrayList<>(cap);

        System.out.println("Enter the names of " + cap + " people : ");
        Scanner scan = new Scanner(System.in);

        // въвеждане на елементи от типа String от конзолата (имена)
        for(int i = 0 ; i < cap ; i++){
            arr.add(scan.nextLine());
        }

        // обръщане на реда на листа
        for (int i = 0; i < cap / 2; i++) {
            String temp = arr.get(i);
            arr.set(i, arr.get(cap - i - 1));
            arr.set(cap - i - 1, temp);
        }


        // разпечатване на обърнатия лист с знак ";" между елементите
        System.out.println();
        System.out.println("Your array backwards : ");
        System.out.println();
        for (String value : arr) {
            System.out.print(value + "; ");
        }
    }
}
