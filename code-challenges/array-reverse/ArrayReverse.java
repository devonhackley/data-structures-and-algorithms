import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    // create the array to test your code on later
    int[] startArr = new int[] {1,2,3,4,5,10};
    // print it out, nicely
    System.out.println(Arrays.toString(startArr));
    // call your reverseArray method and save the result in a variable
    int[] endArr = reverseArray(startArr);
    // print out the result, nicely
    System.out.println(Arrays.toString(endArr));
  }

  // the method you should write, to reverse an array
  public static int[] reverseArray(int[] inputArray) {
    // your code goes here!
    // for now, to make sure that it compiles, here is a bad answer
   for(int i = 0; i<inputArray.length/2; i++) { // swap values to you hit the midpoint of the array
     int temp = inputArray[i];
     inputArray[i] = inputArray[inputArray.length - i - 1]; // swaps values from end of array at that current index
     inputArray[inputArray.length - i - 1] = temp; // assigns end of array at that current index with previously saved value
   }
    
    return inputArray;
  }
    
}