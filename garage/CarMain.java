package garage;

import garage.dto.cars.Car;
import garage.dto.cars.CarBuilder;
import garage.dto.parts.engine.Engine;
import garage.dto.parts.engine.api.IEngine;
import garage.dto.parts.engine.exceptions.EngineNotStartedException;
import garage.dto.parts.lock.DefaultKey;
import garage.dto.parts.lock.Lock;
import garage.dto.parts.lock.api.IKey;
import garage.dto.parts.lock.api.ILock;
import garage.dto.parts.lock.exceptions.KeyIsWrongException;
import garage.dto.parts.tank.Tank;
import garage.dto.parts.wheels.Wheels;
import garage.dto.parts.wheels.api.ETypeWheel;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        CarBuilder geelyBuilder=new CarBuilder()
                .name("Geely")
                .model("Atlas")
                .wheelCount(5)
                .vin("VIN56265626596")
                .fuelTank(new Tank(65))
                .wheels(new Wheels(17,ETypeWheel.ВСЕСЕЗОННЫЙ));
                Car geely=geelyBuilder.build();


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ключ : ");
        String secretKey = scan.nextLine();
        DefaultKey myKey = new DefaultKey(secretKey);

        System.out.println("Введите замок : ");
        String keyOfLock = scan.nextLine();
        ILock myLock = new Lock(keyOfLock);
        if (myLock.open(myKey)) {
            System.out.println("Машина открыта");
        } else {
            try {
                throw new KeyIsWrongException("Ошибка! Неверный ключ");
            } catch (KeyIsWrongException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        Engine engine=new Engine("VIN564589547",65,geely.getEngine().isWork());
        System.out.println("Состояние бака:"+geely.getFuelTank().getFuelLevel());
        geely.getEngine().start();
        if (engine.start()) {
            System.out.println("Машина готова к движению");
        } else {
            try {
                engine.drive(40);
            } catch (EngineNotStartedException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        geely.getEngine().stop();
}}
