package day2.Task12_13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;



public class CarService {
    private final List<Car> cars = new ArrayList<>();

    public void add(Car car) {
        cars.add(car);
    }
    public void remove(Car car) {
        cars.remove(car);
    }
    public List<Car> getAll() {
        return new ArrayList<>(cars);
    }
    public List<Car> getAllV12() {
        return cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .collect(Collectors.toList());
    }
    public List<Car> getProducedBefore1999() {
        return cars.stream()
                .filter(car -> car.getProductionYear() < 1999)
                .collect(Collectors.toList());
    }
    public Car getMoustExpansiveCar() {
        return cars.stream()
                //.max(Comparator.comparing(car -> car.getPrice());
                .max(Comparator.comparingDouble(Car::getPrice))
                .get();
    }
    public List<Car> getCarsWithMoreThanTwoManufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 2)
                .toList();
    }
    public List<Car> getCarsOfGivenManufacturer(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .toList();
    }

}
