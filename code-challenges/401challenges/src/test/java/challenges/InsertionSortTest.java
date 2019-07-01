package challenges;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;
public class InsertionSortTest {

    @Test public void testInsertionSort(){
        int[] tested = new int[]{1, 3, 7, 9, 16, 5};
        int[] expected = new int[]{1, 3, 5,7,9, 16};
        int[] result = InsertionSort.insertionSort(tested);

        assertEquals(result.length, expected.length);
        assertTrue(Arrays.equals(result, expected));
    }

    @Test public void testInsertionEmptyArray(){
        int[] result = InsertionSort.insertionSort(new int[]{});

        // should not error but return an empty array
        assertTrue(result.length == 0);
    }

    @Test public void testInsertionWithSameValues(){
        int[] tested = new int[]{1, 1, 1, 1, 1};
        int[] expected = new int[]{1, 1, 1, 1, 1};
        int[] result = InsertionSort.insertionSort(tested);

        assertEquals(result.length, expected.length);
        assertTrue(Arrays.equals(result, expected));
        assertEquals(result[0], result[result.length - 1]);
    }

    @Test public void testInsertionReverseOrder(){
        int[] tested = new int[]{16,9, 7, 5, 3, 1};
        int[] expected = new int[]{1, 3, 5,7,9, 16};
        int[] result = InsertionSort.insertionSort(tested);

        assertEquals(result.length, expected.length);
        assertTrue(Arrays.equals(result, expected));
    }
}
