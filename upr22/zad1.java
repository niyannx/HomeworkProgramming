package upr22;

import java.util.*;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String part : parts) {
            int current = Integer.parseInt(part);

            numbers.add(current);
        }
        int index = numbers.get(numbers.size() -1);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == index){
                numbers.remove(i);
            }
        }
        System.out.println();
        System.out.println(numbers);
    }
}
