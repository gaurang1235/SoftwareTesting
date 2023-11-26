package org.example;

public class SortingMethods {

    // Merge Sort
    int[] mergeSort(int myarr[])
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
    int[] selectionSort(int myarr[])
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
    int[] quickSort(int myarr[])
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
    int[] bubbleSort(int myarr[])
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
    int[] insertionSort(int myarr[])
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
}
