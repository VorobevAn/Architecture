package Classes;

import java.awt.*;

//Общий класс автомобилей
public abstract class Car {
    private String make;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuel;
    private TypeGearbox gearbox;
    private float engineCap;

    public Car() {
        this.make = make;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.fuel = fuel;
        this.gearbox = gearbox;
        this.engineCap = engineCap;
    }
//    Конструктор
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuel() {
        return fuel;
    }

    public void setFuel(TypeFuel fuel) {
        this.fuel = fuel;
    }

    public TypeGearbox getGearbox() {
        return gearbox;
    }

    public void setGearbox(TypeGearbox gearbox) {
        this.gearbox = gearbox;
    }

    public float getEngineCap() {
        return engineCap;
    }

    public void setEngineCap(float engineCap) {
        this.engineCap = engineCap;
    }
//    Общие методы для классов автомобили
    public void movement(){}
    public void maintenance(){}

    public abstract int gearShift(int gear);
    public boolean turnLights() {
        return true;
    }
    public boolean trnWprs() {
        return true;
    }

}
