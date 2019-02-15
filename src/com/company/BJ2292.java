package com.company;

import java.util.Scanner;

public class BJ2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int result = getRoomNum(input);
        System.out.print(result);
    }

    public static int getRoomNum(int input) {
        int start = 1;
        int number = 6;
        int result = 1;
        while (true) {
            if(start >= input){
                break;
            }
            start += number;
            number += 6;
            result += 1;
        }
        return result;
    }
}
