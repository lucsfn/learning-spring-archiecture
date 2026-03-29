package com.github.lucsfn.spring_architecture.car.manufacturer.api;

import com.github.lucsfn.spring_architecture.car.manufacturer.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class ManufacturerController {

    @Autowired
    @Turbo
    private Engine engine;

    @PostMapping
    public CarStatus startCar(@RequestBody Key key) {
        var car = new HondaHRV(engine);

        return car.start(key);
    }

}
