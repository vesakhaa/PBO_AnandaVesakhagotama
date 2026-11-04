package Praktikum09;

public class Main {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.merk = "Samsung";
        tv1.jenisLayar = "OLED";
        tv1.volume = 10;
        tv1.getInfo();

        Kulkas kulkas1 = new Kulkas();
        kulkas1.merk = "LG";
        kulkas1.jumlahPintu = 2;
        kulkas1.getInfo();
    }
}
