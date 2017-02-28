package homeworks.HW3;
import homeworks.HW3.Delivery.*;

/**
 * Created by efedorova on 2/28/2017.
 */
public class DeliveryDuration {
    public static void compareDuration(Delivery delivery, double distance) {

        switch (delivery) {
            case DHL:
            case FEDEX:
            case UPS:
            case TNT:
                System.out.println("Duration of delivery by " + delivery + " will be approximately " + delivery.getDeliveryDuration(distance) + " days");
                break;

            case UKRPOST:
            default:
                System.out.println("You'd better choose another option than " + delivery);
                break;
        }
    }
}
