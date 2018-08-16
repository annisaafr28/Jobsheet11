
package j11;

import java.util.Locale;
import java.util.Scanner;

public class y {
    
       private static String tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        
        return kalimat;
       }
        
    public static void main(String[] args) {
        String identitas = "nama lengkap / kelas / no";
        String kalimat = tampilInput();
        
        
    }
        
    
    }    
    

