package upr12;

import java.util.Arrays;

public class upr12methods {
    static void reverseArray(int[] arr, int size) {
        int item;
        for(int i = 0; i < size / 2; i++){
            item = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = item;
        }
        System.out.println(" REVERSE ARRAY 1 : " + Arrays.toString(arr));
    }
    static void compareLength(int arr1size, int arr2size){
        if(arr1size == arr2size){
            System.out.println(" YES ");
        } else {
            System.out.println(" NO ");
        }
    }
}
