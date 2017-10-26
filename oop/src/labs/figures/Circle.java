package labs.figures;

/**
 * Круг
 */
public class Circle {

    private final Point center;
    private final double radius;

    //Значения по-умолчанию
    public Circle(){
        center = new Point();
        radius = 1.0;
    }

    public Circle(Point point, double radius) {
        this.center = point;
        this.radius = radius;
    }

    /**
     * Расчет площади круг по полям класса
     * @return площадь круга по формуле
     */
    public double getArea(){
        return Math.PI * 2 * radius;
    }

    /**
     * Пересекает ли наш круг другой круг
     * @param c другой круг
     * @return true, если пересекает
     */
    public boolean intersects(Circle c){
        //Если сумма радиусов больше чем расстояние между центрами кругов
        return (radius + c.radius > center.distance(c.center));
    }
}
