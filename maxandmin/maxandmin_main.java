package maxandmin;

import java.util.Arrays;
import java.util.Scanner;

class maxandmin_main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("HOW MANY ELEMENTS WOULD YOU LIKE TO HAVE IN YOUR ARRAY? (at least 2)");
        int n = scan.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.printf("INSERT ELEMENT [%d]: ", i);
            arr[i] = scan.nextInt();
        }
        System.out.println("Your array : " + Arrays.toString(arr));
        System.out.println("The largest in array is : " + maxandmin_methods.findMax(arr,n));
        System.out.println("The smallest in array is : " + maxandmin_methods.findMin(arr,n));
    }
}
