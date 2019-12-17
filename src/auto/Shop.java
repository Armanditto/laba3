package auto;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Shop {
    public static void main(String[] args) {
        Sklad.getSkladExample().getSkladInfo();
        Runnable taskCreateCars = () -> {
            for (int i = 1; i < 2; i++) {
                List<MakeCar> carsMakesList = Arrays.asList(new WhiteC(), new BlackC(), new RedC());
                MakeCar randomCarMaking = carsMakesList.get((new Random()).nextInt(carsMakesList.size()));
                Car car = randomCarMaking.orderCar(CarModel.getRandomCarType());
                showCarInfo(car);
                Sklad.getSkladExample().addCar();
            }
        };
        Runnable taskBuyCars = () -> {
            Sklad.getSkladExample().removeCar();
        };
        List<Thread> threadList = Arrays.asList(new Thread(taskCreateCars), new Thread(taskBuyCars));
        ExecutorService executor= Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        try{
            while(true) {
                executor.execute(threadList.get((new Random()).nextInt(threadList.size())));
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }catch(Exception err){
            err.printStackTrace();
        }
        executor.shutdown();
    }
    private static void showCarInfo(Car car) {
        System.out.println("Марка: " + car.getCarMark());
        System.out.println("Цвет: " + car.getCarColor());
    }
}