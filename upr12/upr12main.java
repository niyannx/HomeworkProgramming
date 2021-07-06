package upr12;

import java.util.Arrays;

public class upr12main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {1, 2, 3, 4, 5, 6};

        System.out.println(" ARRAY 1 : " + Arrays.toString(arr1));
        upr12methods.reverseArray(arr1, arr1.length);
        System.out.println(" ARRAY 2 : " + Arrays.toString(arr2));
        upr12methods.reverseArray(arr2, arr2.length);

        System.out.println(" ARE THOSE ARRAYS THE SAME SIZE? ");
        upr12methods.compareLength(arr1.length, arr2.length);
    }
}
