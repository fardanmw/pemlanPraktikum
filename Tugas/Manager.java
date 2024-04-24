package Tugas;
import java.time.LocalDate;
public class Manager extends Pekerja {
    private String departemen;

    public Manager(String departemen, double gaji, int tahun, int bulan, int tanggal, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
         super(gaji, tahun, bulan, tanggal, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    // Setter dan Getter
    public void setDepartemen(String departemen) { this.departemen = departemen; }
    public String getDepartemen() { return departemen; }
    public double getPendapatan() { return super.getPendapatan() + (0.10 * getGaji()); }
    @Override
    public String toString() {
        return super.toString() + "\nDepartemen: " + departemen;
    }
}
