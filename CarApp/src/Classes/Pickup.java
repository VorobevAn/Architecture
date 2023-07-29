package Classes;

import java.awt.*;

// Общий класс для пикапов
public class Pickup extends Car implements iRefueling {
    @Override
    public void fuel() {

    }

    private int loadCapacity;
    public Pickup(String make,
                  String model,
                  Color color,
                  TypeCar bodyType,
                  int numberWheels,
                  TypeFuel fuel,
                  TypeGearbox gearbox,
                  float engineCap,
                  int loadCapacity) {
        super();
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int gearShift(int gear) {
        return 0;
    }
}
