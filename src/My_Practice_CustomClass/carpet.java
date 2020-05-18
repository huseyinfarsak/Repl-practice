package My_Practice_CustomClass;

public class carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;

  public double calCost(){
      double total = (width+length)*unitPrice;
      if(isPersian){
          return total+200;
      }else{
          return total;
      }
  }

      public void hali (double width, double length, double unitPrice, boolean isPersian){
   this.width = width;
   this.length = length;
   this.unitPrice= unitPrice;
   this.isPersian=isPersian;

      }

      public String toString(){

      return "Width is: "+width+" Length is: "+length+" Unit Price is: $"+unitPrice+"Total Price: $";
  }
}
