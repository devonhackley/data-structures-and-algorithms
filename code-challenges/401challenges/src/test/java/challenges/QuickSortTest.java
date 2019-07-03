package challenges;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test public void testQuickSort(){
        int[] tested = new int[]{1, 3, 7, 9, 16, 5};
        int[] expected = new int[]{1, 3, 5,7,9, 16};

        int[] result = Quicksort.quickSort(tested,0, tested.length-1);

        assertEquals(expected.length, result.length);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test public void testQuickSortEmptyArray(){
        int[] tested = new int[]{};

        int[] result = Quicksort.quickSort(tested, 0, tested.length-1);

        // should not error but return an empty array
        assertTrue(result.length == 0);
    }

    @Test public void testQuickSortSortedArray(){
        int[] expected = new int[]{1, 3, 5,7,9, 16};
        int[] tested = new int[]{1, 3, 5,7,9, 16};
        int[] result = Quicksort.quickSort(tested,0, tested.length-1);

        assertEquals(expected.length, result.length);
        assertTrue(Arrays.equals(expected, result));
    }

    @Test public void testQuickSortReversed(){
        int[] expected = new int[]{1, 3, 5,7,9, 16};
        int[] tested = new int[]{16, 9, 7,5,3, 1};
        int[] result = Quicksort.quickSort(tested,0, tested.length-1);

        assertEquals(expected.length, result.length);
        assertTrue(Arrays.equals(expected, result));
    }
}
