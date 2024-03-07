package SOLID_Principle.task2_OCP;

// 2) Переписать код SpeedCalculation в соответствии с Open-Closed Principle:

/**
 * Класс SpeedCalculation.
 * Представляет класс для вычисления допустимой скорости транспортного средства.
 */
public class SpeedCalculation {
    /**
     * Вычисляет допустимую скорость для заданного транспортного средства.
     * @param vehicle транспортное средство
     * @return допустимая скорость
     */
    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.calculateAllowedSpeed();
    }
}
