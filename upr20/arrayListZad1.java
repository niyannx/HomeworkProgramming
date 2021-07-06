package upr20;

import java.util.ArrayList;

public class arrayListZad1 {
    public static void main(String[] args) {

        // създаване на ArrayList от целочислени елементи
        ArrayList<Integer> arr = new ArrayList<>(5);
        // capacity - броят елементи = 5

        //въвеждане на елементи
        arr.add(11);
        arr.add(22);
        arr.add(33);
        arr.add(44);
        arr.add(55);

        // разпечатване на списъка
        System.out.println("Content of ArrayList : " + arr);
    }
}
