package lessons.algorithm.recursion;

/**
 * Created by dennis on 7/15/16.
 */
public class MergeSort {

    static int swapCount = 0;
   public static void main(String[] args) {
       int[] a = {3,  8, 4, 230, 2, 45, 22, 1, 0, 1 , 17,100,3};
       //int[] a = {45, 22, 1, 0, 100,};
       System.out.println(" unsorted");
       for(int e : a) {
           System.out.format(" %d", e);
       }
       System.out.println("");
       System.out.println(" sorting");
       long timeBefore = System.currentTimeMillis();

       mergeSort(a);
       //mergesort(a, 0, a.length - 1);

       long timeAfter = System.currentTimeMillis();
       long elapsed = timeAfter - timeBefore;

       System.out.println(" ");
       System.out.println(" sorted");
       for(int e : a) {
           System.out.format(" %d", e);
       }
       System.out.println(" ");
       //System.out.println(" Swap Count:" + swapCnt + " loop count:" + loopCnt);
       System.out.println("elapsed:" + elapsed);
       System.out.println("Sorting Correct? " + sorted(a, 0));
       System.out.println("SwapCount? " + swapCount);
   }

    private static void mergesort(int[] a, int low, int high) {
        // check if low is smaller then high, if not then the array is sorted

        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(a, low, middle);
            // Sort the right side of the array
            mergesort(a, middle + 1, high);
            // Combine them both
            merge(a, low, middle, high);
        }
    }

    private static void merge(int[] list, int low, int middle, int high) {
        if (low == middle) return;
        for (int left = low; left <= middle; left++) {
            for (int right = middle + 1; right <= high; right++) {
                swap(list, left, right);
            }
        }
       int rightMiddle = middle + ( high - middle) / 2;
        if (rightMiddle > 1) {
            for (int left = middle; left <= high; left++) {
                for (int right = left + 1; right <= high; right++) {
                    swap(list, left, right);
                }
            }
        }
    }




    private static boolean swap(int[] a, int left, int right) {
        boolean withSwap = a[left] > a[right];
        if (withSwap) {
            int tmp = a[left];
            a[left] = a[right];
            a[right] = tmp;

        }
        swapCount++;
        return withSwap;
    }


    public static void mergeSort(int[] list) {
       MergesortMain mainSort = new MergesortMain();
       mainSort.sort(list);
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

class MergesortMain {
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