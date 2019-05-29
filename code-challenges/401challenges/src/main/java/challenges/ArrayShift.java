package challenges;

public class ArrayShift {
    public static int[] insertShiftArray(int[] arr, int value){
        int[] newArr = new int[arr.length + 1];
        for(int i = 0; i < newArr.length; i++){
            if(i != newArr.length/2 && i < newArr.length/2) {
                newArr[i] = arr[i]; // handles beginning of array
            } else if(i == newArr.length/2) {
                newArr[i] = value; // assigns to middle index
            } else {
                newArr[i] = arr[i - 1]; // handles rest of array
            }
        }
        return newArr;
    }
}
