
package j11;

public class y {
    public static void main(String[] args) {
       String y = "";
       String x = "Operasi";
       String z = "Operasi";
       String r = "operasi";
       
       System.out.println("Pada x terdapat huruf 'a' : " + x.contains("a"));
        
        System.out.println("Isi variable x besar semua : " + x.toUpperCase());
        System.out.println("Isi variable x kecil semua : " + x.toLowerCase());
        
        String t = "    operasi string    ";
        System.out.println("Isi variable t : \""+ t +"\"");
        System.out.println("isi variable t tanpa spasi : \""+ t.trim() +"\"");
        
        System.out.println("Gabungkan isi variable x dan r : "+ x.concat(r));

    }
}
