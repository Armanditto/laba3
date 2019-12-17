package auto;
class BMW extends Car {
    private ColorVar colorVar;
    BMW(ColorC color) {
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
        carMark = "BMW";
        carColor = colorVar.getCarColor();
    }
}