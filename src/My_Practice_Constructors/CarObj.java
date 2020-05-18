package My_Practice_Constructors;


import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class CarObj {

    public static void main(String[] args) {
        Car car1 = new Car("Rav4", "Red", 2018, 26000);

       // System.out.println(car1);

        Car car2 = new Car("Camry", "Blue", 2020, 1000);
       // System.out.println(car2);

        Car car3 = new Car("TOyota", "White", 2015, 120000);
        //System.out.println(car3);

        Car cars[] = {car1, car2, car3};
        ArrayList<Car> yeni = new ArrayList<>(Arrays.asList(cars));

        yeni.removeIf(p -> p.year !=2020);

        for (Car each : yeni) {
            System.out.println(each);
        }


    }
}
