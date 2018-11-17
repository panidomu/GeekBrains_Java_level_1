package geekbrains.java1;
//ЗАДАЧА 1
//1. Написать программу, которая загадывает случайное число от 0 до 9,
// и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли
// указанное пользователем число чем загаданное, или меньше.
// После победы или проигрыша выводится запрос –
// «Повторить игру еще раз?
// 1 – да / 0 – нет»(1 – повторить, 0 – нет).

import java.util.Random;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int x = guessNumber("Введите целое число от  0 до 9  (включительно):  ");  //вызываем  метод?
        int y = playNew(); //вызываем  метод?
        System.out.println("Повторить игру еще раз? 1 - да, 0 -- нет ");
    }

    public static int guessNumber(int player, int guess);  //определяем метод?

    {
        do {
            int i = 0;
            int player = scanner.nextInt(); // возвращаем введенное число из сканера в переменную player
            System.out.println("Вы ввели число " + player);
            Random randomNumber = new Random(); // генерируем случайное число randomNumber
            int guess = randomNumber.nextInt(10); // возвращаем сгенерированное число от 0 до 9 в переменную guess
            System.out.println(guess); //!!!!!!!! временная строка для контроля , потом уберу !!!!!!!!!!!!!!!!

            if (player < guess) {
                System.out.println("Ваше число меньше загаданного. Попытайтесь угадать еще раз: ");
                i++;
            } else {
                if (player > guess) {
                    System.out.println("Ваше число больше загаданного. Попытайтесь угадать еще раз: ");
                    i++;
                } else {
                    System.out.println("Вы угадали!");
                }
            }
        } while (i = 3);
    }

    public static int playNew(int nextPlay);  //определяем метод?

    int nextPlay = scan.nextInt();
     if(nextPlay ==1);
    {
        int x = guessNumber("Введите целое число от  0 до 9  (включительно):  ");  //как здесь еще раз вызвать метод?
    }
         System.out.println("Спасибо за игру!");
}



