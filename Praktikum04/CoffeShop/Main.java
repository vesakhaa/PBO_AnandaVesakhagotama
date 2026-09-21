import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Instansiasi objek MenuKopi
        MenuKopi kopi1 = new MenuKopi(1, "Espresso", "Kopi hitam dengan beans arabica", 18000, 20);
        MenuKopi kopi2 = new MenuKopi(2, "Caramel Macchiato", "Kopi susu dengan sirup karamel", 28000, 15);

        // Instansiasi DetailPesanan
        DetailPesanan detail1 = new DetailPesanan(101, kopi1, 2);
        DetailPesanan detail2 = new DetailPesanan(102, kopi2, 1);

        // Instansiasi Pesanan
        Pesanan pesanan1 = new Pesanan(501, new Date(), "Dalam Proses");
        pesanan1.tambahDetail(detail1);
        pesanan1.tambahDetail(detail2);

        // Cetak struk pesanan awal
        pesanan1.cetakPesanan();

        // Update status pesanan
        pesanan1.updateStatus("Selesai");
        System.out.println("\nStatus Pesanan Diperbarui:");
        pesanan1.cetakPesanan();
    }
}