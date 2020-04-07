package garage.dto.parts.wheels.api;

import garage.dto.parts.api.IParts;

public interface IWheels extends IParts {
    ETypeWheel getType();
    int getRadius();
}
