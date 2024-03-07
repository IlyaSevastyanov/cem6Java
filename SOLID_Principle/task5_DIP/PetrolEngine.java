package SOLID_Principle.task5_DIP;

// 5) Переписать код в соответствии с Dependency Inversion Principle:
/**
 * Класс, представляющий бензиновый двигатель.
 */
public class PetrolEngine implements Start {
    /**
     * Метод для запуска двигателя автомобиля.
     */
    public void start() {
        System.out.println("Start!");
    }
}
