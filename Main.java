package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println(power(5, 0));
        System.out.println(powerWithoutLoop(3,2));
    }

    static int power(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    static int powerWithoutLoop(int x, int y) {
        if(y==0){
            return 1;
        }
        return powerWithoutLoop(x, y-1)*x;

    }


}
