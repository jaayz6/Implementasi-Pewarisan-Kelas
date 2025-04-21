// MahasiswaFILKOM.java
public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, jenisKelamin, nik, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    public double getBeasiswa() {
        if (ipk >= 3.0 && ipk < 3.5) return 50;
        else if (ipk >= 3.5 && ipk <= 4.0) return 75;
        return 0;
    }

    public String getStatus() {
        String prodi = switch (nim.charAt(6)) {
            case '2' -> "Teknik Informatika";
            case '3' -> "Teknik Komputer";
            case '4' -> "Sistem Informasi";
            case '6' -> "Pendidikan Teknologi Informasi";
            case '7' -> "Teknologi Informasi";
            default -> "Prodi tidak dikenal";
        };
        String angkatan = "20" + nim.substring(0, 2);
        return prodi + ", " + angkatan;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        return "nama           : " + getNama() + "\n" +
               "nik            : " + getNik() + "\n" +
               "jenisKelamin   : " + (isJenisKelamin() ? "Laki-laki" : "Perempuan") + "\n" +
               String.format("pendapatan     : %.1f\n", getPendapatan()) +
               "nim            : " + nim + "\n" +
               String.format("ipk            : %.1f\n", ipk) +
               "status         : " + getStatus();
    }
}
