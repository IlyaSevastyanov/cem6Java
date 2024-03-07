package src.SOLID.task1_SRP;

import java.util.Date;

//1) Переписать код в соответствии с Single Responsibility Principle:

/**
 *  Класс Employee описывает сотрудника с именем, датой рождения и базовой зарплатой.
 */
public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    /**
     * Конструктор класса Employee.
     * @param name имя сотрудника
     * @param dob дата рождения сотрудника
     * @param baseSalary базовая зарплата сотрудника
     */
    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    /**
     * Переопределенный метод getEmpInfo. Возвращает строковое представление информации о сотруднике.
     * @return строка, содержащая имя и дату рождения сотрудника
     */
    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    /**
     * Возвращает базовую зарплату сотрудника.
     * @return базовая зарплата сотрудника
     */
    public int getBaseSalary() {
        return baseSalary;
    }
}

