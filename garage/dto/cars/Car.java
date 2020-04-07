package garage.dto.cars;

import garage.dto.parts.engine.Engine;
import garage.dto.parts.engine.api.IEngine;
import garage.dto.parts.lock.api.IKey;
import garage.dto.parts.lock.api.ILock;
import garage.dto.parts.tank.api.IFuelTank;
import garage.dto.parts.wheels.api.IWheels;

public class Car {
    private final String vin;
    private final String name;
    private final String model;
    private final int wheelCount;
    private IEngine engine;
    private IKey key;
    private ILock lock;
    private IFuelTank fuelTank;
    private IWheels wheels;

    public Car(String vin, String name, String model, int wheelCount, IEngine engine, IKey key, ILock lock, IFuelTank fuelTank, IWheels wheels) {
        this.vin = vin;
        this.name = name;
        this.model = model;
        this.wheelCount = wheelCount;
        this.engine = engine;
        this.key = key;
        this.lock = lock;
        this.fuelTank = fuelTank;
        this.wheels = wheels;
    }


    Car(CarBuilder builder){
        this.vin = builder.getVin();
        this.name = builder.getName();
        this.model = builder.getModel();
        this.wheelCount = builder.getWheelCount();
        this.engine = builder.getEngine();
        this.key = builder.getKey();
        this.lock = builder.getLock();
        this.fuelTank = builder.getFuelTank();
        this.wheels = builder.getWheels();
    }


    public double fillFuel(double value) throws RuntimeException {
        if (engine.isWork() == false) {
            getFuelTank().fillFuel(value);
        } else {
            throw new RuntimeException("Вы не можете заправлять заведенную машину");
        }return value;
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
}
