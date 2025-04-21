// Pekerja.java
import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji, int tahun, int bulan, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, jenisKelamin, nik, menikah);
        this.gaji = gaji;
        this.tahunMasuk = LocalDate.of(tahun, bulan, 1);
        this.jumlahAnak = jumlahAnak;
    }

    public double getBonus() {
        int lama = LocalDate.now().getYear() - tahunMasuk.getYear();
        if (lama <= 5) return gaji * 0.05;
        else if (lama <= 10) return gaji * 0.1;
        else return gaji * 0.15;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + gaji + getBonus() + (jumlahAnak * 20);
    }

    public double getGaji() {
        return gaji;
    }

    @Override
    public String toString() {
        return "nama           : " + getNama() + "\n" +
               "nik            : " + getNik() + "\n" +
               "jenisKelamin   : " + (isJenisKelamin() ? "Laki-laki" : "Perempuan") + "\n" +
               String.format("pendapatan     : %.1f\n", getPendapatan()) +
               "tahun masuk    : " + tahunMasuk.getMonthValue() + " " + tahunMasuk.getYear() + "\n" +
               "jumlah anak    : " + jumlahAnak + "\n" +
               String.format("gaji           : %.1f", gaji);
    }
}