package homeworks.HW3;

/**
 * Created by eugeniafedorova on 2/27/17.
 */
public enum Delivery {

    DHL (300),
    FEDEX (500),
    UPS (450),
    TNT (370),
    UKRPOST(1000);

    int speed; //km per 1 day

    Delivery(int speed){
        this.speed = speed;
    }

    int speedOfDelivery() {return speed;}

    int getDeliveryDuration(double distance){
        return (int) distance/this.speedOfDelivery();
    }

}

