package challenges;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test public void testBinarySearchMethod(){
        BinarySearch libraryForTest = new BinarySearch();
        int[] arr = new int[] {4, 8, 15, 16, 23, 42};
        assertTrue("Method should return a new array with value inserted in the middle", libraryForTest.BinarySearch(arr, 15) == 2);
    }
    @Test public void testBinarySearchBadArrayMethod(){
        BinarySearch libraryForTest = new BinarySearch();
        int[] arr = new int[] {11, 22, 33, 44, 55, 66, 77};
        assertTrue("Method should return a new array with value inserted in the middle", libraryForTest.BinarySearch(arr, 90) == -1);
    }
    @Test(expected = IllegalArgumentException.class) public void testBinarySearchEmptyArrayMethod(){
        BinarySearch libraryForTest = new BinarySearch();
        int[] arr = new int[0];
         libraryForTest.BinarySearch(arr, 90);
    }
}

