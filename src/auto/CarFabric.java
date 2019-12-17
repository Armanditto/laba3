package auto;
class CarFabric {
    Car createCar(CarModel type, ColorC color) {
        Car car = null;
        switch (type) {
            case Jeep:
                car = new Jeep(color);
                break;
            case Toyota:
                car = new Toyota(color);
                break;
            case BMW:
                car = new BMW(color);
                break;
        }
        return car;
    }
}