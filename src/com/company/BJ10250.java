package com.company;

import java.util.Scanner;

public class BJ10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_count = sc.nextInt();
        for (int i = 0; i < total_count; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            int customer = sc.nextInt();
            getRoomNumber(height, weight, customer);
        }
    }

    public static void getRoomNumber(int h, int w, int c) {
        int count = 0;
        int floor = 1;
        int number = 1;
        for (int i = 1; i <= h; i++) {

            count++;

            if (count == c) {
                floor = i;
                break;
            }

            if (i == h && count < c) {
                number++;
                i = 0;
            }
        }
        System.out.printf("%d%02d\n", floor, number);
    }
}
