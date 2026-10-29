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
        String info = "--- INFO TABUNGAN ---\n";
        info += "No Rekening  : " + noRekening + "\n";
        info += "Nama Pemilik : " + namaPemilik + "\n";
        info += "Saldo        : Rp " + saldo + "\n";
        info += "Bunga        : " + bunga + "%\n";
        info += "Biaya Admin  : Rp " + BiayaAdmin + "\n";
        return info;
    }
}