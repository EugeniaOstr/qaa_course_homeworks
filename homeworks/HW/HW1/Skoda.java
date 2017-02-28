package homeworks.HW.HW1;

import HW.HW1.*;

/**
 * Created by eugeniafedorova on 2/12/17.
 */
public class Skoda extends HW.HW1.Car {

    public Skoda(String make, String model, int year, int price, double acceleration){
        super(make, model, year, price, acceleration, "gasoline");
    }

    public void drift (){
        System.out.println("Wroom! Wroom!");
    }
}
