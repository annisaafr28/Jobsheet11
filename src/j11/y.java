
package j11;

public class y {
    public static void main(String[] args) {
       String y = "";
       String x = "Operasi";
       String z = "Operasi";
       String r = "operasi";
       String t = "    operasi string    ";
       
       System.out.println("karakter mulai posisi 3 di  variable x : " + x.substring(3));
        
        System.out.println("karakter dari posisi 3-5 di variable x : " + x.substring(3,6));
        
        String tclean = t.trim();
        System.out.println("isi variable tolean : " + t.trim());
        System.out.println("rubah 'i' jadi 'E' di variable tclean : " + tclean.replace("i","E"));
        
        
        
        String[] arrT = tclean.split(" ");
        System.out.println("pecah kata di variable tclean : ");
        for(int i=0;i<arrT.length;i++)
            System.out.println(arrT[i]);
            
        String[] arrTr = tclean.split("r");
        System.out.println("pecah berdasarkan huruf 'r' di variable tclean : ");
        for(int i=0;i<arrTr.length;i++)
            System.out.println(arrTr[i]);
    }
}
