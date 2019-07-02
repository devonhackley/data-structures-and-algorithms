package challenges;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int [] arr){
        int n = arr.length;

        if(arr.length > 1) {
            int middle = n/2;
            // https://www.geeksforgeeks.org/java-util-arrays-copyofrange-java/
            int[] b = Arrays.copyOfRange(arr, 0, middle);
            int[] c = Arrays.copyOfRange(arr, middle, n);

            //break down left side
            mergeSort(b);

            //break down right side
            mergeSort(c);

            W
            merge(b, c, arr);
        }
        return arr;
    }

    public static int[] merge(int [] b, int [] c, int [] a){
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < b.length && j < c.length){
            if(b[i] <= c[j]){
                a[k] = b[i];
                i = i + 1;
            } else {
                a[k] = c[j];
                j = j + 1;
            }
            k = k + 1;
        }

        while(i < b.length) {
            a[k++] = b[i++];
        }
        while(j < c.length){
            a[k++] = c[j++];
        }
        return a;
    }
}
