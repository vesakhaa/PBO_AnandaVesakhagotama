public class Pegawai {
    public String nip;
    public String nama;
    public double gaji;

    // Constructor default (tanpa parameter)
    public Pegawai() {
        System.out.println("Ini constructor class Pegawai");
    }

    // Constructor berparameter (Overloading constructor)
    public Pegawai(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    // Method untuk mendapatkan informasi pegawai
    public String getInfo() {
        String info = "";
        info += "NIP   : " + nip + "\n";
        info += "Nama  : " + nama + "\n";
        info += "Gaji  : " + gaji + "\n";
        return info;
    }
}