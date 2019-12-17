package auto;
import java.util.Random;
public enum CarModel {
    BMW,
    Jeep,
    Toyota;
    public static CarModel getRandomCarType() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
