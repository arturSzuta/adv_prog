package day2.Task12_13;

import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private Double price;
    private int productionYear;
    private List<Manufacturer> manufacturers;
    private EngineType engineType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return productionYear == car.productionYear && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(manufacturers, car.manufacturers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, productionYear, manufacturers, engineType);
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public Double getPrice() {
        return price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public Car(String name, String model, Double price, int productionYear, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionYear = productionYear;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", productionYear=" + productionYear +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }
}
