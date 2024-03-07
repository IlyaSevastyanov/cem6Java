package src.SOLID.task2_OCP;

// 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:

/**
 * Класс Car.
 * Представляет класс  машины, который является подклассом класса Vehicle.
 */
public class Car extends Vehicle {

    /**
     * Конструктор класса Car.
     * @param maxSpeed максимальная скорость
     * @param type тип транспорта
     * @param speedCoefficient коэффициент скорости
     */
    public Car(int maxSpeed, String type, double speedCoefficient) {
        super(maxSpeed, type, speedCoefficient);
    }
}
