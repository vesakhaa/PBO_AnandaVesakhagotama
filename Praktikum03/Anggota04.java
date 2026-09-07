public class Anggota04 {
    private String nomorKTP;
    private String nama;
    private int limitPinjaman;
    private int jumlahPinjaman;

    public Anggota04(String nomorKTP, String nama, int limitPinjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
        this.jumlahPinjaman = 0; //default pinjaman masih 0
    }

    public String getNama(){
        return this.nama;
    }

    public int getLimitPinjaman(){
        return this.limitPinjaman;
    }

    public int getJumlahPinjaman(){
        return this.jumlahPinjaman;
    }

    public void pinjam(int nominal){
        if((this.jumlahPinjaman + nominal) > this.limitPinjaman){
            System.out.println("Maaf, jumlah pinjaman melebihi limit!");
        } else {
            this.jumlahPinjaman += nominal;
        }
    }

    public void angsur(int nominal) {
        if(nominal < (0.1 * this.jumlahPinjaman)) { //angsuran harus 10% dari jumlah pinjaman
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        } else {
            this.jumlahPinjaman -= nominal;
        }
    }
}
