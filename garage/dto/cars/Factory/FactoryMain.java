package garage.dto.cars.Factory;

public class FactoryMain {
    public static void main(String[] args) {
        CreateFactory factory=new CreateFactory();
        ICarFactory car=CreateFactory.create("Mers");
        car.testDrive();
        ICarFactory car2=CreateFactory.create("Audi");
        car2.testDrive();


    }
}
