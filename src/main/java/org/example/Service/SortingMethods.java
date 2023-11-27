package org.example.Service;

import java.util.Arrays;

public class SortingMethods {

    // Merge Sort
    public int[] mergeSort(int myarr[])
    {
        int len = myarr.length;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        __mergeSort(arr,0,len-1);
        return arr;
    }

    private static void __mergeSort(int arr[], int lower, int upper)
    {
        if (lower >= upper)
        {
            return;
        }
        int m = (lower + upper) / 2;
        __mergeSort(arr, lower, m);
        __mergeSort(arr, m + 1, upper);
        merge(arr, lower, upper);
    }

    private static void merge(int arr[], int lower, int upper)
    {
        int m = (lower + upper) / 2;
        int a[] = new int[m - lower + 1];
        int b[] = new int[upper - m];
        int i, k = 0, k1 = 0, k2 = 0;
        for (i = lower; i <= m; i++, k++)
        {
            a[k] = arr[i];
        }
        k = 0;
        for (; i <= upper; i++, k++)
        {
            b[k] = arr[i];
        }
        for (i = lower; i <= upper && k1 < m - lower + 1 && k2 < upper - m; i++)
        {
            if (a[k1] < b[k2])
            {
                arr[i] = a[k1];
                k1++;
            }
            else
            {
                arr[i] = b[k2];
                k2++;
            }
        }
        for (; k1 < m - lower + 1; k1++)
        {
            arr[i++] = a[k1];
        }
        for (; k2 < upper - m; k2++)
        {
            arr[i++] = b[k2];
        }
    }
    // Merge Sort Ends


    // Selection Sort
    public int[] selectionSort(int myarr[])
    {
        int len = myarr.length;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        int pos, tmp;
        for (int i = 0; i < len; i++)
        {
            pos = i;
            for (int j = i + 1; j < len; j++)
            {
                if (arr[j] < arr[pos])
                {
                    pos = j;
                }
            }
            tmp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = tmp;
        }
        return arr;

    }
    // Selection Sort Ends


    // Quick Sort starts
    public int[] quickSort(int myarr[])
    {
        int len = myarr.length;
        int arr[] = new int[len];

        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }

        __quickSort(arr,0,len-1);
        return arr;
    }

    private void __quickSort(int arr[], int lower, int upper)
    {
        if (lower >= upper)
        {
            return;
        }
        int p = partition(arr, lower, upper);
        __quickSort(arr, lower, p - 1);
        __quickSort(arr, p + 1, upper);
    }

    private static int partition(int arr[], int lower, int upper)
    {
        int pivot = arr[upper];
        int j = lower;
        int tmp;
        for (int i = lower; i <= upper; i++)
        {
            if (arr[i] < pivot)
            {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }
        tmp = arr[upper];
        arr[upper] = arr[j];
        arr[j] = tmp;

        return j;
    }
    //Quick Sort Ends


    // BUBBLE SORTING OF ARRAY
    public int[] bubbleSort(int myarr[])
    {
        int len = myarr.length, tmp;
        boolean flag;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        for (int i = 0; i < len; i++)
        {
            flag = false;
            for (int j = 0; j < len - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
        return arr;
    }
    // BUBBLE SORTING OF ARRAY


    // INSERTION SORTING OF ARRAY
    public int[] insertionSort(int myarr[])
    {
        int len = myarr.length, tmp, j;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        for (int i = 1; i < len; i++)
        {
            tmp = arr[i];
            for (j = i; j > 0; j--)
            {
                if (arr[j - 1] > tmp)
                {
                    arr[j] = arr[j - 1];
                }
                else
                    break;
            }
            arr[j] = tmp;
        }
        return arr;
    }
    // INSERTION SORTING OF ARRAY




    //Counting Sort Starts
    public int[] countSort(int[] myarr)
    {
        int len = myarr.length;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[len];
        for (int i = 0; i < arr.length; i++)
        {
            count[arr[i] - min]++;
        }

        for (int i = 1; i < count.length; i++)
        {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--)
        {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = output[i];
        }

        return arr;
    }
    //Counting Sort Ends


    //Odd-Even Sort Starts
    public int[] oddEvenSort(int myarr[])
    {
        int len = myarr.length;
        int arr[] = new int[len];
        for(int i = 0; i < len; i++)
        {
            arr[i] = myarr[i];
        }
        boolean sorted = false;
        while (!sorted)
        {
            sorted = true;
            for (int i = 1; i < arr.length - 1; i += 2)
            {
                if (arr[ i ] > arr[ i + 1 ])
                {
                    swap( arr , i , i + 1 );
                    sorted = false;
                }
            }

            for (int i = 0; i < arr.length - 1; i += 2)
            {
                if (arr[ i ] > arr[ i + 1 ])
                {
                    swap( arr , i , i + 1 );
                    sorted = false;
                }
            }
        }
        return arr;
    }

    private static void swap(int[] array, int i, int j)
    {
        int temp;
        temp = array[ i ];
        array[ i ] = array[ j ];
        array[ j ] = temp;
    }
    //Odd Even Sort Ends


    //Bucket Sort Starts

    //get Maximum of Elements of an Array
    public static int getMax(int arr[])
    {
        int n = arr.length;
        int res = arr[0];
        for (int i = 1; i < n; i++)
        {
            if(res<arr[i])
            {
                res=arr[i];
            }
        }
        return res;
    }

    public int[] bucketSort(int[] sequence)
    {
        int maxValue = getMax(sequence);
        // Bucket Sort
        int[] Bucket = new int[maxValue + 1];
        int[] sortedSequence = new int[sequence.length];

        for (int i = 0; i < sequence.length; i++)
            Bucket[sequence[i]]++;

        int outPos = 0;
        for (int i = 0; i < Bucket.length; i++)
            for (int j = 0; j < Bucket[i]; j++)
                sortedSequence[outPos++] = i;

        return sortedSequence;
    }
    //Bucket Sort ends


    //Comb Sort Starts
    public int[] combSort(int[] myarr) {
        int n = myarr.length;
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = myarr[i];
        }
        // initialize gap
        int gap = n;

        // Initialize swapped as true to make sure that
        // loop runs
        boolean swapped = true;

        // Keep running while gap is more than 1 and last
        // iteration caused a swap
        while (gap != 1 || swapped == true)
        {
            // Find next gap
            gap = getNextGap(gap);

            // Initialize swapped as false so that we can
            // check if swap happened or not
            swapped = false;

            // Compare all elements with current gap
            for (int i=0; i<n-gap; i++)
            {
                if (arr[i] > arr[i+gap])
                {
                    // Swap arr[i] and arr[i+gap]
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;

                    // Set swapped
                    swapped = true;
                }
            }
        }
        return arr;
    }

    // To find gap between elements
    static int getNextGap(int gap)
    {
        // Shrink gap by Shrink factor
        gap = (gap*10)/13;
        if (gap < 1)
            return 1;
        return gap;
    }
    //Comb Sort Ends
}
