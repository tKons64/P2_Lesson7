import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Transports.Bus;
import Transports.Car;
import Transports.Truck;

public class Main {
    public static void main(String[] args) {

        Car crLada = new Car("LADA", "2105", 0);
        Car crKia = new Car("KIA", "Sorento", 0);
        Car crBMW = new Car("BMW", "5", 0);
        Car crAudi = new Car("Audi", "80", 0);

        Truck trKamaz = new Truck("Камаз", "55111", 0);
        Truck trVolvo = new Truck("Volvo", "FH16", 0);
        Truck trScania = new Truck("Scania", "Interlink", 0);
        Truck trMaz = new Truck("МАЗ", "5440М9", 0);

        Bus bsLiaz = new Bus("ЛИАЗ", "4292 ", 0);
        Bus bsKamaz = new Bus("Камаз", "6250", 0);
        Bus bsGaz = new Bus("ГАЗель ", "27057", 0);
        Bus bsIkarus = new Bus("Икарус", "250", 0);

        crLada.pitStop();
        System.out.println(crKia.bestLapTime());
        System.out.println(crBMW.maxSpeed());

        trKamaz.pitStop();
        System.out.println(trVolvo.bestLapTime());
        System.out.println(trScania.maxSpeed());

        bsLiaz.pitStop();
        System.out.println(bsKamaz.bestLapTime());
        System.out.println(bsGaz.maxSpeed());

        DriverB driverCar = new DriverB("DriverCar", 10, crAudi);
        DriverC driverTruck = new DriverC("DriverTruck", 2, trMaz);
        DriverD driverBus = new DriverD("DriverBus", 7, bsIkarus);
        System.out.println(driverCar);
        System.out.println(driverTruck);
        System.out.println(driverBus);

        //Урок 7. Домашне задание 1
    }
}