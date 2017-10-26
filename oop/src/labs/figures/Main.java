package labs.figures;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Circle c1 = new Circle(new Point(0.0, 0.0), 12);
        Circle c2 = new Circle(new Point(3.0, 5.0), 11);
        String areaMessage = c1.getArea() == c2.getArea() ? "площади равны" : "площади не равны";
        System.out.println(areaMessage);
        String intersectsMessage = c1.intersects(c2)? "круги пересекаются" : "круги не пересекаются";
        System.out.println(intersectsMessage);
    }
}
