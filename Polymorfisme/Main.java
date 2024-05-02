public class Main {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan 20 kue
        Kue[] daftarKue = new Kue[20];
        
        // Mengisi array dengan objek KuePesanan dan KueJadi
        daftarKue[0] = new KuePesanan("Lapis Surabaya", 35000.0, 1.5);
        daftarKue[1] = new KuePesanan("Martabak Manis", 20000.0, 2);
        daftarKue[2] = new KuePesanan("Kue Lumpur", 18000.0, 1.8);
        daftarKue[3] = new KuePesanan("Putu Ayu", 12000.0, 1);
        daftarKue[4] = new KuePesanan("Kastengel", 15000.0, 1.2);
        daftarKue[5] = new KuePesanan("Serabi Bandung", 20000.0, 1.5);
        daftarKue[6] = new KuePesanan("Bolu Pandan", 18000.0, 1.8);
        daftarKue[7] = new KuePesanan("Lapis Malang", 30000.0, 1.5);
        daftarKue[8] = new KuePesanan("Rainbow Cake", 50000.0, 2);
        daftarKue[9] = new KuePesanan("Klepon Keju", 18000.0, 1);
        daftarKue[10] = new KueJadi("Pastel Tutup", 8000.0, 25);
        daftarKue[11] = new KueJadi("Ronde Jahe", 15000.0, 20);
        daftarKue[12] = new KueJadi("Lemper Ayam", 12000.0, 35);
        daftarKue[13] = new KueJadi("Sus Keju", 10000.0, 40);
        daftarKue[14] = new KueJadi("Kue Mangkok", 12000.0, 30);
        daftarKue[15] = new KueJadi("Putu Mayang", 15000.0, 25);
        daftarKue[16] = new KueJadi("Pukis Pandan", 12000.0, 35);
        daftarKue[17] = new KueJadi("Nagasari", 10000.0, 40);
        daftarKue[18] = new KueJadi("Martabak Telor", 20000.0, 15);
        daftarKue[19] = new KueJadi("Wajik Ketan", 18000.0, 30);
        
        // Tampilkan daftar kue
        System.out.println("Daftar Kue:");
        for (Kue kue : daftarKue) {
            System.out.println(kue);
            System.out.println();
        }
        
        // Hitung total harga semua jenis kue
        double totalHarga = hitungTotalHarga(daftarKue);
        System.out.println("Total Harga: " + totalHarga);
        System.out.println("======================");
        
        // Hitung total harga dan total berat dari KuePesanan
        double totalHargaPesanan = hitungTotalHargaKuePesanan(daftarKue);
        double totalBeratPesanan = hitungTotalBeratKuePesanan(daftarKue);
        System.out.println("Total Harga Kue Pesanan: " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBeratPesanan);
        System.out.println("======================");
        
        // Hitung total harga dan total jumlah dari KueJadi
        double totalHargaJadi = hitungTotalHargaKueJadi(daftarKue);
        double totalJumlahJadi = hitungTotalJumlahKueJadi(daftarKue);
        System.out.println("Total Harga Kue Jadi: " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlahJadi);
        System.out.println("======================");
        
        // Cari dan tampilkan informasi kue dengan harga terbesar
        Kue kueTerbesar = cariKueDenganHargaTertinggi(daftarKue);
        if (kueTerbesar != null) {
            System.out.println("Kue dengan harga terbesar: " + kueTerbesar);
        }
    }
    
    // Method untuk menghitung total harga semua jenis kue
    public static double hitungTotalHarga(Kue[] kueArray) {
        double totalHarga = 0;
        for (Kue kue : kueArray) {
            if (kue != null) {
                totalHarga += kue.hitungHarga();
            }
        }
        return totalHarga;
    }
    
    // Method untuk menghitung total harga kue pesanan
    public static double hitungTotalHargaKuePesanan(Kue[] kueArray) {
        double totalHargaPesanan = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalHargaPesanan += kue.hitungHarga();
            }
        }
        return totalHargaPesanan;
    }
    
    // Method untuk menghitung total berat kue pesanan
    public static double hitungTotalBeratKuePesanan(Kue[] kueArray) {
        double totalBeratPesanan = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KuePesanan) {
                totalBeratPesanan += ((KuePesanan) kue).berat;
            }
        }
        return totalBeratPesanan;
    }
    
    // Method untuk menghitung total harga kue jadi
    public static double hitungTotalHargaKueJadi(Kue[] kueArray) {
        double totalHargaJadi = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalHargaJadi += kue.hitungHarga();
            }
        }
        return totalHargaJadi;
    }
    
    // Method untuk menghitung total jumlah kue jadi
    public static double hitungTotalJumlahKueJadi(Kue[] kueArray) {
        double totalJumlahJadi = 0;
        for (Kue kue : kueArray) {
            if (kue instanceof KueJadi) {
                totalJumlahJadi += ((KueJadi) kue).jumlah;
            }
        }
        return totalJumlahJadi;
    }
    
    // Method untuk mencari kue dengan harga tertinggi
    public static Kue cariKueDenganHargaTertinggi(Kue[] kueArray) {
        double maxHarga = 0;
        Kue kueTerbesar = null;
        for (Kue kue : kueArray) {
            if (kue != null && kue.hitungHarga() > maxHarga) {
                maxHarga = kue.hitungHarga();
                kueTerbesar = kue;
            }
        }
        return kueTerbesar;
    }
}
