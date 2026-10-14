public class Tabungan extends Rekening {
    public double admin;

    // 1. Constructor tanpa parameter
    public Tabungan() {
        super();
    }

    // 2. Constructor berparameter (Memanggil super() berparameter)
    public Tabungan(String noRekening, String namaPemilik, double saldo, double bunga, double admin) {
        super(noRekening, namaPemilik, saldo, bunga); // Memanggil constructor superclass
        this.admin = admin;
    }

    public void hitungBunga() {
        double hasil = super.saldo * (super.bunga / 100);
        System.out.println("Nominal Bunga Didapat: Rp " + hasil);
    }

    // Method Overriding dari class Rekening
    @Override
    public String cetakInfo() {
        String info = super.cetakInfo(); // Mengambil info dari superclass
        info += "Biaya Admin  : Rp " + admin + "\n";
        return info;
    }
}