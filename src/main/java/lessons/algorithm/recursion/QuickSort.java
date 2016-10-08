package lessons.algorithm.recursion;

/**
 * Created by dennis on 7/14/16.
 */
public class QuickSort {
    static int swapCnt = 0;
    static int loopCnt = 0;
    public static void main(String[] args) {
        int[] a = {3,  8, 4, 230, 2, 45, 22, 1, 0, 100,};
        System.out.println(" unsorted");
        for(int e : a) {
            System.out.format(" %d", e);
        }
        System.out.println("");
        System.out.println(" sorting");
        long timeBefore = System.currentTimeMillis();
        //mergeSort(a);
        // bubble(a);
        //ms(a);
        //sortMergeMain(a);
        otherms(a);
        //mergesort(a, 0, a.length - 1);
        long timeAfter = System.currentTimeMillis();
        long elapsed = timeAfter - timeBefore;

        System.out.println(" ");
        System.out.println(" sorted");
        for(int e : a) {
            System.out.format(" %d", e);
        }
        System.out.println(" ");
        System.out.println(" Swap Count:" + swapCnt + " loop count:" + loopCnt);
        System.out.println("elapsed:" + elapsed);

    }

    private static void mergesort(int[] a, int low, int high) {
        // check if low is smaller then high, if not then the array is sorted

        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            sortMerge(a,low, middle);
            // Sort the right side of the array
            sortMerge(a, middle + 1, high);

        }
    }

    private static void otherms(int[] a) {
      Mergesort ms = new Mergesort();
      ms.sort(a);
    }
    private static void ms(int[] a) {
         int middle = (a.length - 1) / 2;
         int high = a.length - 1;
         msort(a,0, middle);
         msort(a, middle, high);
    }

    private static void sortMergeMain(int[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            sortMerge(a, ++start, end);

        }
    }
    private static void sortMerge(int[] a, int start, int end) {
        loopCnt++;
        int pivot = start + (end - start) / 2;
        System.out.format(" %d", pivot);
        if (pivot <= start) {
            swap(a, pivot);
            return;
        }

        swap(a, pivot);

        sortMerge(a, start, pivot);
    }

    private static void msort(int[] a, int low, int high) {
        loopCnt++;
        int pivot = high / 2;
        System.out.format(" %d", pivot);
        if (low >= high) {
           return;
       }
        swap(a, low);
        swap(a, pivot);
        swap(a, high);
        msort(a, ++low, --high);
    }

    private static void bubble(int[] a) {
        int ctr = 1;
        while(!sorted(a, 0)) {
            System.out.println("Round:" + ctr);
            bubblesort(a, 0, 1);
            ctr++;
        }
    }

    private static void bubblesort(int[] a, int pivot, int index) {
        loopCnt++;
        System.out.format(" %d", pivot);
        if (pivot >= a.length - 1) {
            return;
        }

        if (a[pivot] > a[index]) {
            sw(a, pivot, index);
            //swap(a, pivot);
            //swap(a, index);
        }

        if (index >= a.length - 1) {
            pivot++;
            index = pivot;
        }


        bubblesort(a, pivot, ++index);

    }

    private static void mergeSort(int[] a) {

        int ctr = 1;

        int pivot = (a.length -1) / 2;
        while(!sorted(a, 0)) {
            System.out.println("Round:" + ctr);
            qs(a, pivot, 1);
            ctr++;
        }

    }

    private static void qs(int[] a, int pivot, int swaps) {
        System.out.format(" %d", pivot);
        if (sorted(a, 0)) {
            return;
        }

        int currentSwaps = swap(a, pivot);
        if (currentSwaps == 0) {
            return;
        }
         swaps += currentSwaps;
        int leftPivot = (pivot - 1) / 2;
        qs(a, leftPivot, swaps);
        int rightPivot = (a.length + pivot) / 2;
        qs(a, rightPivot, swaps);

    }

    private static int swap(int[] a, int pivot) {
        int swaps = 0;
        int left = pivot > 0 ? pivot - 1 : 0;
        int right = pivot < a.length - 1 ? pivot + 1 : a.length - 1;

        if (left >= 0
            && a[left] > a[pivot]) {
            sw(a, left, pivot);
            swaps++;
        }

        if (a[right] < a[pivot]) {
            sw(a, right, pivot);
            swaps++;
        }
        return swaps;
    }

    private static void sw(int[] a, int left, int right) {
        int tmp = a[left];
        a[left] = a[right];
        a[right] = tmp;
        swapCnt++;
    }

    private static boolean sorted(int[] a, int index) {
        if (index == a.length -1) {
            return true;
        }
        if (a[index] > a[index + 1]) {
            return false;
        }
        return sorted(a, ++index);

    }
}

class Mergesort {
    private int[] numbers;
    private int[] helper;

    private int number;

    public void sort(int[] values) {
        this.numbers = values;
        number = values.length;
        this.helper = new int[number];
        mergesort(0, number - 1);
    }

    private void mergesort(int low, int high) {
        // check if low is smaller then high, if not then the array is sorted

        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {

        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }

        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }

    }
}