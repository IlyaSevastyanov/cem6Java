package SOLID_Principle.task4_LSP;

// 4) Переписать код в соответствии с Liskov Substitution Principle:

/**
 * Класс, представляющий прямоугольник.
 */
public class Rectangle{
    private int width;
    private int height;

    /**
     * Конструктор класса Rectangle.
     * @param width ширина прямоугольника
     * @param height высота прямоугольника
     */

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    /**
     * Устанавливает новое значение ширины прямоугольника.
     *
     * @param width новая ширина прямоугольника.
     */
    public void setWidth(int width) {
        this.width = width;
    }
    /**
     * Устанавливает новое значение высоты прямоугольника.
     *
     * @param height новая высота прямоугольника.
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Вычисляет площадь прямоугольника по формуле width * height, где width - ширина прямоугольника,
     * а height - высота прямоугольника.
     *
     * @return площадь прямоугольника.
     */
    public int area() {
        return this.width * this.height;
    }

}
