package homeworks.HW.HW1;

import HW.HW1.*;

/**
 * Created by eugeniafedorova on 2/12/17.
 */
public class CarTest {

    public static void main(String[] args) {

        Peugeot peugeot = new Peugeot("Peugeot", "407", 2007, 9000, 10.4, "gasoline");
        HW.HW1.Skoda skoda = new HW.HW1.Skoda("Skoda", "Octavia", 2015, 20000, 8);

        peugeot.startTheCar();
        peugeot.ride();
        peugeot.speedTest();
        skoda.startTheCar();
        skoda.ride();
        skoda.speedTest();

        System.out.println(peugeot);
        System.out.println(skoda);

        peugeot.honk();
        skoda.drift();

    }

}
