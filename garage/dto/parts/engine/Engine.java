package garage.dto.parts.engine;

import garage.dto.parts.engine.api.IEngine;
import garage.dto.parts.engine.exceptions.EngineNotStartedException;

public class Engine implements IEngine {
    private final String vin;
    private final int volume;
    private boolean work = false;


    public Engine(String vin, int volume, boolean work) {
        this.vin = vin;
        this.volume = volume;
        this.work = work;
    }

    public boolean isWork() {
        return this.work;
    }


    @Override
    public String getVin() {
        return vin;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public boolean start() {
        if(!work){
            work = true;

        }
        return work;
    }

    @Override
    public boolean stop() {
        if(work){
            work = false;
        }
        return !work;
    }

    @Override
    public double drive(double energy) throws EngineNotStartedException {
        if(!work){
            throw new EngineNotStartedException("Заведите машину");
        }
        return energy * 0.4;
    }
}
