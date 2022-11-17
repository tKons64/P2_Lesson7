package Transports;

public class Truck extends Transport implements Competable{
    public Truck(String brand, String model, int engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public int bestLapTime() {
        return 9;
    }

    @Override
    public int maxSpeed() {
        return 120;
    }
}
