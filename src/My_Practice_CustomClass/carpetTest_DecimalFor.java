package My_Practice_CustomClass;


import java.text.DecimalFormat;

public class carpetTest_DecimalFor {

    public static void main(String[] args) {
         DecimalFormat df = new DecimalFormat(" .00");
        carpet customer1 = new carpet();
        customer1.hali(2.3,4.3,300.4,true);

        carpet customer2 = new carpet();
        customer2.hali(2.3,4.3,300.4,false);


       // System.out.println(dtg.applyLocalizedPattern(customer1.calCost());
        System.out.println(df.format(customer2.calCost()));



    }
}
