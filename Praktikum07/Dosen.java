public class Dosen extends Pegawai {
    public String nidn;

    // Constructor default (tanpa parameter)
    public Dosen() {
        System.out.println("Ini constructor class Dosen");
    }

    // Constructor berparameter (Memanggil superclass constructor berparameter)
    public Dosen(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji); // Wajib di baris pertama
        this.nidn = nidn;
        System.out.println("Ini constructor class Dosen yang berparameter");
    }

    // Method overriding dari method getInfo() milik class Pegawai
    @Override
    public String getInfo() {
        return "NIDN  : " + this.nidn + "\n";
    }

    // Method untuk menggabungkan info dari superclass dan subclass
    public String getAllInfo() {
        String info = super.getInfo(); // Memanggil getInfo() dari class Pegawai
        info += this.getInfo();        // Memanggil getInfo() dari class Dosen (Overriding)
        return info;
    }
}