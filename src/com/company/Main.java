package com.company;

public class Main {

    public static void main(String[] args) {
//        System.out.println("hello");
        int a = 500;
        int b = 12;
        System.out.println(a + " - " + b + " = " + distance(a, b));
        System.out.println(a + " * " + b + " = " + duplicate(a, b));
        System.out.println(a + " / " + b + " = " + divide(a, b));
        System.out.println(a + " % " + b + " = " + module(a, b));

        triangle(5);

    }


    static int distance(int x, int y) {
        int bigger;
        int smaller;
        if (x > y) {
            bigger = x;
            smaller = y;
        } else {
            bigger = y;
            smaller = x;
        }
        int result = 0;
        while (smaller + result < bigger) {
            result++;
        }
        return result;
    }


    static int duplicate(int x, int y) {
        int result = 0;
        int j = 0;
        while (j < y) {
            j++;
            result += x;
        }
        return result;
    }


    static int divide(int x, int y) {
        int result = 0;
        int num3 = 0;

        if (y != 0) {       // אסור לחלק ב-0!
            while (num3 < x) {
                num3 += y;
                if (num3 > x) {
                    break;
                } else {
                    result++;
                }
            }
        }
        return result;
    }


    static int module(int x, int y) {

        int num3 = 0;
        int num4 = 0;

        if (y != 0) {           // אסור לחלק ב-0!
            while (num3 < x) {
                num3 += y;
                if (num3 > x) {
                    break;
                } else {
                    num4 += y;
                }
            }
        }
        int result = 0;
        while (num4 + result < x) {
            result++;
        }
        return result;
    }

    static void triangle(int x) {

        if (x == 0) { // עוצר את הריקורסיה
           return;
        }
        triangle(x - 1); // מורידה ערך של x וקוראת שוב לפונקציה
        for (int i = 0; i < x; i++) { // מדפיס שורה של כוכביות x פעמים
            System.out.print("*");
        }
        System.out.println(""); // יורד שורה



    }

}

