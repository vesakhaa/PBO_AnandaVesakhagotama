package Praktikum09.Tugas;

public class Katak implements BisaLompat {
    public String spesies;
    public int usia;

    @Override
    public void lompat() {
        System.out.println("Katak " + spesies + " sedang melompat!");
    }

    @Override
    public double dapatkanTinggiLompatan() {
        return 1.5;
    }

}
