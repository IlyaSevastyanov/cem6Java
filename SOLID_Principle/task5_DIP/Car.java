package SOLID_Principle.task5_DIP;

// 5) Переписать код в соответствии с Dependency Inversion Principle:
/**
 * Класс, представляющий автомобиль.
 */
public class Car  {
    private PetrolEngine engine;

    /**
     * Конструктор класса Car.
     *
     * @param engine объект с  бензиновым двигателем
     */
    public Car(PetrolEngine engine) {
        this.engine = engine;
    }
    /**
     * Метод для запуска двигателя автомобиля.
     */
    public void start() {
        this.engine.start();
    }
}
