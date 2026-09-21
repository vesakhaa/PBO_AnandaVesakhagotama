import java.util.ArrayList;
import java.util.Date;

public class Pesanan {
    private int idPelanggan;
    private Date tanggal;
    private double totalHarga;
    private String status;
    private ArrayList<DetailPesanan> listDetail;

    public Pesanan(int idPelanggan, Date tanggal, String status) {
        this.idPelanggan = idPelanggan;
        this.tanggal = tanggal;
        this.status = status;
        this.listDetail = new ArrayList<>();
        this.totalHarga = 0.0;
    }

    public void tambahDetail(DetailPesanan detail) {
        listDetail.add(detail);
        countTotal();
    }

    public double countTotal() {
        totalHarga = 0;
        for (DetailPesanan detail : listDetail) {
            totalHarga += detail.getSubtotal();
        }
        return totalHarga;
    }

    public void updateStatus(String s) {
        this.status = s;
    }

    public void cetakPesanan() {
        System.out.println("=========================================");
        System.out.println("ID Pelanggan : " + idPelanggan);
        System.out.println("Tanggal      : " + tanggal);
        System.out.println("Status       : " + status);
        System.out.println("-----------------------------------------");
        System.out.println("Detail Pesanan:");
        for (DetailPesanan detail : listDetail) {
            System.out.println("- " + detail.getMenu().getNamaMenu() + 
                               " x" + detail.getJumlah() + 
                               " = Rp" + detail.getSubtotal());
        }
        System.out.println("-----------------------------------------");
        System.out.println("Total Harga  : Rp" + totalHarga);
        System.out.println("=========================================");
    }
}