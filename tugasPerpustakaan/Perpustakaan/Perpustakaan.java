package Perpustakaan;
import java.util.Scanner;

public class Perpustakaan {
   
        public static void main(String[] args) {
            PusatDataPerpustakaan perpus = new PusatDataPerpustakaan();
    
            Scanner input = new Scanner(System.in);
    
            System.out.println("========================PERPUSTAKAAN FILKOM========================\n");
            System.out.printf("HALO, SELAMAT DATANG DI PERPUSTAKAAN FILKOM: \nTerdapat beberapa jenis buku di perpustakaan ini, yaitu:\n 1. Teknologi\n 2. Filsafat\n 3. Sejarah\n 4. Agama\n 5.  Politik\n 6. FiksI\n \n \nmasukkan nomor buku yang ingin anda cari : ");
    
            int kodeBuku = input.nextInt();
    
            String informasiBuku = perpus.getInformasiBuku(kodeBuku);
            System.out.println(informasiBuku);
        }
    }