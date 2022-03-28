package com.company.homework14;

public class Time {
    public static void clock(){

        OUTER:
        for(int i = 0; i <= 6; i++){
            MIDDLE:
            for(int j = 0; j < 60; j++){
                if(i > 1 && j % 10 == 0){
                    break OUTER;
                }
                else {
                    INNER:
                    for (int k = 0; k < 60; k++) {
                        if(i * k > j){
                            continue MIDDLE;
                        }
                        System.out.println(i + " : " + j + " : " + k);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        clock();
    }
}