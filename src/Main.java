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
import java.util.*;
import java.util.concurrent.BlockingQueue;

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
//        System.out.println("");
//        System.out.println("Урок 7. Домашнее задание 1");
//
//        Mechanic<Car> boris = new Mechanic<>("Борис", "Россия");
//        Mechanic<Truck> petr = new Mechanic<>("Петр", "Россия");
//        Mechanic<Transport> ivan = new Mechanic<>("Иван", "Россия");
//        Mechanic<Car> jonh = new Mechanic<>("Джон", "Германия");
//        Mechanic<Truck> frank = new Mechanic<>("Френк", "Швеция");
//
//        Sponsor spElonMusk = new Sponsor("Илон Маск", Sponsor.TypeSponsor.INDIVIDUAL, 1_000_000);
//        Sponsor spGoogle = new Sponsor("Google", Sponsor.TypeSponsor.COMPANY, 7_000_000);
//        Sponsor spGazProm = new Sponsor("Газпром", Sponsor.TypeSponsor.COMPANY, 200_000);
//        Sponsor spPotanin = new Sponsor("Потанин", Sponsor.TypeSponsor.INDIVIDUAL, 50_000);
//
//        crLada.addDriver(driverCar);
//        crLada.addSponsors(spPotanin, spGazProm);
//        crLada.addMechanics(boris, ivan);
//
//        trScania.addDriver(driverTruck);
//        trScania.addSponsors(spGoogle, spElonMusk);
//        trScania.addMechanics(frank, ivan);
//
//        bsKamaz.addDriver(driverBus);
//        bsKamaz.addSponsors(spGazProm);
//        bsKamaz.addMechanics(ivan);
//
//        List<Transport> racingCars = List.of(
//                crLada,
//                trScania,
//                bsKamaz);
//
//        for (Transport transport: racingCars) {
//            printDataTransport(transport);
//        }

        //Урок 7. Домашне задание 2
//        System.out.println();
//        System.out.println("Урок 7. Домашнее задание 2");
//
//        ServiceStation<Car> crService = new ServiceStation<Car>("Автосервис легковых автомобилей");
//
//        crService.addTransports(crLada, crKia, crAudi, crBMW);
//        crService.toService();
//
//        ServiceStation<Truck> trService = new ServiceStation<Truck>("Автосервис грузовых автомобилей");
//
//        trService.addTransports(trKamaz, trScania, trVolvo, trMaz);
//        trService.toService();

        //Урок 7. Домашне задание 3
        Queue<String> cashDeskN1 = new ArrayDeque<>(5);
        cashDeskN1.offer("Покупатель1");
        cashDeskN1.offer("Покупатель2");
        cashDeskN1.offer("Покупатель3");
        Queue<String> cashDeskN2 = new ArrayDeque<>(5);
        cashDeskN2.offer("Покупатель4");
        cashDeskN2.offer("Покупатель5");
        Queue<String> cashDeskN3 = new ArrayDeque<>(5);
        Queue[] arrСashDesks = new ArrayList<>().toArray(new Queue[2]);
        arrСashDesks[0] = cashDeskN1;
        arrСashDesks[1] = cashDeskN2;

        addNewBuyer(arrСashDesks, 5, cashDeskN3);

    }

    public static void addNewBuyer(Queue<String>[] arrСashDesks, int count, Queue<String> reserveCashDesk) {
        count++;
        String newBuyer = "Покупатель" + count;
        Queue<String> minSizeСashDesk = null;
        for (int i = 0; i < arrСashDesks.length; i++) {
            if (minSizeСashDesk == null || minSizeСashDesk.size() > arrСashDesks[i].size()) {
                minSizeСashDesk = arrСashDesks[i];
            } else if (minSizeСashDesk.size() > arrСashDesks[i].size()) {
                minSizeСashDesk = arrСashDesks[i];
            }
        }
        if (minSizeСashDesk == reserveCashDesk && minSizeСashDesk.size() == 5) {
            System.out.println("Все очереди заняты - ожидайте!");
            return;
        } else if (minSizeСashDesk.size() == 5) {
            System.out.println("Просьбу позвать Галю!");
            arrСashDesks[0] = reserveCashDesk;
            addNewBuyer(arrСashDesks, count - 1, reserveCashDesk);
        } else {
            minSizeСashDesk.add(newBuyer);
            System.out.println("Покупатель - " + count + " добавлен в очередь - " + minSizeСashDesk);
            addNewBuyer(arrСashDesks, count, reserveCashDesk);
        }

        if (minSizeСashDesk.size() > 6) {
            return;
        } else {
            //addNewBuyer(arrСashDesks, count, reserveCashDesk);
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