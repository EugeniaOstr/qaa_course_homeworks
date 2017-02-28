package homeworks.HW3;

import static homeworks.HW3.Delivery.*;
import static homeworks.HW3.DeliveryDuration.*;


/**
 * Created by eugeniafedorova on 2/27/17.
 */
public class DeliveryDurationCalculator {

    public static void main(String[] args) {

        double distance = 3025.5;

   compareDuration(DHL, distance);
   compareDuration(UPS, distance);
   compareDuration(UKRPOST, distance);
    }
}
