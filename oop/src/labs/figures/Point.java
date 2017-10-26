package labs.figures;

import static java.lang.Math.*;

/**
 * Точка двумерной плоскости
 */
public class Point {
    //поля
    private final double y;
    private final double x;

    /**
     * Если создаем точку без указания параметров, координат, то по-умолчанию создается точка в центре координат
     */
    public Point(){
        x = 0.0;
        y = 0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    /**
     * Эвклидово расстояние между двумя точками
     * @param p
     * @return
     */
    public double distance(Point p){
        return sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }
}
