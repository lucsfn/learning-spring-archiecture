package com.github.lucsfn.spring_architecture.car.manufacturer;

import java.awt.*;

public class Car {
    private String model;
    private Color color;
    private Engine engine;
    private Manufacturer manufacturer;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public CarStatus start(Key key) {
        if (key.getManufacturer() != this.manufacturer) {
            return new CarStatus("It's not possible to start car with this key!");
        }

        return new CarStatus("Car started with engine:" + this.engine);
    }
}
