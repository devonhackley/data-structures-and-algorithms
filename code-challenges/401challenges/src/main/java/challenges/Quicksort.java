package challenges;

public class Quicksort {
    public static int[] quickSort(int[] arr, int left, int right){
        // Partition the array by setting the position of the pivot value
        if(left < right){
            int position = partition(arr, left, right);

            //sort left
            quickSort(arr, left,position-1);

            //sort right
            quickSort(arr, position + 1, right);
        }

        return arr;
    }

    public static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int low = left - 1;

        for(int i = left; i < right; i++){
            if(arr[i] <= pivot){
                low++;
                swap(arr, i, low);
            }
        }
        swap(arr, right, low + 1);

        return low + 1;
    }

    public static void swap(int[] arr, int i, int low){
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }

}
