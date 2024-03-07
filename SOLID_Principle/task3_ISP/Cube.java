package SOLID_Principle.task3_ISP;

// 3) Переписать код в соответствии с Interface Segregation Principle:

/**
 * Класс Cube.
 * Представляет куб с заданными ребрами.
 */
public class Cube implements Volume {
    private int edge;

    /**
     * Конструктор класса Cube.
     * @param edge реро куба.
     */
    public Cube(int edge) {
        this.edge = edge;
    }
    /**
     * Вычисляет площадь объекта.
     * @return площадь обьекта.
     */
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    /**
     * Вычисляет обьем объекта.
     * @return обьект обьекта.
     */
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
