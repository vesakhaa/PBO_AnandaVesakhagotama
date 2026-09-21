
import java.time.LocalDate;

public class RumahSakitDemo {

    public static void main(String[] args) {
        Pegawai ani = new Pegawai("dr. ani", "1234");
        Pegawai bagus = new Pegawai("dr. Bagus", "4567");
        Pegawai desi = new Pegawai("Ns. Desi", "1234");
        Pegawai eka = new Pegawai("Ns. Eka", "4567");

        Pasien pasien1 = new Pasien("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);
        System.out.println(pasien1.getInfo());

        Pasien pasien2 = new Pasien("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }
}
