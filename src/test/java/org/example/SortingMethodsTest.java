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
}
