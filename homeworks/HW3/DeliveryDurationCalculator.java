package homeworks.HW3;

/**
 * Created by eugeniafedorova on 2/27/17.
 */
public class DeliveryDurationCalculator {

    public static void main(String[] args) {

        int distance = 3000;

        homeworks.HW3.Delivery.compareDuration(homeworks.HW3.Delivery.DHL, distance);
        homeworks.HW3.Delivery.compareDuration(homeworks.HW3.Delivery.UPS, distance);
        homeworks.HW3.Delivery.compareDuration(homeworks.HW3.Delivery.UKRPOST, distance);
    }
}
