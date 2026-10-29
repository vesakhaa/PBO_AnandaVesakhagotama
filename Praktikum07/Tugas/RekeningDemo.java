public class RekeningDemo {
    public static void main(String[] args) {
        System.out.println("=== DATA TABUNGAN ===");
        Tabungan tabungan1 = new Tabungan("0011223344", "Ananda Vesakhagotama", 5000000, 2.0, 15000);
        System.out.println(tabungan1.cetakInfo());
        tabungan1.hitungBunga();

        System.out.println("\n-----------------------------------\n");

        System.out.println("=== DATA DEPOSITO ===");
        Deposito deposito1 = new Deposito("0099887766", "Arkan Farrasabyan", 2500000, 5.5, 12);
        System.out.println(deposito1.cetakInfo());
        deposito1.durasiTenor();

        System.out.println("\n-----------------------------------\n");

        Rekening rekening1 = new Rekening();
    }
}
