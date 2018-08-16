
package j11;

import java.util.Locale;

public class y {
    public static void main(String[] args) {
       String y = "";
       String x = "Operasi";
       String z = "Operasi";
       String r = "operasi";
       String t = "    operasi string    ";
       
       
        double d = 1545454000;
        System.out.println(String.format("Uang saya %,.4f", d));
        
        System.out.println(String.format(Locale.forLanguageTag("in-ID"), "uang saya Rp %,.2f", d));
    }
}
