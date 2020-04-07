package garage.dto.cars.Factory;

import garage.dto.cars.api.ICar;

public class AudiFactory implements ICarFactory {

    @Override
    public String getName() {
        return null ;
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
        System.out.println("Drive audi");

    }
}
