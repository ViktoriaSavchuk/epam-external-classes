package com.sort;

import java.util.Arrays;

public class Sort {

    private void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

    public void shellSort(int[] array) {
        int gap = array.length / 2;
        while (gap >= 1) {
            for (int right = gap; right < array.length; right++) {
                for (int c = right - gap; c >= 0; c -= gap) {
                    if (array[c] > array[c + gap]) {
                        swap(array, c, c + gap);
                    }
                }
            }
            gap = gap / 2;
        }
    }


    public void mergeSort(int[] source, int left, int right) {
        int delimiter = left + ((right - left) / 2) + 1;
        if (delimiter > 0 && right > (left + 1)) {
            mergeSort(source, left, delimiter - 1);
            mergeSort(source, delimiter, right);
        }
        int[] buffer = new int[right - left + 1];
        int cursor = left;
        for (int i = 0; i < buffer.length; i++) {
            if (delimiter > right || source[cursor] > source[delimiter]) {
                buffer[i] = source[cursor];
                cursor++;
            } else {
                buffer[i] = source[delimiter];
                delimiter++;
            }
        }
        System.arraycopy(buffer, 0, source, left, buffer.length);
    }

    public void quickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    swap(source, leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
    }

    public void selectionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
    }

    public void insertionSort(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

    void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    //swap (arr,arr[j+1], arr[i]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static int[] generateArray(int size) {
        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 10000));
        }
        return array;
    }

    public static void main(String[] args) {
        Sort sort = new Sort();
        int size = 15;
        int[] arrayForSorting = generateArray(size);
        System.out.println(Arrays.toString(arrayForSorting));

        int[] arrayForShellSort = new int[size];
        System.arraycopy(arrayForSorting, 0, arrayForShellSort, 0, arrayForSorting.length);
        long startTime = System.currentTimeMillis();
        sort.shellSort(arrayForShellSort);
        System.out.printf("Shell sort took %d milliseconds %n", System.currentTimeMillis() - startTime);

        int[] arrayForMergeSort = new int[size];
        System.arraycopy(arrayForSorting, 0, arrayForMergeSort, 0, arrayForSorting.length);
        startTime = System.currentTimeMillis();
        sort.mergeSort(arrayForMergeSort, 0, arrayForMergeSort.length - 1);
        System.out.printf("Merge sort took %d milliseconds%n", System.currentTimeMillis() - startTime);

        int[] arrayForQuickSort = generateArray(size);
        System.arraycopy(arrayForSorting, 0, arrayForQuickSort, 0, arrayForSorting.length);
        startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(arrayForQuickSort));
        System.out.printf("\nQuick sort took %d milliseconds%n", System.currentTimeMillis() - startTime);

        int[] arrayForSelectionSort = new int[size];
        System.arraycopy(arrayForSorting, 0, arrayForSelectionSort, 0, arrayForSorting.length);
        startTime = System.currentTimeMillis();
        sort.selectionSort(arrayForSelectionSort);
        System.out.printf("Selection sort took %d milliseconds%n", System.currentTimeMillis() - startTime);

        int[] arrayForInsertionSort = new int[size];
        System.arraycopy(arrayForSorting, 0, arrayForInsertionSort, 0, arrayForSorting.length);
        startTime = System.currentTimeMillis();
        sort.insertionSort(arrayForInsertionSort);
        System.out.printf("Insertion sort took %d milliseconds%n", System.currentTimeMillis() - startTime);

        int arrayForBubbleSort[] = new int[size];
        System.arraycopy(arrayForSorting, 0, arrayForBubbleSort, 0, arrayForSorting.length);
        startTime = System.currentTimeMillis();
        sort.bubbleSort(arrayForBubbleSort);
        System.out.printf("Bubble sort took %d milliseconds%n", System.currentTimeMillis() - startTime);

    }
}
