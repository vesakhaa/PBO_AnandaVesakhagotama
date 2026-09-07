public class TestKoperasi {
    public static void main(String[] args) {
        Anggota04 anggota1 = new Anggota04("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota: " + anggota1.getNama());
        System.out.println("Limit Pinjaman: " + anggota1.getLimitPinjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        anggota1.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMeminjam uang 4.000.000...");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 1.000.000");
        anggota1.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        System.out.println("\nMembayar angsuran 3.000.000");
        anggota1.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + anggota1.getJumlahPinjaman());

        Anggota04 anggota2 = new Anggota04("222555666", "Rizki", 10000000);
        System.out.println("\nNama Anggota: " + anggota2.getNama() + "\nMeminjam uang 5.000.000...");
        anggota2.pinjam(5000000);
        System.out.println("\nJumlah pinjaman saat ini: " + anggota2.getJumlahPinjaman());

        System.out.println("\nNama Anggota: " + anggota2.getNama() + "\nMembayar angsuran 300.000");
        anggota2.angsur(300000);

    }
}
