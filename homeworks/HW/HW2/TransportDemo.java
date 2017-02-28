package homeworks.HW.HW2;

import HW.HW1.Peugeot;
import HW.HW1.Tesla;
import HW.HW2.*;

/**
 * Created by eugeniafedorova on 2/22/17.
 */
public class TransportDemo {
    public static void main(String[] args) {

        HW.HW2.Streetcar streetcar = new HW.HW2.Streetcar();
        streetcar.powerSupply = "electricity";
        streetcar.publicTransport = true;

        streetcar.isPublicTransport(streetcar.publicTransport);
        streetcar.drawPower(streetcar.powerSupply);

        Tesla tesla = new Tesla("Tesla", "Model S", 2015, 80000, 4);
        tesla.publicTransport = false;

        tesla.isPublicTransport(tesla.publicTransport);
        tesla.drawPower(tesla.powerSupply);

        Peugeot peugeot = new Peugeot("Peugeot", "407", 2007, 9000, 10.4, "gasoline");
        peugeot.publicTransport = false;

        peugeot.isPublicTransport(peugeot.publicTransport);
        peugeot.drawPower(peugeot.powerSupply);

    }
}
