import java.util.Random;

public class ArrayBinarySearch {

    static Pair getMinMax(int arr[], int low, int high) {
        Pair minmax = new Pair ();
        Pair mml = new Pair ();
        Pair mmr = new Pair ();
        int mid;

        // If there is only one element
        if (low == high) {
            minmax.max = arr[low];
            minmax.min = arr[low];
            return minmax;
        }

        /* If there are two elements */
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minmax.max = arr[low];
                minmax.min = arr[high];
            } else {
                minmax.max = arr[high];
                minmax.min = arr[low];
            }
            return minmax;
        }

        /* If there are more than 2 elements */
        mid = (low + high) / 2;
        mml = getMinMax (arr, low, mid);
        mmr = getMinMax (arr, mid + 1, high);

        /* compare minimums of two parts*/
        if (mml.min < mmr.min) {
            minmax.min = mml.min;
        } else {
            minmax.min = mmr.min;
        }

        /* compare maximums of two parts*/
        if (mml.max > mmr.max) {
            minmax.max = mml.max;
        } else {
            minmax.max = mmr.max;
        }

        return minmax;
    }

    // Method for populating array with 1000 elements
    public static int  [] populateArray(int noOfElements) {
        int[] anArray = new int[noOfElements];
        for (int i = 0; i < anArray.length; i++) {
            Random random = new Random ();
            anArray[i] = random.nextInt ();
        }
        return anArray;
    }


    public static int  [] linearSearch(int[] array) {
        int min = array[0], max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min) min = array[i];
            if(array[i] > max) max = array[i];
        }
        return new int[] {min, max};
    }

    /* Driver program to test above function */
    public static void main(String args[]) {
        int arr[] = populateArray (1000000);
        int arr_size = 1000000;
        long start = System.nanoTime ();
        Pair minmax = getMinMax (arr, 0, arr_size - 1);
        long end = System.nanoTime ();
        System.out.printf ("\nMinimum element is %d", minmax.min);
        System.out.printf ("\nMaximum element is %d", minmax.max);
        System.out.printf ("\n Minimum and Maximum Computed in  " + (end - start)/1000 + " nanos");

        start = System.nanoTime ();
        int[] extrema = linearSearch(arr);
        end = System.nanoTime ();
        System.out.printf ("\nMinimum element is %d", extrema[0]);
        System.out.printf ("\nMaximum element is %d", extrema[1]);
        System.out.printf ("\n Minimum and Maximum Computed in  " + (end - start)/1000 + " nanos");

    }
    /* Class Pair is used to return two values from getMinMax() */
    static class Pair {
        int min;
        int max;
    }
}
