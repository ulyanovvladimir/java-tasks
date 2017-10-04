package com.samsung.itschool;

public class LoopsTasks {

    public static void main(String[] args) {
        // write your code here
        for (long k : fibonachi(12)) {
            System.out.println(k);
        }
    }


    /**
     * Декартово расстояние между точками n-мерного пространства
     *
     * @param x точка n-мерного пространства
     * @param y точка n-мерного пространства
     * @return
     * @link http://statistica.ru/glossary/general/evklidovo-rasstoyanie/
     */
    public static double dist(double[] x, double[] y) {
        //todo Определить стартовое значение аккумулятора
        double sum = 0;
        //todo в цикле суммировать в аккумуляторе квадраты разностей координат.
        for (int i = 0; i < x.length; i++) {
            double r = Math.pow(x[i] - y[i], 2);
            sum = sum + r;
        }
        //todo вернуть квадратный корень накопленной суммы
        return Math.sqrt(sum);
    }


    /**
     * Числа Фибоначи.
     * Числами Фибоначи называют следующий ряд:
     * 1 1 2 3 5 8 13 21 34 ...
     * Первые два элемента последовательности равняются 1.
     * Последующие элементы вычисляются с помощью суммы двух предыдущих элементов:
     * 1+1 = 2
     * 1+2 = 3
     * 2 + 3 = 5
     * и т.д.
     * <p>
     * Функция возвращает массив, заполненный числами Фибоначи размерности n
     *
     * @param n первых чисел ряда Фибоначи
     * @return массив, содержащий n первых чисел ряда Фибоначи
     */
    public static int[] fibonachi(int n) {
        //todo Определяем массив размерности n
        int[] mas = new int[1];

        //return new int[]{1, 1, 2, 3, 5}

        //todo первые два элемента равны 1.
        mas[0] = 1;

        //todo с третьего элемента число Фибоначи равно сумме двух предыдущих

        //Возвращаем массив mas
        return mas;
    }


    /**
     * Значение многочлена функции
     * f(x) = a0*x^(n-1) + a1*x^(n-2)+ ... + an
     *
     * @param a - вектор параметров
     * @param x - значение аргумента фукнции
     * @return значение f(x)
     */
    public static double f(double a[], double x) {
        //todo заводим аккумулятор для суммы
        double sum;
        //todo находим n как длину массива с параметрами
        int n;
        //todo в цикле суммируем по формуле

        //todo возвращаем накопленную сумму
        return 0;
    }

    /**
     * Найти первый корень уравнения на интервалле от min до max c шагом step
     * В случае, если корней нет, возвращаем Double.MAX_VALUE
     *
     * @param a - вектор параметров, задающий многочлен
     * @return
     */
    public static double equation(double a[], double min, double max, double step) {
        //todo организовать цикл от min до max с шагом step
        double x = 0.0;
        //todo вычисляем значение функции f(x)
        double fx = 0.0;
        //Если f(x) = 0, возаращаем найденный корень, x
        if (fx < 0.000001) return x;

        //todo если на заданном интервалле не нашли корней, возвращаем константу Double.MAX_VALUE
        return Double.MAX_VALUE;
    }

}
