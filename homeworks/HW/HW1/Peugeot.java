package homeworks.HW.HW1;

import HW.HW1.*;

/**
 * Created by eugeniafedorova on 2/12/17.
 */
public class Peugeot extends HW.HW1.Car {

    public Peugeot(String make, String model, int year, int price, double acceleration, String powerSupply){
        super(make, model, year, price, acceleration, powerSupply);
    }

    public void honk (){
        System.out.println("Beep! Beep!");
    }

}
