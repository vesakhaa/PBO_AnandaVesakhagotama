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
        String info = super.cetakInfo();
        info += "Tenor        : " + tenor + " Bulan\n";
        return info;
    }
}