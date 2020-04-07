package garage.Transport.TypesOfTransport;

import garage.Transport.ITransport;

public interface IBike extends ITransport {
    String getWheels();
    int tireSize();
}
