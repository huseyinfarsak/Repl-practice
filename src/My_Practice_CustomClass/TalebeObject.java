package My_Practice_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class TalebeObject {

    public static void main(String[] args) {

        Talebe ogrenci1 = new Talebe();
        ogrenci1.setStudent("Ali","Turkish",36,3.8,'M',true);

        Talebe ogrenci2 = new Talebe();
        ogrenci2.setStudent("Huseyin","Turkish",35,3.2,'M',true);

        Talebe ogrenci3 = new Talebe();
        ogrenci3.setStudent("Muhsin","Tayvan",23,3.0,'M',false);

        Talebe [] talebes= {ogrenci1,ogrenci2,ogrenci3};

        ArrayList<Talebe> married1 = new ArrayList<>(Arrays.asList(talebes));

        married1.removeIf(p ->p.married != true);

        System.out.println(married1);
    }
}
