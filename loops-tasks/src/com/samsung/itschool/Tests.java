package com.samsung.itschool;

import org.junit.Assert;
import org.junit.Test;


public class Tests {

    @Test
    public void testFibonachiBase() {
        Assert.assertArrayEquals(new int[]{1, 1}, LoopsTasks.fibonachi(2));
    }

    @Test
    public void testFibonachi8() {
        Assert.assertArrayEquals(new int[]{1, 1, 2, 3, 5, 8, 13, 21}, LoopsTasks.fibonachi(8));
    }

    @Test
    public void testFibonachi5() {
        Assert.assertArrayEquals(new int[]{1, 1, 2, 3, 5}, LoopsTasks.fibonachi(5));
    }

    @Test
    public void testFibonachiSingle() {
        Assert.assertArrayEquals(new int[]{1}, LoopsTasks.fibonachi(1));
    }

    @Test
    public void testDistZero() {
        Assert.assertEquals(0, LoopsTasks.dist(new double[]{0.0, 0.0}, new double[]{0.0, 0.0}), 0.0001);
    }

    @Test
    public void testDist2D() {
        Assert.assertEquals(8.315046602394963, LoopsTasks.dist(new double[]{2.3, 4.5}, new double[]{1.8, 12.8}), 0.0001);
    }

    @Test
    public void testDist3D() {
        Assert.assertEquals(20.688160865577203,
                LoopsTasks.dist(
                        new double[]{6.0, 2.0, 85.0},
                        new double[]{12, -12, 99,}),
                0.0001);
    }

    @Test
    public void testDist5D() {
        Assert.assertEquals(5.683308895353129,
                LoopsTasks.dist(
                        new double[]{1.0, 2.0, 3.0, 4.0, 5.0},
                        new double[]{0.6, 0.7, 0.8, 0.9, 1.0}),
                0.0001);
    }

    @Test
    public void testFParabola(){
        double f = LoopsTasks.f(new double[]{1, 0, -1}, 2);
        Assert.assertEquals(3, f, 0.00001);
    }

    @Test
    public void testFHiperbolic(){
        double f = LoopsTasks.f(new double[]{1, 1, -1 , 3}, 2);
        Assert.assertEquals(13, f, 0.00001);
    }

    @Test
    public void testEquationParabola(){
        Assert.assertEquals(-1.0, LoopsTasks.equation(new double[]{1, 0, -1},-1000, 1000, 0.1), 0.000001);
    }

    @Test
    public void testEquationNoRoots(){
        Assert.assertEquals(Double.MAX_VALUE, LoopsTasks.equation(new double[]{1, 2, 3, 4, 5},-1000, 1000, 0.1), 0.000001);
    }

    @Test
    public void testEquationComplex(){
        Assert.assertEquals(2.0, LoopsTasks.equation(new double[]{1, -5 , 6},-1000, 1000, 0.1), 0.000001);
    }

    @Test
    public void testLastEnemy0(){
        Assert.assertEquals( "Среди врагов 1 -1 0 1 -1 искомым является третий враг с индексом 2",2 , LoopsTasks.lastEnemy(new int[]{1,-1, 0, 1, -1}));
    }

    @Test
    public void testLastEnemy5(){
        Assert.assertEquals("Среди врагов 2 5 3 искомым является второй враг с индексом 1", 1, LoopsTasks.lastEnemy(new int[]{2, 5, 3}));
    }

    @Test
    public void testFactorial3(){
        Assert.assertEquals("Факториал 3 должен равняться 6", 6, LoopsTasks.factorial(3));
    }

    @Test
    public void testFactorial5(){
        Assert.assertEquals("Факториал 5 должен равняться 120",120, LoopsTasks.factorial(5));
    }

    @Test
    public void testFactorial0(){
        Assert.assertEquals("Факториал 0 должен равняться 1",1, LoopsTasks.factorial(0));
    }

    @Test
    public void testReverse3(){
        Assert.assertArrayEquals("Массив чисел 1 2 3 должен выдавать в обратом порядке 3 2 1",
                new int[]{3, 2, 1}, LoopsTasks.reverse(new int[]{1, 2, 3}));
    }

    @Test
    public void testReverse4(){
        Assert.assertArrayEquals("Массив чисел 0 1 2 3 должен выдавать в обратом порядке 3 2 1 0",
                new int[]{3, 2, 1, 0}, LoopsTasks.reverse(new int[]{0, 1, 2, 3}));
    }
}
