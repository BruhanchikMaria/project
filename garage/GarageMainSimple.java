package garage;

import garage.dto.cars.Car;
import garage.dto.cars.CarBuilder;

public class GarageMainSimple {

    public static void main(String[] args) {
        Car mercedes = new Car("ASasdasd", "Mers",
                "GLE", 999);
        Car mercedes1 = new Car("ASasdasd", "Mers",
                "GLE", 999);
        Car mercedes2 = new Car("ASasdasd", "Mers",
                "GLE", 999);
        Car mercedes3 = new Car("ASasdasd", "Mers",
                "GLE", 999);


        CarBuilder bmwBuilder = new CarBuilder()
                .model("7")
                .name("BMW");
        Car bmw = bmwBuilder.vin("asdas").build();
        Car bmw1 = bmwBuilder.vin("asdas").build();
        Car bmw2 = bmwBuilder.vin("asdas").build();
        Car bmw3 = bmwBuilder.vin("asdas").build();
        Car bmw4 = bmwBuilder.build();
        Car bmw5 = bmwBuilder.build();
    }
}
