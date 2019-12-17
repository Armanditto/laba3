package auto;
public class RedC extends MakeCar {
    @Override
    protected Car createCar(CarModel type) {
        CarFabric carFabr = new CarFabric();
        return carFabr.createCar(type, ColorC.Black);
    }
}