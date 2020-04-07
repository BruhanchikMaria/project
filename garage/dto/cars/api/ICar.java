package garage.dto.cars.api;

import garage.Transport.ITransport;
import garage.dto.parts.lock.api.IKey;

public interface ICar extends ITransport {
    /**
     * Получить VIN автомобиля
     * @return
     */
    String getVin();

    /**
     * Наименование производителя
     * @return
     */
    String getName();

    /**
     * Модель автомобиля
     * @return
     */
    String getModel();

    /**
     * Количество колёс автобиля
     * @return
     */
    int getWheelCount();

    void open(IKey key);
    void close(IKey key);

    void start();
    void stop();

    double fillFuel(double value);

    void drive();
    void brake();

}
