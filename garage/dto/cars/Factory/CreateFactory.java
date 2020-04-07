package garage.dto.cars.Factory;

public class CreateFactory {
    /**
     * Лучше паттерн строитель использовать когда имеется много общих параметров для объектов(которые записываются в одну переменную), и требуется внести дополнения или изменения других параметров.
     * Паттерн фабрика используется когда необходимо дополнить или изменить код новыми или другими "продуктами".
     * @param nameOfCar
     * @return
     */

    public static ICarFactory create(String nameOfCar){
        switch (nameOfCar){
            case"Audi":return new AudiFactory();
            case "Mers": return new MersFactory();
            default: return null;

        }

    }
}
