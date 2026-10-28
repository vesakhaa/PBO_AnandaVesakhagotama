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

        Tabungan tabungan2 = new Tabungan("1234567890", "Lepi", 1000000, 1.5, 10000);
        System.out.println(tabungan2.cetakInfo());
        tabungan2.tarikSaldo(200000);
        tabungan2.hitungBunga();
        System.out.println("\n");
        System.out.println(tabungan2.cetakInfo());
    }
}
