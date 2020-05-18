package My_Practice_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList_02 {

    public static void main(String[] args) {

        Item_01 list1 = new Item_01("toilet paper", 22, 5);
        Item_01 list2 = new Item_01("coke", 8, 2);
        Item_01 list3 = new Item_01("Milk", 2.5, 2);
        Item_01 list4 = new Item_01("Eggs", 3, 2);
        Item_01 list5 = new Item_01("Yogurt", 4.5, 3);

        //      System.out.println(list1.calcCost());
//        System.out.println(list1);

        ArrayList<Item_01> shoppingList_02 = new ArrayList<>();
        shoppingList_02.addAll(Arrays.asList(list1, list2, list3, list4, list5));
       // System.out.println(shoppingList_02);
       double totalCost = 0;

        for (Item_01 each : shoppingList_02) {
            totalCost +=each.calcCost();


       }
          System.out.println(totalCost);


    }


}
