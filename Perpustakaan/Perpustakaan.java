package Perpustakaan;
import java.util.Scanner;

public class Perpustakaan {
   
        public static void main(String[] args) {
            PusatDataPerpustakaan perpus = new PusatDataPerpustakaan();
    
            Scanner input = new Scanner(System.in);
            int kodeBuku;
            do{

            System.out.println("========================PERPUSTAKAAN FILKOM========================\n");
            System.out.printf("HALO, SELAMAT DATANG DI PERPUSTAKAAN FILKOM: \nTerdapat beberapa jenis buku di perpustakaan ini, yaitu:\n 1. Teknologi\n 2. Filsafat\n 3. Sejarah\n 4. Agama\n 5. Politik\n 6. Fiksi\n 7. psikologi \n 8.keluar dari perpustakaan  \n \nmasukkan nomor buku yang ingin anda cari : ");
            kodeBuku = input.nextInt();
            if (kodeBuku != 8) {
                String infoBuku = perpus.getInformasiBuku(kodeBuku);
                System.out.println(infoBuku);
            }
            else{
                System.out.println("Terima kasih telah menggunakan layanan Perpustakaan kami");
            }
        
        }while (kodeBuku !=8);
         }
}
