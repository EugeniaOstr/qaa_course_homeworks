package HW.HW3;

/**
 * Created by eugeniafedorova on 2/27/17.
 */
public enum Delivery {

    DHL (300),
    FEDEX (500),
    UPS (450),
    TNT (370),
    UKRPOST(1000);

    private final double speed; //km per 1 day

    Delivery(double speed){
        this.speed = speed;
    }

    private double speedOfDelivery() {return speed;}


    public static void compareDuration(Delivery delivery, double distance) {
        int duration;
        duration = (int) (distance/delivery.speedOfDelivery());

        switch (delivery) {
            case DHL: case FEDEX: case UPS: case TNT:
                System.out.println("Duration of delivery by " + delivery + " will be " + duration + " days");
                break;

            case UKRPOST:
            default:
                System.out.println("You'd better choose another option than " + delivery);
                break;
        }
    }
}
