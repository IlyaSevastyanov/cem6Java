package SOLID_Principle.task3_ISP;

// 3) Переписать код в соответствии с Interface Segregation Principle:

/**
 * Представляет интерфейс для объектов, имеющих обьем. Расширяет интерфейс Area.
 */
public interface Volume extends Area {
    /**
     * Вычисляет обьем объекта.
     */
    double volume();
}
