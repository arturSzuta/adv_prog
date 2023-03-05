package day2.Task12_13;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manufacturer benz = new Manufacturer("Benz", 1883, "Germany");
        Manufacturer mercedes = new Manufacturer("Mercedes", 1901, "Germany");
        Manufacturer volvo = new Manufacturer("Volvo", 1926, "Sweden");
        Manufacturer fiat = new Manufacturer("Fiat", 1899, "Italy");

        Car x500 = new Car("x500", "Fiat", 35_000.0, 2010, List.of(fiat), EngineType.S3);
        Car gls_1 = new Car("GLS", "Mercedes", 500_000.0, 2022, List.of(mercedes, benz), EngineType.V12);
        Car gls_2 = new Car("GLS", "Mercedes", 200_000.0, 2019, List.of(mercedes, benz), EngineType.V8);
        Car xc90_1 = new Car("xc90", "Volvo", 300_000.0, 2022, List.of(volvo), EngineType.V12);
        Car xc90_2 = new Car("xc90", "Volvo", 150_000.0, 2018, List.of(volvo), EngineType.V6);
        Car xc60_1 = new Car("xc60", "Volvo", 200_000.0, 2020, List.of(volvo), EngineType.S6);
        Car xc60_2 = new Car("xc60", "Volvo", 20_00.0, 1998, List.of(volvo), EngineType.S3);

        CarService carService = new CarService();
        carService.add(x500);
        carService.add(gls_1);
        carService.add(xc90_1);
        carService.add(xc60_2);
        //carService.remove(x500);

        List<Car>returnedListOfCars = carService.getAll();

        System.out.println(carService.getAllV12());
        System.out.println("************");
        System.out.println(carService.getProducedBefore1999());
        System.out.println("************");
        System.out.println(carService.getMoustExpansiveCar());
        System.out.println("************");
        System.out.println(carService.getCarsWithMoreThanTwoManufacturers());
        System.out.println("************");
        System.out.println(carService.getCarsOfGivenManufacturer(volvo));
    }
}