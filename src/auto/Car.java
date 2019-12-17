package auto;
public abstract class Car {
    String carMark;
    String carColor;
    abstract void makeCar();
    public String getCarMark() {
        return carMark;
    }
    public String getCarColor() {
        return carColor;
    }
}