package My_Practice_CustomClass;

public class Item_01 {


 String name;
 double unitPrice;
 int quantity;


 public Item_01(String name, double unitPrice, int quantity){
     this.name = name;
     this.unitPrice = unitPrice;
     this.quantity = quantity;
 }

 public double calcCost(){
     return quantity*unitPrice;
 }

 public String toString(){
     return "Item: "+name+", Unit price: $"+unitPrice+", Quantity: "+quantity+
             "\nTotal Cost of Item: $"+calcCost();
 }
}

