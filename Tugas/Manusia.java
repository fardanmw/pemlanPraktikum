package Tugas;

public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;
    
    public Manusia() {

    }
   
    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        // super(nama, nik, jenisKelamin, menikah);
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    // Setter dan Getter
    public void setNama(String nama) { this.nama = nama; }
    public String getNama() { return nama; }
   
    public void setJenisKelamin(boolean jenisKelamin) { this.jenisKelamin = jenisKelamin; }
    public boolean getJenisKelamin() { return jenisKelamin; }
   
    public void setNik(String nik) { this.nik = nik; }
    public String getNik() { return nik; }
   
    public void setMenikah(boolean menikah) { this.menikah = menikah; }
    public boolean getMenikah() { return menikah; }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25 : 20;
        } else {
            return 15;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    @Override
    public String toString() {
        return "Nama: " + nama + "\nNIK: " + nik + "\nJenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "\nMenikah: " + (menikah ? "Ya" : "Tidak") + "\nPendapatan: " + getPendapatan();
    }
}
