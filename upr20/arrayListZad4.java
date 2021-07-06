package upr20;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListZad4 {
    public static void main(String[] args) {
        int cap = 6;
        ArrayList<String> Names = new ArrayList<>(cap);

        System.out.println("Enter the names of " + cap / 2 + " people : ");
        // cap / 2, защото 3-ма човека с по 2 имена => 6 елемента

        Scanner scan = new Scanner(System.in);

        // въвеждане на елементи от типа String от конзолата (имена)
        for(int i = 0 ; i < cap / 2; i++){
            System.out.println("Enter First Name : ");
            // въвеждаме първо име от конзолата
            Names.add(scan.nextLine());
            System.out.println("Enter Last Name : ");
            // въвеждаме фамилия
            Names.add(scan.nextLine());
        }

        // обръщане на реда на листа
        for (int i = 0; i < cap / 2; i++) {
            String temp = Names.get(i);
            Names.set(i, Names.get(cap - i - 1));
            Names.set(cap - i - 1, temp);
        }

        // разпечатване на обърнатия лист
        System.out.println("Your array backwards : ");
        int i = 0;
        for (String value : Names) {
            // на всеки 2 елемента да се слага ";" и нов ред
            if (i % 2 == 1) {
                System.out.print(value + "; ");
                System.out.println();
            } else {
                System.out.print(value + ", ");
            }
            i++;
        }
    }
}