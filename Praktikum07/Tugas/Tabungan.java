public class Tabungan extends Rekening {
    public double BiayaAdmin;

    public Tabungan() {
        super();
    }

    public Tabungan(String noRekening, String namaPemilik, double saldo, double bunga, double biayaAdmin) {
        super(noRekening, namaPemilik, saldo, bunga);
        this.BiayaAdmin = biayaAdmin;
    }

    public void hitungBunga() {
        double hasil = super.saldo * (super.bunga / 100);
        System.out.println("Nominal Bunga Didapat: Rp " + hasil);
    }

    @Override
    public String cetakInfo() {
        String info = super.cetakInfo();
        info += "Biaya Admin  : Rp " + BiayaAdmin + "\n";
        return info;
    }
}