
package j11;

public class y {
    public static void main(String[] args) {
       String y = "";
       String x = "Operasi";
       String z = "Operasi";
       String r = "operasi";
       
        System.out.println("Perbandingan isi x dengan y : " + x.compareTo(y));
        System.out.println("Perbandingan isi x dengan z (Case Sensitive): " + x.compareTo(z));
        System.out.println("Perbandingan isi x dengan r (Case Sensitive): " + x.compareTo(r));
        System.out.println("Perbandingan isi x dengan r (Not Case Sensitive): " + x.compareToIgnoreCase(r));
        
        String s = "operasI";
        System.out.println("Perbandingan isi r dengan s (Case Sensitive) : " + r.compareTo(s));

    }
}
