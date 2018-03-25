package main;

public class QuickSort {

    public static void sort(int[] array) {
        doSort(array, 0, array.length - 1);
    }

    public static void doSort(int[] array, int start, int end) {
        if (start >= end)
            return;
        int i = start, j = end;
        int cur = i;// - (i - j) / 2;
        while (i < j) {
            while (i < cur && (array[i] <= array[cur])) {
                i++;
            }
            while (j > cur && (array[cur] <= array[j])) {
                j--;
            }
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == cur)
                    cur = j;
                else if (j == cur)
                    cur = i;
            }
        }
        doSort(array, start, cur);
        doSort(array,cur+1, end);
    }

    public static void sort1(int[] a, int from, int to) {

        System.out.println("from: " + from + ", to: " + to);

        // На входе - массив a[], a[N] - его последний элемент.

        int i = from, j = to - 1; 		// поставить указатели на исходные места
        int temp, p;

        p = a[(i + j) / 2];		// центральный элемент

        // процедура разделения
        do {
            while (a[i] < p) i++;
            while (a[j] > p) j--;

            if (i <= j) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);


        // рекурсивные вызовы, если есть, что сортировать
        if (j > 0) doSort(a, 0, j);
        if (to > i) doSort(a, i, to - i);
    }

    public static void printArray(int[] a) {
        System.out.println("Integer array, length = " + a.length);
        for (int anA : a) {
            System.out.print(anA + ", ");
        }
        System.out.println();
    }
}
