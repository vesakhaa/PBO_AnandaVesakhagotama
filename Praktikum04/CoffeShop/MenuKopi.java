public class MenuKopi {
    private int idMenu;
    private String namaMenu;
    private String deskripsi;
    private double harga;
    private int stok;

    public MenuKopi(int idMenu, String namaMenu, String deskripsi, double harga, int stok) {
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.stok = stok;
    }

    public int getIdMenu() {
        return idMenu;
    }

    public String getNamaMenu() {
        return namaMenu;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void updateHarga(double h) {
        this.harga = h;
    }

    public void updateStok(int s) {
        this.stok = s;
    }

    public String detailMenu() {
        return "ID: " + idMenu + " | Menu: " + namaMenu + " (" + deskripsi + ") | Harga: Rp" + harga + " | Stok: " + stok;
    }
}