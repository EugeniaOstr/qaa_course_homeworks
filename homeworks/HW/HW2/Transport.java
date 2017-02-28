package homeworks.HW.HW2;

import HW.HW2.*;
import HW.HW2.Guarded;

/**
 * Created by eugeniafedorova on 2/21/17.
 */
public abstract class Transport implements HW.HW2.Powered, Guarded {



    public String powerSupply;

    public void drawPower(String powerSupply) {
        System.out.println("I use " + powerSupply + " to move");
    }

    public boolean publicTransport;

   public void isPublicTransport(boolean publicTransport) {
       if (publicTransport)
           System.out.println("I'm public transport");
       else
           System.out.println("I'm personal transport");
    }


}
