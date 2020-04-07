package garage.dto.cars;

import garage.dto.parts.engine.api.IEngine;
import garage.dto.parts.lock.api.IKey;
import garage.dto.parts.lock.api.ILock;
import garage.dto.parts.tank.api.IFuelTank;
import garage.dto.parts.wheels.api.IWheels;

public class CarBuilder {
    private String vin = "ASD0123KNS";
    private String name = "Mercedes";
    private String model = "GLE";
    private int wheelCount = 4;
    private IEngine engine;
    private IKey key;
    private ILock lock;
    private IFuelTank fuelTank;
    private IWheels wheels;

    public CarBuilder vin(String vin){
        this.vin = vin;
        return this;
    }

    public CarBuilder name(String name){
        this.name = name;
        return this;
    }

    public CarBuilder model(String model){
        this.model = model;
        return this;
    }

    public CarBuilder wheelCount(int wheelCount){
        this.wheelCount = wheelCount;
        return this;
    }
    public CarBuilder engine(IEngine engine){
        this.engine = engine;
        return this;
    }

    public CarBuilder key(IKey key){
        this.key = key;
        return this;
    }

    public CarBuilder lock(ILock lock){
        this.lock = lock;
        return this;
    }
    public CarBuilder fuelTank(IFuelTank fuelTank){
        this.fuelTank = fuelTank;
        return this;
    }
    public CarBuilder wheels(IWheels wheels){
        this.wheels = wheels;
        return this;
    }

    public String getVin() {
        return vin;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public IEngine getEngine() {
        return engine;
    }

    public IKey getKey() {
        return key;
    }

    public ILock getLock() {
        return lock;
    }

    public IFuelTank getFuelTank() {
        return fuelTank;
    }

    public IWheels getWheels() {
        return wheels;
    }

    public Car build(){
        return new Car(this);
    }

    }
