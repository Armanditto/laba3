package auto;
import java.util.concurrent.atomic.AtomicInteger;
class Sklad {
    private static Sklad skladExample;
    private AtomicInteger numCars;
    private static final int MAX_CARS = 5;
    private Sklad() {
        numCars = new AtomicInteger();
        numCars.set(0);
    }
    static Sklad getSkladExample() {
        if (skladExample == null) {
            skladExample = new Sklad();
        }
        return skladExample;
    }
    void getSkladInfo() {
        System.out.println("Максимальное число автомобилей : " + MAX_CARS);
        System.out.println("Текущее число автомобилей : " + numCars.get());
    }
    void addCar() {
        if (numCars.get() < MAX_CARS) {
            System.out.println("Было: " + numCars.get());
            numCars.getAndIncrement();
            System.out.println("Стало: " + numCars.get());
        } else {
            System.out.println("На складе не хватает места");
        }
    }
    void removeCar() {
        if (numCars.get() > 0) {
            System.out.println("Было: " + numCars.get());
            numCars.getAndDecrement();
            System.out.println("Стало: " + numCars.get());
        } else {
            System.out.println("На складе закончились автомобили ");
        }
    }
}