public class Rekening {
    public String noRekening;
    public String namaPemilik;
    protected double saldo;  // Menggunakan protected sesuai simbol '#' di diagram
    public double bunga;

    // 1. Constructor tanpa parameter (Overloading)
    public Rekening() {
        System.out.println("Constructor default Rekening dibuat");
    }

    // 2. Constructor berparameter (Overloading)
    public Rekening(String noRekening, String namaPemilik, double saldo, double bunga) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
        this.bunga = bunga;
    }

    public void tarikSaldo(double jumlah) {
        if(saldo >= jumlah) {
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

    // Method ini dibuat untuk mendemonstrasikan Overriding di subclass
    public String cetakInfo() {
        String info = "No Rekening  : " + noRekening + "\n";
        info += "Nama Pemilik : " + namaPemilik + "\n";
        info += "Saldo        : Rp " + saldo + "\n";
        info += "Bunga        : " + bunga + "%\n";
        return info;
    }
}