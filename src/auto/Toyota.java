package auto;
class Toyota extends Car {
    private ColorVar colorVar;
    Toyota(ColorC color) {
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
        carMark = "Toyota";
        carColor = colorVar.getCarColor();
    }
}