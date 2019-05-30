package challenges;

public class BinarySearch {
    public static int BinarySearch(int[] arr, int key){

        if(arr.length == 0){
            throw new IllegalArgumentException("The array was empty");
        }
        int left = 0;
        int right = arr.length-1;
        int index = -1;

        while(left <= right){
            int middle = (left + right) /2;
            if(arr[middle] == key){
                index = middle;
            }
            if(arr[middle] < key){
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return index;
    }
}
