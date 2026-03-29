package com.github.lucsfn.spring_architecture.car.manufacturer;

import java.awt.*;

public class HondaHRV extends Car {

    public HondaHRV(Engine engine) {
        super(engine);
        setModel("HRV");
        setColor(Color.GRAY);
        setManufacturer(Manufacturer.HONDA);
    }
}
