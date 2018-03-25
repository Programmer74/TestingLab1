package main;

public class QuickSort {

    public static void sort(int[] array, QsortSwapActionHistory history) {
        doSort(array, 0, array.length - 1, history);
    }

    private static void swap(int[] array, int pivot, int pivot_index, int l, int r, QsortSwapActionHistory history) {
        QsortSwapAction action = new QsortSwapAction(pivot, pivot_index, array[l], l, array[r], r);
        //System.out.println("Swapping " + action.getLeftValue() + " and " + action.getRightValue());

        if (history != null)
            history.addToHistory(action);

        int temp = array[l];
        array[l] = array[r];
        array[r] = temp;

        //printArray(array);
    }

    private static void doSort(int[] array, int start, int end, QsortSwapActionHistory history) {
        if (start >= end)
            return;
        //System.out.println("start=" + start + " end=" + end);
        int i = start + 1, j = end;

        int pivot = array[start];

        // Divide into two lists
        while (i <= j) {
            // If the current value from the left list is smaller than the pivot
            // element then get the next element from the left list
            while (array[i] < pivot) {
                i++;
                if (i > end) break;
            }
            // If the current value from the right list is larger than the pivot
            // element then get the next element from the right list
            while (array[j] > pivot) {
                j--;
                if (j < 0) break;
            }

            // If we have found a value in the left list which is larger than
            // the pivot element and if we have found a value in the right list
            // which is smaller than the pivot element then we exchange the
            // values.
            // As we are done we can increase i and j
            if (i <= j) {
                swap(array, pivot, start, i, j, history);
                i++;
                j--;
            }
        }

        if ((i < end) && (array[i] < pivot)) {
            swap(array, pivot, start, start, i, history);
        }
        if ((j > 0) && (array[j] < pivot)) {
            swap(array, pivot, start, start, j, history);
        }

        // Recursion
        if (start < j)
            doSort(array, start, j, history);
        if (i < end)
            doSort(array, i, end, history);

    }

    public static void printArray(int[] a) {
        System.out.println("Integer array, length = " + a.length);
        for (int anA : a) {
            System.out.print(anA + ", ");
        }
        System.out.println();
    }
}
