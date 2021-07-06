package upr13;

import java.util.Scanner;

public class symmetricArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("ENTER LENGTH OF ARRAY : ");

        int length = scan.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.printf("INSERT ELEMENT [%d]: ", i);
            arr[i] = scan.nextInt();
        }
        boolean isSymmetric = false;
        for(int i = 0; i < (arr.length + 1) / 2; i++){
            if(arr[i] != arr[arr.length - i - 1]){
                isSymmetric = false;
            } else {
                isSymmetric = true;
            }
        }
        if(isSymmetric){
            System.out.println("THIS ARRAY IS SYMMETRIC");
        } else {
            System.out.println("THIS ARRAY IS NOT SYMMETRIC");
        }
    }
}
