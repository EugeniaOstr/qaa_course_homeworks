package homeworks.HW.HW3;

import HW.HW3.*;

/**
 * Created by eugeniafedorova on 2/27/17.
 */
public class DeliveryDurationCalculator {

    public static void main(String[] args) {

        int distance = 3000;

        HW.HW3.Delivery.compareDuration(HW.HW3.Delivery.DHL, distance);
        HW.HW3.Delivery.compareDuration(HW.HW3.Delivery.UPS, distance);
        HW.HW3.Delivery.compareDuration(HW.HW3.Delivery.UKRPOST, distance);
    }
}
