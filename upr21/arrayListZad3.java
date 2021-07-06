package upr21;

import java.util.ArrayList;

public class arrayListZad3 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(); // дефинираме списък

        arr.add(3);  // запълваме
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(2);
        arr.add(2);

        System.out.println("Content of ArrayList : " + arr);  // принтираме списък

        int number = 0;
        int repetitions = 0;  // повторения
        int currentrep;

        for (int i = 0; i < arr.size(); i++) {
            currentrep = 0;
            int current = arr.get(i);
            for (int j = 0; j < arr.size(); j++) {
                if(current == arr.get(j)){
                    currentrep++;
                }
            }

            if(currentrep > repetitions){
                repetitions = currentrep;
                number = current;
            }
        }

        System.out.println("The most common number : ");
        for (int i = 0; i < repetitions; i++) {
            System.out.print(number + " ");
        }
    }
}
