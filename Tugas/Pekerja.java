package Tugas;
import java.time.LocalDate;
import java.time.Period;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal);
        this.jumlahAnak = jumlahAnak;
    }

    // Setter dan Getter
    public void setGaji(double gaji) { this.gaji = gaji; }
    public double getGaji() { return gaji; }
    
    public void setTahunMasuk(LocalDate tahunMasuk) { this.tahunMasuk = tahunMasuk; }
    public LocalDate getTahunMasuk() { return tahunMasuk; }
    
    public void setJumlahAnak(int jumlahAnak) { this.jumlahAnak = jumlahAnak; }
    public int getJumlahAnak() { return jumlahAnak; }

    public double getBonus() {
        int tahunBekerja = Period.between(tahunMasuk, LocalDate.now()).getYears();
        double bonus = 0;
        if (tahunBekerja <= 5) {
            bonus = gaji * 0.05;
        } else if (tahunBekerja <= 10) {
            bonus = gaji * 0.10;
        } else {
            bonus = gaji * 0.15;
        }
        return bonus + (jumlahAnak * 20);
    }

    public double getPendapatan(){
        return super.getPendapatan() + getGaji() + getBonus() + (getJumlahAnak() * 20);
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nTahun Masuk: \n" + tahunMasuk.getYear() + "\nJumlah Anak: " + jumlahAnak + "\nGaji: " + gaji;
    }
}
