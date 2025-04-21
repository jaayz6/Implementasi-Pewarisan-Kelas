public class Main {
    public static void main(String[] args) {
        Manusia a = new Manusia("A", true, "111", true);
        System.out.println(a);

        System.out.println();

        MahasiswaFILKOM b = new MahasiswaFILKOM("165150300111100", 4.0, "B", "111", false, false);
        System.out.println(b);

        System.out.println();

        Pekerja c = new Pekerja(1000, 2016, 3, 4, "C", "111", true, true);
        System.out.println(c);

        System.out.println();

        Manager d = new Manager("HRD", 1000, 2017, 2, 3, "D", "111", true, true);
        System.out.println(d);
    }
}