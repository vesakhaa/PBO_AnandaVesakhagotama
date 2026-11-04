package Praktikum09.Tugas;

public class KarakterMario implements BisaLompat {
    public int jumlahNyawa;
    public String statusPowerUp;

    @Override
    public void lompat() {
        System.out.println("Mario melompat dengan status " + statusPowerUp + "!");
    }

    @Override
    public double dapatkanTinggiLompatan() {
        if (statusPowerUp != null && statusPowerUp.equalsIgnoreCase("Jamur")) {
            return 3.0;
        }
        return 1.5;
    }

}
