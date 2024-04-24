package Tugas;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Testcase untuk Manusia
        System.out.println("\n=============\n" + "Kelas Manusia" + "\n=============");
        Manusia manusia1 = new Manusia("Budi", "1234567890123456", false, false);
        System.out.println(manusia1);
        Manusia manusia2= new Manusia("Siti", "2345678901234567", false, true);
        System.out.println(manusia2);
        Manusia manusia3 = new Manusia("Ani","3456789012345678", false, true);
        System.out.println(manusia3);

        // Testcase untuk MahasiswaFILKOM
        System.out.println("\n=============\n" + "Kelas MahasiswaFILKOM" + "\n=============");
        MahasiswaFILKOM mahasiswaFILKOM1 = new MahasiswaFILKOM("235150401111042",2.76 , "ucul", "073", false, false);
        System.out.println(mahasiswaFILKOM1);
        MahasiswaFILKOM mahasiswaFILKOM2 = new MahasiswaFILKOM("235150401111042",3.48 , "ucul", "073", false, false);
        System.out.println(mahasiswaFILKOM2);
        MahasiswaFILKOM mahasiswaFILKOM3 = new MahasiswaFILKOM("235150401111042",3.78 , "ucul", "073", false, false);
        System.out.println(mahasiswaFILKOM3);

        // Testcase untuk Pekerja
        System.out.println("\n=============\n" + "Kelas Pekerja" + "\n=============");
        Pekerja pekerja1 = new Pekerja(100, 2019, 1, 1, 1, "Budi", "352", true, true);
        System.out.println(pekerja1);
        Pekerja pekerja2 = new Pekerja(500, 2017, 2, 2, 2, "Yanto", "765", true, true);
        System.out.println(pekerja2);
        Pekerja pekerja3 = new Pekerja(800, 2023, 3, 3, 8, "Hanum", "323", false, true);
        System.out.println(pekerja3);

     
        // Testcase untuk Manager
        System.out.println("\n=============\n" + "Kelas Manager" + "\n=============");
        Manager manager = new Manager("HRD", 7500, 2009, 1, 1, 0, "Lucas", "888", true, false);
        System.out.println(manager);
    }
}
