package garage.dto.parts.engine.api;

import garage.dto.parts.api.IParts;
import garage.dto.parts.engine.exceptions.EngineNotStartedException;

public interface IEngine extends IParts {
    String getVin();
    int getVolume();

    boolean start();
    boolean stop();

    double drive(double energy) throws EngineNotStartedException;


    boolean isWork();
}
