import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc  = new Scanner(System.in);
        //Вводим число строк с консоли
        int n = sc.nextInt();
        //Ввводим число столбцов с консоли
        int m = sc.nextInt();
        //вводим массив размерности n на m
        int[][] arr = inputArray(n, m);
        //трансформируем введенный массиив
        int[][] arr2 = transform(arr);
        //выводим его на экран
        print(arr2);
    }

    /**
     * Выводит на печать массив.
     * @param mas массив для вывода на печать
     */
    public static void print(int[][] mas) {
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " "); // println \r\n
            }
            System.out.println("");
        }
    }

    /**
     * Функция возвращает массив размерности n на m заполненный с консоли
     * @param n количество строк массива
     * @param m количество столбцов массива
     * @return массив размерности n на m, заполненный значениями, введенными с консоли
     */
    public static int[][] inputArray(int n, int m) {
        Scanner scan = new Scanner(System.in);
        //создаем массив нужной размерности
        int[][] ret = new int[n][m];
        //в цикле пробегаем строки
        for (int i = 0; i < n; i++) {
            //для каждой строки пробегаем столбцы
            for (int j = 0; j < m; j++) {
                //вводим значение ячейки массива (пересечение i строки и j столбца)
                ret[i][j] = scan.nextInt();
            }
        }
        //возвращаем созданный массив
        return ret;
    }

    /**
     * Пример трансформации массива. Массив поворачивается на 90 градусов по часовой стрелке
     * @param mas исходный массив
     * @return массив, повернутый на 90 градусов
     */
    static int[][] transform(int[][] mas) {
        int n = mas.length;
        int m = mas[0].length;

        int[][] arr = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[j][n-i-1] = mas[i][j];
            }
        }
        return arr;
    }
}
