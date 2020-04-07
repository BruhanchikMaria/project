package garage.Transport;

public interface ITransport {
    String getName();
    String getModel();
    void start();
    void stop();
    void drive();
    void brake();
}
