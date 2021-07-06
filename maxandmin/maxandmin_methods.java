package maxandmin;

public class maxandmin_methods {

    static int findMin(int[] arr, int n){  // getting minimum element
        int el = arr[0];

        for (int i = 1; i < n; i++)
            el = Math.min(el, arr[i]);
        return el;
    }

    static int findMax(int[] arr, int n){   // getting maximum element
        int el = arr[0];

        for (int i = 1; i < n; i++)
            el = Math.max(el, arr[i]);
        return el;
    }
}
