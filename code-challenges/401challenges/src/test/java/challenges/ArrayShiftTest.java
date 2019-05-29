package challenges;
import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayShiftTest {
    @Test public void testInsertShiftArrayMethod() {
        ArrayShift libraryForTest = new ArrayShift();
        int[] arr = new int[]{2, 3, 4, 5};
        int[] arr2 = new int[]{2};
        int[] expected = new int[]{2,3,6,4,5};
        int[] expected2 = new int[]{2,3};
        assertArrayEquals("Method should return a new array with value inserted in the middle", libraryForTest.insertShiftArray(arr, 6), expected);
        assertArrayEquals("Method should return a new array with value inserted in the middle", libraryForTest.insertShiftArray(arr2, 3), expected2);
    }
}
