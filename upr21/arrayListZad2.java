package upr21;

import java.util.ArrayList;

public class arrayListZad2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(); // дефинираме списък

        arr.add(6);  // запълваме
        arr.add(7);
        arr.add(2);
        arr.add(3);
        arr.add(8);
        arr.add(9);
        arr.add(1);

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > max){  // намираме макс
                max = arr.get(i);
            }
            if(arr.get(i) < min){
                min = arr.get(i);  // намираме мин
            }
        }
        System.out.println("Content of ArrayList : " + arr); // принтираме списъка
        System.out.println("Smallest number in array : " + min);  // мин
        System.out.println("Largest number in array : " + max);  // макс
    }
}
