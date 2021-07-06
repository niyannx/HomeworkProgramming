package upr20;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashMapZad3i4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("INPUT NUMBER OF NAMES");
        int size = Integer.parseInt(scan.nextLine());

        HashMap<String, String> names = new HashMap<>(size);
        for (int i = 0; i < size; i++) {
            System.out.println("INPUT FIRST NAME : ");
            String firstName = scan.nextLine();
            System.out.println("INPUT LAST NAME : ");
            String lastName = scan.nextLine();
            names.put(firstName, lastName);
            System.out.println("NEXT PERSON------------------------------");
        }
        System.out.println("NAMES :");
        for (Map.Entry<String, String> i : names.entrySet()) {
            System.out.println(i.getKey() + " " + i.getValue());
        }

        System.out.println("-----------------------------");
        System.out.println("REVERSED NAMES :");
        for (Map.Entry<String, String> i : names.entrySet()) {
            System.out.println(i.getValue() + " " + i.getKey());
        }
    }
}