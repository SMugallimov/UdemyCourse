package com.company.homework15;

public class Time {
    public static void clock(){
        int hour = 0;

        OUTER:
        while (hour <= 6) {
            int minute = -1;

            MIDDLE:
            do {
                minute++;
                if(hour > 1 && minute % 10 == 0) {
                    break OUTER;
                }
                int second = 0;

                INNER:
                while (second < 60) {
                    if(hour * second > minute) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + " : " + minute + " : " + second);
                    second++;
                }
            }
            while (minute < 59);
            hour++;
        }
    }

    public static void main(String[] args) {
        clock();
    }
}