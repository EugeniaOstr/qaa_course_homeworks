package homeworks.HW2;


/**
 * Created by eugeniafedorova on 2/22/17.
 */
public class Streetcar extends Transport {


    @Override
    public void turnOnAlarm() {
        System.out.println("I'm in the depot");
    }

    @Override
    public void turnOffAlarm() {
        System.out.println("I'm out of the depot");

    }

}
