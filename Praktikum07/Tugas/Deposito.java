public class Deposito extends Rekening {
    public double tenor;

    // 1. Constructor tanpa parameter
    public Deposito() {
        super();
    }

    // 2. Constructor berparameter (Memanggil super() berparameter)
    public Deposito(String noRekening, String namaPemilik, double saldo, double bunga, double tenor) {
        super(noRekening, namaPemilik, saldo, bunga); // Memanggil constructor superclass
        this.tenor = tenor;
    }

    public void durasiTenor() {
        System.out.println("Sisa Tenor Deposito Anda: " + tenor + " bulan");
    }

    // Method Overriding dari class Rekening
    @Override
    public String cetakInfo() {
        String info = super.cetakInfo(); // Mengambil info dari superclass
        info += "Tenor        : " + tenor + " Bulan\n";
        return info;
    }
}