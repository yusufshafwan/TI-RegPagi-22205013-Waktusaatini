/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class latihan26 {
    public static void main(String[] args) {
        // Mendapatkan waktu saat ini
        LocalDateTime waktuSaatIni = LocalDateTime.now();

        // Mendefinisikan formatter untuk format tertentu
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy HH:mm:ss");

        // Menampilkan waktu sesuai dengan format yang diinginkan
        String waktuFormat = waktuSaatIni.format(formatter);
        System.out.println("Hari ini adalah hari: " + waktuFormat);
    }
    
} 

