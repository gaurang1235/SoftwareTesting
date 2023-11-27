package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingMethodsTest {
    @Test
    public void testMergeSort() {
        SortingMethods sortingMethods = new SortingMethods();

        // Existing test case
        int[] myarr = {5, 2, 8, 1, 6};
        int[] result = sortingMethods.mergeSort(myarr);
        int[] expected = {1, 2, 5, 6, 8};
        assertArrayEquals(expected, result);

        // Additional test cases
        int[] singleElementArr = {7};
        int[] singleResult = sortingMethods.mergeSort(singleElementArr);
        assertArrayEquals(singleElementArr, singleResult);

        int[] reversedArr = {5, 4, 3, 2, 1};
        int[] reversedResult = sortingMethods.mergeSort(reversedArr);
        int[] reversedExpected = {1, 2, 3, 4, 5};
        assertArrayEquals(reversedExpected, reversedResult);

        // Test with duplicates
        int[] duplicateArr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] duplicateResult = sortingMethods.mergeSort(duplicateArr);
        int[] duplicateExpected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        assertArrayEquals(duplicateExpected, duplicateResult);

        // Test with a larger input size
        int[] largeArr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] largeResult = sortingMethods.mergeSort(largeArr);
        int[] largeExpected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(largeExpected, largeResult);
    }

    @Test
    public void testSelectionSort() {
        SortingMethods sortingMethods = new SortingMethods();

        // Existing test case
        int[] myarr = {5, 2, 8, 1, 6};
        int[] result = sortingMethods.selectionSort(myarr);
        int[] expected = {1, 2, 5, 6, 8};
        assertArrayEquals(expected, result);

        // Additional test cases
        int[] singleElementArr = {7};
        int[] singleResult = sortingMethods.selectionSort(singleElementArr);
        assertArrayEquals(singleElementArr, singleResult);

        int[] reversedArr = {5, 4, 3, 2, 1};
        int[] reversedResult = sortingMethods.selectionSort(reversedArr);
        int[] reversedExpected = {1, 2, 3, 4, 5};
        assertArrayEquals(reversedExpected, reversedResult);

        // Test with duplicates
        int[] duplicateArr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] duplicateResult = sortingMethods.selectionSort(duplicateArr);
        int[] duplicateExpected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        assertArrayEquals(duplicateExpected, duplicateResult);

        // Test with a larger input size
        int[] largeArr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] largeResult = sortingMethods.selectionSort(largeArr);
        int[] largeExpected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(largeExpected, largeResult);
    }

    @Test
    public void testQuickSort() {
        SortingMethods sortingMethods = new SortingMethods();

        // Existing test case
        int[] myarr = {5, 2, 8, 1, 6};
        int[] result = sortingMethods.quickSort(myarr);
        int[] expected = {1, 2, 5, 6, 8};
        assertArrayEquals(expected, result);

        // Additional test cases
        int[] singleElementArr = {7};
        int[] singleResult = sortingMethods.quickSort(singleElementArr);
        assertArrayEquals(singleElementArr, singleResult);

        int[] reversedArr = {5, 4, 3, 2, 1};
        int[] reversedResult = sortingMethods.quickSort(reversedArr);
        int[] reversedExpected = {1, 2, 3, 4, 5};
        assertArrayEquals(reversedExpected, reversedResult);

        // Test with duplicates
        int[] duplicateArr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] duplicateResult = sortingMethods.quickSort(duplicateArr);
        int[] duplicateExpected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        assertArrayEquals(duplicateExpected, duplicateResult);

        // Test with a larger input size
        int[] largeArr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] largeResult = sortingMethods.quickSort(largeArr);
        int[] largeExpected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(largeExpected, largeResult);
    }

    @Test
    public void testBubbleSort() {
        SortingMethods sortingMethods = new SortingMethods();

        // Existing test case
        int[] myarr = {5, 2, 8, 1, 6};
        int[] result = sortingMethods.bubbleSort(myarr);
        int[] expected = {1, 2, 5, 6, 8};
        assertArrayEquals(expected, result);

        // Additional test cases
        int[] singleElementArr = {7};
        int[] singleResult = sortingMethods.bubbleSort(singleElementArr);
        assertArrayEquals(singleElementArr, singleResult);

        int[] reversedArr = {5, 4, 3, 2, 1};
        int[] reversedResult = sortingMethods.bubbleSort(reversedArr);
        int[] reversedExpected = {1, 2, 3, 4, 5};
        assertArrayEquals(reversedExpected, reversedResult);

        // Test with duplicates
        int[] duplicateArr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] duplicateResult = sortingMethods.bubbleSort(duplicateArr);
        int[] duplicateExpected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        assertArrayEquals(duplicateExpected, duplicateResult);

        // Test with a larger input size
        int[] largeArr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] largeResult = sortingMethods.bubbleSort(largeArr);
        int[] largeExpected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(largeExpected, largeResult);
    }

    @Test
    public void testInsertionSort() {
        SortingMethods sortingMethods = new SortingMethods();

        // Existing test case
        int[] myarr = {5, 2, 8, 1, 6};
        int[] result = sortingMethods.insertionSort(myarr);
        int[] expected = {1, 2, 5, 6, 8};
        assertArrayEquals(expected, result);

        // Additional test cases
        int[] singleElementArr = {7};
        int[] singleResult = sortingMethods.insertionSort(singleElementArr);
        assertArrayEquals(singleElementArr, singleResult);

        int[] reversedArr = {5, 4, 3, 2, 1};
        int[] reversedResult = sortingMethods.insertionSort(reversedArr);
        int[] reversedExpected = {1, 2, 3, 4, 5};
        assertArrayEquals(reversedExpected, reversedResult);

        // Test with duplicates
        int[] duplicateArr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] duplicateResult = sortingMethods.insertionSort(duplicateArr);
        int[] duplicateExpected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        assertArrayEquals(duplicateExpected, duplicateResult);

        // Test with a larger input size
        int[] largeArr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] largeResult = sortingMethods.insertionSort(largeArr);
        int[] largeExpected = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(largeExpected, largeResult);
    }

    @Test
    public void TestcountSort()
    {
        SortingMethods sortingMethods = new SortingMethods();
        int arr[] = { 91302, 81969, 35909, 55248, 57942, 45257, 68738, 9964, 53080, 75729, 30429, 99222, 57697, 87761, 74780, 62890, 3542, 74780, 83323};
        int arr1[] = { 3542, 9964, 30429, 35909, 45257, 53080, 55248, 57697, 57942, 62890, 68738, 74780, 74780, 75729, 81969, 83323, 87761, 91302, 99222};
        assertArrayEquals(arr1, sortingMethods.countSort(arr));
    }

    @Test
    public void TestoddEvenSort()
    {
        SortingMethods sortingMethods = new SortingMethods();
        int arr[] = { 87827, 34425, 81490, 65914, 3632, 25746, 77825, 62596, 83610, 30815, 22100, 19802, 61244, 10973, 67460, 78226, 71946};
        int arr1[] = { 3632, 10973, 19802, 22100, 25746, 30815, 34425, 61244, 62596, 65914, 67460, 71946, 77825, 78226, 81490, 83610, 87827};
        assertArrayEquals(arr1, sortingMethods.oddEvenSort(arr));
    }

    @Test
    public void TestbucketSort()
    {
        SortingMethods sortingMethods = new SortingMethods();
        int arr[] = { 30540, 73740, 26044, 64965, 55231, 91959, 68598, 80978, 69784, 31195, 64588, 600, 53295, 84390, 61844, 64269, 51851, 40070, 36215};
        int arr1[] = { 600, 26044, 30540, 31195, 36215, 40070, 51851, 53295, 55231, 61844, 64269, 64588, 64965, 68598, 69784, 73740, 80978, 84390, 91959};
        int arr2[]= { 39438, 78309, 79844, 91164, 19755, 33522, 76822, 27777, 55396, 47739, 62887, 36478, 51340, 95222, 91619, 63571, 71729, 14160, 60696, 1630, 24288, 13723, 80417, 15667, 40094, 12979, 10880, 99892, 21825, 51293, 83911, 61263, 29603, 63755, 52428, 49358, 97277, 29251, 77135, 52674, 76991, 40022};
        int sorted_arr2[] = { 1630, 10880, 12979, 13723, 14160, 15667, 19755, 21825, 24288, 27777, 29251, 29603, 33522, 36478, 39438, 40022, 40094, 47739, 49358, 51293, 51340, 52428, 52674, 55396, 60696, 61263, 62887, 63571, 63755, 71729, 76822, 76991, 77135, 78309, 79844, 80417, 83911, 91164, 91619, 95222, 97277, 99892};
        assertArrayEquals(arr1, sortingMethods.bucketSort(arr));
        assertArrayEquals(sorted_arr2, sortingMethods.combSort(arr2));
    }

    @Test
    public void TestcombSort()
    {
        SortingMethods sortingMethods = new SortingMethods();
        int arr[] = { 66179, 69978, 32761, 88934, 64671, 34148, 5016, 76670, 80333, 69871};
        int arr1[] = { 5016, 32761, 34148, 64671, 66179, 69871, 69978, 76670, 80333, 88934};
        int arr2[]= { 39438, 78309, 79844, 91164, 19755, 33522, 76822, 27777, 55396, 47739, 62887, 36478, 51340, 95222, 91619, 63571, 71729, 14160, 60696, 1630, 24288, 13723, 80417, 15667, 40094, 12979, 10880, 99892, 21825, 51293, 83911, 61263, 29603, 63755, 52428, 49358, 97277, 29251, 77135, 52674, 76991, 40022};
        int sorted_arr2[] = { 1630, 10880, 12979, 13723, 14160, 15667, 19755, 21825, 24288, 27777, 29251, 29603, 33522, 36478, 39438, 40022, 40094, 47739, 49358, 51293, 51340, 52428, 52674, 55396, 60696, 61263, 62887, 63571, 63755, 71729, 76822, 76991, 77135, 78309, 79844, 80417, 83911, 91164, 91619, 95222, 97277, 99892};
        assertArrayEquals(arr1, sortingMethods.combSort(arr));
        assertArrayEquals(sorted_arr2, sortingMethods.combSort(arr2));
    }

    @Test
    public void TestgetMax()
    {
        SortingMethods sortingMethods = new SortingMethods();
        int arr[] = { 12, 1234, 45, 67, 1, 20 };
        int arr1[] = {1, 2, 3, 4, 5};
        assertEquals(1234, sortingMethods.getMax(arr));
        assertEquals(5, sortingMethods.getMax(arr1));
    }

}
