package SOLID_Principle.task4_LSP;

// 4) Переписать код в соответствии с Liskov Substitution Principle:

/**
 * Класс, представляющий квадрат. Наследуется от класса Rectangle.
 */
public class Square extends Rectangle{

    /**
     * Конструктор класса Square. Создает квадрат с одинаковой шириной и высотой.
     *
     * @param width сторона квадрата
     */
    public Square(int width ) {
        super(width, width);
    }
}

