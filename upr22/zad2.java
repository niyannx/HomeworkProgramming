package upr22;

import java.util.*;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] parts = scanner.nextLine().split(" ");
        List<Integer> numbers = new ArrayList<>();

        for (String part : parts) {
            int current = Integer.parseInt(part);

            numbers.add(current);
        }
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) < 0){
                numbers.remove(i);
            }
        }

        if (numbers.isEmpty()){
            System.out.println("List is empty");
        }else{
            Collections.reverse(numbers);
            System.out.println(numbers);
        }
    }
}
