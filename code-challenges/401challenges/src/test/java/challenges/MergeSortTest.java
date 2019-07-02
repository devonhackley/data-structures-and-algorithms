package challenges;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MergeSortTest {
    @Test public void testMergeSort(){
        int[] tested = new int[]{10, 6, 8, 5, 7, 3, 4};
        int[] expected = new int[]{3, 4, 5, 6, 7, 8, 10};
        int[] result = MergeSort.mergeSort(tested);

        assertEquals(result.length, expected.length);
        assertTrue(Arrays.equals(result, expected));
    }

    @Test public void testMergeSortEmptyArray(){
        int [] result = MergeSort.mergeSort(new int[]{});
        assertTrue(Arrays.equals(result, new int[]{}));
    }

    @Test public void testMergeSortSingleValue(){
        int [] expected = new int[]{2};
        int [] result = MergeSort.mergeSort(new int[]{2});

        assertEquals(result.length, expected.length);
        assertTrue(Arrays.equals(result, expected));
    }


    @Test public void testMergeSortAlredySorted(){
        int[] expected = new int[]{3, 4, 5, 6, 7, 8, 10};
        int[] result = MergeSort.mergeSort( new int[]{3, 4, 5, 6, 7, 8, 10});

        assertEquals(result.length, expected.length);
        assertTrue(Arrays.equals(result, expected));
    }
}
