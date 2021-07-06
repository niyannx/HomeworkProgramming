package upr20;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListZad2 {
    public static void main(String[] args) {
        // cap - capacity
        int cap = 5;
        ArrayList<Integer> arr = new ArrayList<>(cap);

        System.out.println("Enter " + cap + " elements : ");
        Scanner scan = new Scanner(System.in);

        // въвеждане на елементи от конзолата
        for(int i = 0 ; i < cap ; i++){
            arr.add(scan.nextInt());
        }

        // разпечатване на списъка
        System.out.println("Your array : ");
        System.out.println(arr);
    }
}
