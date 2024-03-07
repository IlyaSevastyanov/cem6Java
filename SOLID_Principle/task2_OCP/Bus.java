package SOLID_Principle.task2_OCP;

// 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:
/**
 * Класс Bus.
 * Представляет класс автобуса, который является подклассом класса Vehicle.
 */
public class Bus extends Vehicle {

    /**
     * Конструктор класса Bus.
     * @param maxSpeed максимальная скорость
     * @param type тип транспорта
     * @param speedCoefficient коэффициент скорости
     */
    public Bus(int maxSpeed, String type, double speedCoefficient) {
        super(maxSpeed, type, speedCoefficient);
    }
}
