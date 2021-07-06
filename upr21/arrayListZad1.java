package upr21;

import java.util.ArrayList;

public class arrayListZad1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // дефинираме списък

        arr.add(6); // запълваме списъка
        arr.add(7);
        arr.add(2);
        arr.add(3);
        arr.add(8);
        arr.add(9);
        arr.add(1);

        System.out.println("Content of ArrayList : " + arr);  // извеждаме списъка
        System.out.print("All even numbers of array : ");
        for (int i = 0; i < arr.size(); i++){
            if(arr.get(i) % 2 == 0){  // всички числа, делящи се на 2 без остатък -> всички четни
                System.out.print(arr.get(i) + " ");
            }
        }
    }
}
