package SOLID_Principle.task3_ISP;

// 3) Переписать код в соответствии с Interface Segregation Principle:

/**
 * Класс Circle.
 * Представляет круг с заданным радиусом.
 */
public class Circle implements Area {
    private double radius;

    /**
     * Конструктор класса Circle.
     * @param radius радиус круга.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Вычисляет площадь круга по формуле.
     * @return площадь круга.
     */
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

}
