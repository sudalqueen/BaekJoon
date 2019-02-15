package com.company;

import java.util.Scanner;

public class BJ1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_count = sc.nextInt();
        for (int i = 0; i < total_count; i++) {
            int start = sc.nextInt();
            int dest = sc.nextInt();
            getMinimumCount(start, dest);
        }
    }

    public static void getMinimumCount(int start, int dest) {
        int mid_range = (int) Math.ceil((dest-start)/2);
        int count = 0;
        int range = 0;
        while (mid_range > start) {
            int first = range - 1;
            int third = range + 1;
            if (start + third < dest) {
                range = third;
                start += third;
            } else if (start + range < dest) {
                start += range;
            } else {
                range = first;
                start += first;
            }
            count++;
        }
        System.out.println(count);
    }
}
