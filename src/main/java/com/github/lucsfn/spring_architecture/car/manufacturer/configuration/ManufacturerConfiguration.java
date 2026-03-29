package com.github.lucsfn.spring_architecture.car.manufacturer.configuration;

import com.github.lucsfn.spring_architecture.car.manufacturer.Engine;
import com.github.lucsfn.spring_architecture.car.manufacturer.EngineType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ManufacturerConfiguration {

    @Bean(name = "aspiratedEngine")
    @Primary
    public Engine aspiratedEngine() {
        var engine = new Engine();
        engine.setHorsePower(150);
        engine.setCylinderPower(4);
        engine.setModel("XPTO-0");
        engine.setDisplacement(2.0);
        engine.setEngineType(EngineType.ASPIRADO);
        return engine;
    }

    @Bean(name = "electricEngine")
    public Engine electricEngine() {
        var engine = new Engine();
        engine.setHorsePower(110);
        engine.setCylinderPower(4);
        engine.setModel("TH-40");
        engine.setDisplacement(2.0);
        engine.setEngineType(EngineType.ELETRICO);
        return engine;
    }

    @Bean(name = "turboEngine")
    public Engine turboEngine() {
        var engine = new Engine();
        engine.setHorsePower(180);
        engine.setCylinderPower(4);
        engine.setModel("XPTO-01");
        engine.setDisplacement(1.5);
        engine.setEngineType(EngineType.TURBO);
        return engine;
    }



}
