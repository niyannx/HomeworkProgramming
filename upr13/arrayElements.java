package upr13;
import java.util.Arrays;

public class arrayElements {
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 56, 4, 2, 17, 1, 0, -3, - 2, 15};
        int[] arr2 = {3, 6, 56, 4, 2, 17, 1, 0, -3, - 2, 15};

        int[] newArr = new int[arr1.length];

        for(int i = 0; i < arr1.length; i++){
            if(i % 2 == 0){
                newArr[i] = arr1[i];
            } else {
                newArr[i] = arr2[i];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
