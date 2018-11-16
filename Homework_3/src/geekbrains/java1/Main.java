package geekbrains.java1;
//ЗАДАЧА 1
//1. Написать программу, которая загадывает случайное число от 0 до 9,
// и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли
// указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос –
// «Повторить игру еще раз?
// 1 – да / 0 – нет»(1 – повторить, 0 – нет).

//import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число от  0 до 9  (включительно):  ");
        int player = scanner.nextInt(); // возвращаем введенное число из сканера в переменную player
        System.out.println("Вы ввели число " + player);
        Random randomNumber = new Random(); // генерируем случайное число randomNumber
        int guess = randomNumber.nextInt(10); // возвращаем сгенерированное число от 0 до 9 в переменную guess
        System.out.println(guess); //!!!!!!!! временная строка для контроля !!!!!!!!!!!!!!!!
        for (int i = 0; i <= 3; i++) { //это надо написать где-то ниже?
            if (player < guess) {
                System.out.println("Ваше число меньше загаданного. Попытайтесь угадать еще раз: ");
            } else {
                if (player > guess) {
                    System.out.println("Ваше число больше загаданного. Попытайтесь угадать еще раз: ");
                } else {
                    System.out.println("Вы угадали!");
                }
            }
        }
        System.out.println("Сыграем еще? 1 - да, 0 -- нет ");
        Scanner scan = new Scanner(System.in);
        int nextPlay = scan.nextInt();
        if (nextPlay == 1);{
        // продолжить игру. Как ?
        }
        System.out.println("Спасибо за игру!");
    }
}

