
package j11;

public class y {
    public static void main(String[] args) {
       String y = "";
       String x = "Operasi";
       
        System.out.println("Isi variable y : "+ y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        System.out.println("Isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("Isi variable z : "+ z);
        System.out.println("Isi x sama dengan z (Case Sensitive) : " + x.equals(z));
        
        String r = "operasi";
        System.out.println("Isi variable r : " + r);
        System.out.println("Isi x sama dengan r (Case Sensitive) : " + x.equals(r));
        System.out.println("Isi x sama dengan r (Not Case Sensitive) : " + x.equalsIgnoreCase(r));

    }
}
