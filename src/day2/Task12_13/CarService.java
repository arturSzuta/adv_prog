package day2.Task12_13;

import java.util.ArrayList;
import java.util.List;

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
}
