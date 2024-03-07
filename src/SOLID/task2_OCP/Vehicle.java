package src.SOLID.task2_OCP;

// 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:

/**
 * Представляет абстрактный класс транспортного средства.
 */
public abstract class Vehicle {
    private int maxSpeed;
    private String type;
    private double speedCoefficient;

    /**
     * Конструктор класса Vehicle.
     * @param maxSpeed максимальная скорость
     * @param type тип транспорта
     * @param speedCoefficient коэффициент скорости
     */

    public Vehicle(int maxSpeed, String type, double speedCoefficient) {
        this.maxSpeed = maxSpeed;
        this.type = type;
        this.speedCoefficient = speedCoefficient;
    }

    /**
     * Возвращает максимальную скорость транспортного средства.
     *
     * @return максимальная скорость.
     */
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    /**
     * Возвращает коэффициент скорости транспортного средства.
     *
     * @return коэффициент скорости.
     */
    public double getSpeedIndex() {
        return this.speedCoefficient;
    }
    /**
     * Возвращает тип транспортного средства.
     *
     * @return тип транспортного средства.
     */
    public String getType() {
        return this.type;
    }

    /**
     * Метод расчета допустимой скорости с учетом ограничивающего коэффициента скорости.
     *
     * @return разрешимая скорость.
     */
    public double calculateAllowedSpeed() {
        return this.maxSpeed * this.speedCoefficient;
    }
}