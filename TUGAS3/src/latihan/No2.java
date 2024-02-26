/*
Buatlah algoritma dalam bahasa Java, berupa menu yang dapat memasukan pilihan 
jika  menginputkan karakter operator aritmatika ‘+’ akan melakukan penjumlahan, 
jika ‘-‘  pengurangan sampai karakter ‘*’, ‘/’ dan ‘%’ dua bilangan integer. 
Contoh Masukan 
Masukan bilangan pertama : 3 
Masukan bilangan kedua : 2 
Masukan operator aritmatika : + 
Contoh Keluaran 
Hasil penjumlahan 3 dan 2 adalah : 5 

*/

package latihan;

import java.util.Scanner;

public class No2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            int bilangan1, bilangan2;
            char operator;
        
            //Meminta input bilangan pertama
            System.out.print("Masukkan bilangan pertama: ");
            bilangan1 = scanner.nextInt();

            //Meminta input bilangan kedua
            System.out.print("Masukkan bilangan kedua: ");
            bilangan2 = scanner.nextInt();

            //Meminta input operator aritmatika
            System.out.print("Masukkan operator aritmatika (+, -, *, /, %): ");
            operator = scanner.next().charAt(0);

            //Menampilkan hasil operasi aritmatika sesuai operator yang dimasukkan
            switch (operator) {
                case '+' -> System.out.println("Hasil penjumlahan " + bilangan1 + " dan " + bilangan2 + " adalah: " + (bilangan1 + bilangan2));
                case '-' -> System.out.println("Hasil pengurangan " + bilangan1 + " dan " + bilangan2 + " adalah: " + (bilangan1 - bilangan2));
                case '*' -> System.out.println(" Hasil perkalian " + bilangan1 + " dan " + bilangan2 + " adalah " + (bilangan1 * bilangan2));
                case '/' -> System.out.println("Hasil bagi " + bilangan1 + " dan " + bilangan2 + " adalah " + (bilangan1 / bilangan2));
                case '%' -> System.out.println("Sisa bagi " + bilangan1 + " dan " + bilangan2 + " adalah " + (bilangan1 % bilangan2));
                default -> System.out.println("Operator yang dimasukkan tidak valid.");
            }
        }
    }   
}
