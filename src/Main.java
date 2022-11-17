import Driver.DriverB;
import Driver.DriverC;
import Driver.DriverD;
import Other.Mechanic;
import Other.Sponsor;
import Transports.Bus;
import Transports.Car;
import Transports.Transport;
import Transports.Truck;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

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
//        System.out.println(driverCar);
//        System.out.println(driverTruck);
//        System.out.println(driverBus);

        //Урок 7. Домашне задание 1
        System.out.println("");
        System.out.println("Урок 7. Домашне задание 1");

        Mechanic<Car> boris = new Mechanic<>("Борис", "Россия");
        Mechanic<Truck> petr = new Mechanic<>("Петр", "Россия");
        Mechanic<Transport> ivan = new Mechanic<>("Иван", "Россия");
        Mechanic<Car> jonh = new Mechanic<>("Джон", "Германия");
        Mechanic<Truck> frank = new Mechanic<>("Френк", "Швеция");

        Sponsor spElonMusk = new Sponsor("Илон Маск", Sponsor.TypeSponsor.INDIVIDUAL, 1_000_000);
        Sponsor spGoogle = new Sponsor("Google", Sponsor.TypeSponsor.COMPANY, 7_000_000);
        Sponsor spGazProm = new Sponsor("Газпром", Sponsor.TypeSponsor.COMPANY, 200_000);
        Sponsor spPotanin = new Sponsor("Потанин", Sponsor.TypeSponsor.INDIVIDUAL, 50_000);

        crLada.addDriver(driverCar);
        crLada.addSponsors(spPotanin, spGazProm);
        crLada.addMechanics(boris, ivan);

        trScania.addDriver(driverTruck);
        trScania.addSponsors(spGoogle, spElonMusk);
        trScania.addMechanics(frank, ivan);

        bsKamaz.addDriver(driverBus);
        bsKamaz.addSponsors(spGazProm);
        bsKamaz.addMechanics(ivan);

        List<Transport> racingCars = List.of(
                crLada,
                trScania,
                bsKamaz);

        for (Transport transport: racingCars) {
            printDataTransport(transport);
        }
    }

    public static void printDataTransport(Transport transport) {
        System.out.println("Автомобиль " + transport.getBrand() + " " + transport.getModel() +
                ", управляется водителем - " + transport.getDriver());
        System.out.println("Спонсоры:");
        System.out.println(transport.getSponsors());
        System.out.println("Механики:");
        System.out.println(transport.getMechanics());
        System.out.println();

    }

}