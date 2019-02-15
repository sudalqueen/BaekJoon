package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class BJ1475 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        double result = getNumber(input);

        System.out.print((int) result);
    }

    public static double getNumber(String input) {
        char maximum = (char) 999999999;
        double maximum_num = -1;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            char num = input.charAt(i);
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                int set_num = map.get(num);
                map.put(num, set_num + 1);
            }
            if (maximum_num < map.get(num)) {
                maximum = num;
                maximum_num = map.get(num);
            }
        }
        if (maximum == '6') {
            if (map.get('9') != null) {
                maximum_num = Math.ceil((maximum_num + map.get('9')) / 2);
            } else {
                maximum_num = Math.ceil(maximum_num / 2);
            }
        }
        if (maximum == '9') {
            if (map.get('6') != null) {
                maximum_num = Math.ceil((maximum_num + map.get('6')) / 2);
            } else {
                maximum_num = Math.ceil(maximum_num / 2);
            }
        }
        return maximum_num;
    }
}
