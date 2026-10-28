public class Rekening {
    public String noRekening;
    public String namaPemilik;
    protected double saldo;
    public double bunga;

    public Rekening() {
        System.out.println("Constructor default Rekening dibuat");
    }

    public Rekening(String noRekening, String namaPemilik, double saldo, double bunga) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
        this.bunga = bunga;
    }

    public void tarikSaldo(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Penarikan Rp " + jumlah + " berhasil.");
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }

    public void setorSaldo(double jumlah) {
        saldo += jumlah;
        System.out.println("Setor saldo Rp " + jumlah + " berhasil.");
    }

    public String cetakInfo() {
        String info = "No Rekening  : " + noRekening + "\n";
        info += "Nama Pemilik : " + namaPemilik + "\n";
        info += "Saldo        : Rp " + saldo + "\n";
        info += "Bunga        : " + bunga + "%\n";
        return info;
    }
}