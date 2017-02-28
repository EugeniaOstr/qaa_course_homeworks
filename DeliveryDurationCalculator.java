package HW.HW3;

/**
 * Created by eugeniafedorova on 2/27/17.
 */
public class DeliveryDurationCalculator {

    public static void main(String[] args) {

        int distance = 3000;

        Delivery.compareDuration(Delivery.DHL, distance);
        Delivery.compareDuration(Delivery.UPS, distance);
        Delivery.compareDuration(Delivery.UKRPOST, distance);
    }
}
