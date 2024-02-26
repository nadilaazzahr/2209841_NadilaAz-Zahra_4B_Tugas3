/*
Buatlah algoritma dalam bahasa Java, menerima masukan berupa sebuah bilangan ril,
periksa apakah angka didepan koma dan angka dibelakang koma adalah kelipatan 3  
(angka dibelakang koma pasti 2 angka). 
*/

package latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

public class No1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Menerima masukan berupa bilangan rill
        System.out.print("Masukkan sebuah bilangan rill: ");
        double bilangan = scanner.nextDouble();
        
        scanner.close();
        
        //Membuat format untuk bilangan desimal 2 angka di belakang koma
        DecimalFormat df = new DecimalFormat("#.##");
        
        //Memisahkan bagian sebelum dan setelah koma
        int bagianSebelumKoma = (int) bilangan;
        double bagianSetelahKoma = Double.parseDouble(df.format(bilangan - bagianSebelumKoma));
        
        //Memeriksa apakah bagian sebelum koma dan setelah koma adalah kelipatan 3
        boolean kelipatanTigaSebelumKoma = bagianSebelumKoma % 3 == 0;
        boolean kelipatanTigaSetelahKoma = (int) (bagianSetelahKoma * 100) % 3 == 0; //Mengubah bagianSetelahKoma menjadi integer untuk menghilangkan koma
        
        //Menampilkan hasil
        if (kelipatanTigaSebelumKoma && kelipatanTigaSetelahKoma) {
            System.out.println("Angka sebelumn koma dan setelah koma adalah kelipatan 3.");
        } else if (kelipatanTigaSebelumKoma && !kelipatanTigaSetelahKoma) {
            System.out.println("Angka sebelum koma adalah kelipatan 3 dan angka setelah koma bukan kelipatan 3.");
        } else if (!kelipatanTigaSebelumKoma && kelipatanTigaSetelahKoma) {
            System.out.println("Angka sebelum koma bukan kelipatan 3 dan angka setelah koma adalah kelipatan 3.");
        } else {
            System.out.println("Angka sebelum koma dan setelah koma bukan kelipatan 3.");
        }
        
        scanner.close();
    }     
    
}
