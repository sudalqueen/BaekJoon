package com.company;

import java.util.Scanner;

public class BJ2751 {

    static int[] sortedArray;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_count = sc.nextInt();
        int[] array;
        array = new int[total_count];
        sortedArray = new int[total_count];
        for (int i = 0; i < total_count; i++) {
            array[i] = sc.nextInt();
        }
        mergeSort(array, 0, array.length-1);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void mergeSort(int[] array, int left, int right) {
        int mid;
        if (left < right) {
            mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    public static void merge(int[] array, int left, int mid, int right) {
        int leftIndex = left;
        int rightIndex = mid+1;
        int index = left;

        while (leftIndex <= mid && rightIndex <= right) {
            if (array[leftIndex] < array[rightIndex]) {
                sortedArray[index++] = array[leftIndex++];
            } else {
                sortedArray[index++] = array[rightIndex++];
            }
        }

        while (leftIndex <= mid) {
            sortedArray[index++] = array[leftIndex++];
        }
        while (rightIndex <= right) {
            sortedArray[index++] = array[rightIndex++];
        }

        for (int i = left; i <= right; i++) {
            array[i] = sortedArray[i];
        }

    }

}
