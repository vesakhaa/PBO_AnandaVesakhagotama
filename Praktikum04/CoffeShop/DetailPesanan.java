public class DetailPesanan {
    private int idDetail;
    private MenuKopi menu;
    private int jumlah;
    private double subTotal;

    public DetailPesanan(int idDetail, MenuKopi menu, int jumlah) {
        this.idDetail = idDetail;
        this.menu = menu;
        this.jumlah = jumlah;
        this.subTotal = hitungSubtotal();
    }

    public double hitungSubtotal() {
        return menu.getHarga() * jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getSubtotal() {
        return subTotal;
    }

    public MenuKopi getMenu() {
        return menu;
    }
}