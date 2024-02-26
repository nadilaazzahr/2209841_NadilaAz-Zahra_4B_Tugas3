/*
Menghitung lama dalam jam dan menit berdasarkan selisih waktu dalam menit  
berdasarkan jam mulai (jam,menit) dan jam selesai (jam menit) yang diinput.
*/

package latihan;

import java.util.Scanner;

public class No3 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            
            //Meminta input waktu mulai
            System.out.println("Masukkan waktu mulai (jam dan menit): ");
            System.out.print("Jam: ");
            int jamMulai = scanner.nextInt();
            System.out.print("Menit: ");
            int menitMulai = scanner.nextInt();
            
            //Meminta input waktu selesai
            System.out.println("Masukkan waktu selesai (jam dan menit): ");
            System.out.print("Jam: ");
            int jamSelesai = scanner.nextInt();
            System.out.print("Menit: ");
            int menitSelesai = scanner.nextInt();
            
            //Menghitung total menit dari waktu mulai ke waktu selesai
            int totalMenitMulai = jamMulai * 60 + menitMulai;
            int totalMenitSelesai = jamSelesai * 60 + menitSelesai;
            int selisihMenit = totalMenitSelesai - totalMenitMulai;
            
            //Menghitung lama dalam jam dan menit
            int lamaJam = selisihMenit / 60;
            int lamaMenit = selisihMenit % 60;
            
            //Menampilkan hasil 
            if (selisihMenit >= 0) {
                System.out.println("Lama: " + lamaJam + " jam " + lamaMenit + " menit ");
            } else {
                System.out.println("Waktu selesai tidak valid.");
            }
            
        }
    }
    
}
