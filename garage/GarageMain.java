package garage;

import garage.dto.parts.lock.CopyKey;
import garage.dto.parts.lock.DefaultKey;
import garage.dto.parts.lock.Lock;
import garage.dto.parts.lock.api.IKey;
import garage.dto.parts.lock.api.ILock;
import garage.dto.parts.wheels.R17WinterWheels;
import garage.dto.parts.wheels.Wheels;
import garage.dto.parts.wheels.WinterWheels;
import garage.dto.parts.wheels.api.ETypeWheel;
import garage.dto.parts.wheels.api.IWheels;

public class GarageMain {
    public static void main(String[] args) {
        ILock lock = new Lock("asdas");
        IKey key = new DefaultKey("asdas");
        IKey key2 = new CopyKey();

        boolean open = lock.open(key2);
        System.out.println("Открылось? :" + open);

        IWheels wheels = new R17WinterWheels();
        IWheels wheels2 = new Wheels(19, ETypeWheel.ВСЕСЕЗОННЫЙ);

        System.out.println("Радиус :" + wheels.getRadius());
        System.out.println("Тип :" + wheels.getType());

    }
}
