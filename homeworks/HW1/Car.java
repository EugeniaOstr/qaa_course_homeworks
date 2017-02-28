package homeworks.HW1;


import homeworks.HW2.Transport;

/**
 * Created by eugeniafedorova on 2/12/17.
 */
public class Car extends Transport {
    String make;
    String model;
    int year;
    int price;
    double acceleration;

    public Car(String make, String model, int year, int price, double acceleration, String powerSupply) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.acceleration = acceleration;
        this.powerSupply = powerSupply;
    }


    public void startTheCar(){
        System.out.println("Ignition on!");
    }

    public void ride(){
        System.out.println("Go!");
    }

    public void speedTest(){
        System.out.println(make + " acceleration is " + acceleration);
    }

    public String toString() {
        return String.format("The price of %s %s of %d model year is %d dollars",
                make, model, year, price);
    }

    @Override
    public void turnOnAlarm() {
        System.out.println("Alarm is on");
    }

    @Override
    public void turnOffAlarm() {
        System.out.println("Alarm is off");

    }
}
