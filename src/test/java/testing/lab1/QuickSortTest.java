package testing.lab1;

import java.lang.reflect.Array;
import java.util.Arrays;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QuickSortTest {
    @Test
    public void testSort() {
        int[] arr = {1, 3, 2, 4, 10, 2};
        int[] arr1 = Arrays.copyOf(arr, arr.length);
        QuickSort.sort(arr1, null);
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

    @Test
    public void testSortFromSite() {
        //https://www.cs.usfca.edu/~galles/visualization/ComparisonSort.html
        int[] arr = { 56, 38, 75, 26, 75, 82, 17, 58, 45, 81, 42, 21, 1, 91, 30, 56, 40, 76, 99, 68, 93, 50, 95, 34, 24, 35, 9, 70, 11, 11, 88, 44, 79, 3, 81, 76, 27, 89, 87, 58, 15, 62, 31, 21, 76, 66, 82, 6, 9, 84 };
        //pivot k=0 arr[k]=56
        //i=2 arr[i]=75
        //j=arr.length-2 ar[j]=9 swap
        QsortSwapActionHistory history = new QsortSwapActionHistory();
        QsortSwapAction action = new QsortSwapAction(56, 0, 75, 2, 9, 48);

        QuickSort.sort(arr, history);
        //history.printHistory();

        assertTrue(history.actionIndex(action) >= 0);
    }
}
