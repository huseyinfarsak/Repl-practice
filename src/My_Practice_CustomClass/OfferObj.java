package My_Practice_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class OfferObj {

    public static void main(String[] args) {

        offer Offer1 = new offer();
        Offer1.setOfferInfo("Austin","Dell",120.200,true);

        offer Offer2 = new offer();
        Offer2.setOfferInfo("Dallas","Toyota",110.500,true);

        offer Offer3 = new offer();
        Offer3.setOfferInfo("Houston","Getco",70.700,false);

        offer offers [] = {Offer1,Offer2,Offer3};

        ArrayList<offer> accept = new ArrayList<>(Arrays.asList(offers));

       // accept.removeIf(p->p.isFullTime != true);
        accept.removeIf(p->p.location != "Austin");

        System.out.println(accept.size());

        for( offer each:accept){
            System.out.println(each);
        }

    }
}
