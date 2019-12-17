package auto;
class Jeep extends Car {
    private ColorVar colorVar;
    Jeep(ColorC color) {
        switch (color) {
            case White:
                colorVar = new WhiteColor();
                break;
            case Black:
                colorVar = new BlackColor();
                break;
            case Red:
                colorVar = new RedColor();
                break;
        }
    }
    @Override
    void makeCar() {
        carMark = "Jeep";
        carColor = colorVar.getCarColor();
    }
}