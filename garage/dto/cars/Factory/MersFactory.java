package garage.dto.cars.Factory;

public class MersFactory implements ICarFactory{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getPrice() {
        return 0;
    }


    public void testDrive() {
        System.out.println("Drive mers");

    }
}
