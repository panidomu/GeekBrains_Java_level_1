//Created  by Natalia Savelieva on 06.11.2018

//Homework part 1

package geekbrains.java1;

import java.util.Scanner; // оно само появилось:)

public class Main { // объявление класса Main

    public static void main(String[] args) { //объявление метода main

        // Присваиваем значения переменным:
        int a = 5;
        int b = 3;
        int c = 4;
        int d = 2;
        int e = 5;
        int f = 15;
        int g = 7;
        int h = -1;
        int y = 2004;

        //Вызываем методы:
        // System.out.println(part2(firstByte , firstShort , firstInt , firstLong , firstFloat , doubleFirst , booleanFirst , charFirst));
        System.out.println(myMethod(a, b, c, d));
        System.out.println(method_If_1(e, f));
       // System.out.println(method_If_2(g));
        System.out.println(method_If_3(h));
        //printName(MyName: "Natalia");
        //     System.out.println(year( int y));
        //Определяем методы:
    }

    //Homework part 2
    public static void part2() {
        System.out.println("********part 2********");
        byte firstByte = 126;
        short firstShort = 0;
        int firstInt = -10000;
        long firstLong = 999999999999L;
        float firstFloat = 3.14f;
        double doubleFirst = 2.0008;
        boolean booleanFirst = false;
        char charFirst = '0';
        System.out.println(firstByte + firstShort + firstInt + firstLong + firstFloat + String.valueOf(doubleFirst) + booleanFirst + charFirst);
    }

    //Homework part 3
    public static int myMethod(int a, int b, int c, int d) {
        System.out.println("********part 3********");
        System.out.println("a * (b + (c / d)) =" + ((a * (b + (c / d)))));
        return ((a * (b + (c / d)))); //после return никакой код не выполняется
    }

    //Homework part 4
    public static boolean method_If_1(int e, int f) {
        // boolean myRequest;
        System.out.println("********part 4 ********");
        if ((10 <= (e + f)) && ((e + f) <= 20)) {
            // myRequest = true;
            return true;
        } else {
            // myRequest = false;
            return false;
        }
    }

    //Homework part 5
//    public static void method_If_2(int g) {
//        System.out.println("********part 5********");
//        if (g >= 0) {
//            System.out.println(g + "положительное число ");
//        }else{
//        if (g < 0) {
//            System.out.println(g + "отрицательное число ");
//        }
//    }

    //Homework part 6
    public static boolean method_If_3(int h) {
        System.out.println("********part 6********");
        if (h < 0) {
            return true;
            // System.out.println(h + "отрицательное число "); //до этого места программа не дойдет
        }
        return false;
        // System.out.println(h + "положительное число "); //до этого места программа не дойдет
    }

    //Homework part 7
    public static void printName(String MyName) {
        System.out.println("********part 7********");
        System.out.println("Hello," + MyName + "!");
    }

    //Homework part 8


    public static void year(int y) {
        System.out.println("********part 8********");
        System.out.println("Input year:");
        Scanner scanner = new Scanner(System.in);
        y = scanner.nextInt();
        System.out.println("Year:" + y);
        if ((((y % 4) == 0) || ((y % 400) == 0)) && ((y % 100) != 0)) {
            System.out.println("Yes");
        }
        System.out.println("No");
    }
}


