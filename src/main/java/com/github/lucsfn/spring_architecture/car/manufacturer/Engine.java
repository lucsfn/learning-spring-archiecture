package com.github.lucsfn.spring_architecture.car.manufacturer;

public class Engine {
    private String model;
    private Integer horsePower;
    private Integer cylinderPower;
    private Double displacement;
    private EngineType engineType;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    public Double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Double displacement) {
        this.displacement = displacement;
    }

    public Integer getCylinderPower() {
        return cylinderPower;
    }

    public void setCylinderPower(Integer cylinderPower) {
        this.cylinderPower = cylinderPower;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", horsePower=" + horsePower +
                ", cylinderPower=" + cylinderPower +
                ", displacement=" + displacement +
                ", engineType=" + engineType +
                '}';
    }
}
