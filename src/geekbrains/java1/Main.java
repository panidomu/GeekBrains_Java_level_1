package geekbrains.java1;

import java.text.MessageFormat;
import java.util.Random;
import java.util.Scanner;

public class Main {
   // public class XOGame {

        public static String[][] map;
        public static final int SIZE = 3;
        public static final int DOT_TO_WIN = 3;

        // Ячейки поля
        public static final String DOT_EMPTY = "*";
        public static final String DOT_X = "X";
        public static final String DOT_O = "O";

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            computerTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Выиграл компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена!");

    }
        /**
         * Метод инициализирует игровое поле
         */
        public static void initMap() {
            map = new String[SIZE][SIZE];
            // В циклах происходит заполение массива элементами из DOT_EMPTY
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }
        /**
         * Метод печатает игровое поле в консоль
         */
        public static void printMap() {
            System.out.print("  ");
            for (int i = 1; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        /**
         * Метод обрабатывает ход человека
         */
        public static void humanTurn() {
            Scanner scanner = new Scanner(System.in);
            int row;
            int column;
            do {
                System.out.println("Введите координаты хода в формате X и Y, \n" +
                        "где X - номер строки, а Y - номер колонки");
                row = scanner.nextInt() - 1;
                column = scanner.nextInt() - 1;
            } while (isCellNotValid(row, column));
            map[row][column] = DOT_X;
        }
        /**
         * Метод обрабатывает ход компьютера
         */
        public static void computerTurn() {
            Random random = new Random();
            int row;
            int column;
            do {
                row = random.nextInt(SIZE);
                column = random.nextInt(SIZE);
            } while (isCellNotValid(row, column));
            System.out.println(
                    MessageFormat.format("Компьютер походил в точку {0} {1}",
                            row + 1, column + 1));
            map[row][column] = DOT_O;
        }
        /**
         * Метод проверяет координаты хода на допустимость.
         * @param row    координата строки
         * @param column координата колонки
         * @return {@code true} если ход допустим, иначе {@code false}
         */
        public static boolean isCellNotValid(int row, int column) {
            if (row < 0 || row >= SIZE || column < 0 || column >= SIZE) {
                return true;
            }
            // Сравнивать строки нужно только методом equals()
            if (map[row][column].equals(DOT_EMPTY)) {
                return false;
            }
            return true;
        }
        /**
         * Метод проверяет поле на наличие пустых клеток
         * @return {@code true} если пустых клеток нет, иначе {@code false}
         */
        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j].equals(DOT_EMPTY)) {
                        return false;
                    }
                }
            }
            return true;
        }
        public static boolean checkWin(String symb) {
            // проверка линий
            if(map[0][0].equals(symb) && map[0][1].equals(symb) && map[0][2].equals(symb)) return true;
            if(map[1][0].equals(symb) && map[1][1].equals(symb) && map[1][2].equals(symb)) return true;
            if(map[2][0].equals(symb) && map[2][1].equals(symb) && map[2][2].equals(symb)) return true;
            // проверка столбцов
            if(map[0][0].equals(symb) && map[1][0].equals(symb) && map[2][0].equals(symb)) return true;
            if(map[0][1].equals(symb) && map[1][1].equals(symb) && map[2][1].equals(symb)) return true;
            if(map[0][2].equals(symb) && map[1][2].equals(symb) && map[2][2].equals(symb)) return true;
            // проверка диагоналей
            if(map[0][0].equals(symb) && map[1][1].equals(symb) && map[2][2].equals(symb)) return true;
            if(map[2][0].equals(symb) && map[1][1].equals(symb) && map[0][2].equals(symb)) return true;
            return false;
        }

    }
