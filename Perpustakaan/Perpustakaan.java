package Perpustakaan;
import java.util.Scanner;
public class Perpustakaan {

    private String judul;
    private String penulis;
    private int jumlahHalaman;
    private String sinopsis;

    public Perpustakaan(String judul, String penulis, int jumlahHalaman, String sinopsis){
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
        this.sinopsis = sinopsis;
    }
   
    public int hitungJumlahKataSinopsis() {
        String[]JumlahKata = sinopsis.split(" ");
        return JumlahKata.length;
    }
        
     public void displayInfo(){
            System.out.println("1. Judul buku               : " +judul);
            System.out.println("2. Penulis                  : " + penulis);
            System.out.println("3. Jumlah Halaman           : " + jumlahHalaman);
            System.out.println("4. Sinopsis                 : " + sinopsis);
            System.out.println("5.  Jumlah kata di sinopsis : " + hitungJumlahKataSinopsis());
    
        }
        public static void main(String[] args) {
            PusatDataPerpustakaan perpus = new PusatDataPerpustakaan();
    
            Scanner input = new Scanner(System.in);
            int kodeBuku;
        }

            public void kategori(Perpustakaan[] bukuArray){
                int i = 0;
                for (Perpustakaan buku : bukuArray) {
                    i++;
                    if (i <= bukuArray.length) 
                        System.out.println("buku ke-" + i);
                    buku.displayInfo();
                }
            }
        }
