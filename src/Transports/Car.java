package Transports;

public class Car extends Transport implements Competable{
    public Car(String brand, String model, int engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public int bestLapTime() {
        return 8;
    }

    @Override
    public int maxSpeed() {
        return 150;
    }
}
