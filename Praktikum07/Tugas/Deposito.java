public class Deposito extends Rekening {
    public double tenor;

    public Deposito() {
        super();
    }

    public Deposito(String noRekening, String namaPemilik, double saldo, double bunga, double tenor) {
        super(noRekening, namaPemilik, saldo, bunga);
        this.tenor = tenor;
    }

    public void durasiTenor() {
        System.out.println("Sisa Tenor Deposito Anda: " + tenor + " bulan");
    }

    @Override
    public String cetakInfo() {
        String info = "--- INFO TABUNGAN ---\n";
        info += "No Rekening  : " + noRekening + "\n";
        info += "Nama Pemilik : " + namaPemilik + "\n";
        info += "Saldo        : Rp " + saldo + "\n";
        info += "Bunga        : " + bunga + "%\n";
        info += "Tenor        : " + tenor + " Bulan\n";
        return info;
    }
}