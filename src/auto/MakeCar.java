package auto;
public abstract class MakeCar {
    public Car orderCar(CarModel type) {
        Car car = createCar(type);
        car.makeCar();
        return car;
    }
    protected abstract Car createCar(CarModel type);
}
