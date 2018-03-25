package test;

import main.QuickSort;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class QuickSortTest {
    @Test
    public void testSort() {
        int[] arr = {1, 3, 2, 4, 10, 2};
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        QuickSort.sort(arr1);
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        System.out.println("Original:");
        QuickSort.printArray(arr);
        System.out.println("Sorted Qsort:");
        QuickSort.printArray(arr1);
        System.out.println("Sorted Standart");
        QuickSort.printArray(arr2);
        assertTrue(Arrays.equals(arr1, arr2));
    }
}
