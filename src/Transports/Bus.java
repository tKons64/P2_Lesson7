package Transports;

public class Bus extends Transport implements Competable{
    public Bus(String brand, String model, int engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп");
    }

    @Override
    public int bestLapTime() {
        return 10;
    }

    @Override
    public int maxSpeed() {
        return 80;
    }
}
