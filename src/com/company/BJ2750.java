package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total_count = Integer.parseInt(br.readLine());
        int[] array;
        array = new int[total_count];
        for (int i = 0; i < total_count; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j > -1 && key < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
}
