package src.SOLID.task1_SRP;

// 1) Переписать код в соответствии с Single Responsibility Principle:
/**
 * Класс SalaryCalc для расчета чистой зарплаты(с учетом налога) на основе базовой зарплаты.
 */
public class SalaryCalc {
    private int baseSalary;

    /**
     * Конструктор класса SalaryCalc с заданной базовой зарплатой.
     * @param baseSalary базовая зарплата сотрудника
     */
    public SalaryCalc(int baseSalary) {
        this.baseSalary = baseSalary;

    }
    /**
     * Рассчитывает чистую зарплату после вычета 25% налога от базовой зарплаты.
     * @return чистая зарплата после вычета налога
     */
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25); //calculate in otherway
        return baseSalary - tax;
    }
    /**
     * Получает базовую зарплату, используемую для расчета чистой зарплаты.
     * @return базовая зарплата сотрудника
     */
    public int getBaseSalary() {
        return baseSalary;
    }
}
