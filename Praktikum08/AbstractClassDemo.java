public class AbstractClassDemo {
    public static void main(String[] args) {
        // Hewan hewan1 = new Hewan(10, "Rumput", "Savana");
        // hewan1.cetakInfo();
        // hewan1.bergerak();
        // hewan1.bernafas();

        Lebah lebah1 = new Lebah("Ratu", 0.05, "Nektar", "Hutan");
        lebah1.cetakInfo();
        lebah1.bergerak();
        System.out.println("\n");
        lebah1.bernafas();
        System.out.println("\n");

        Ular ular1 = new Ular(true, 5.0, "Daging", "Hutan");
        ular1.cetakInfo();
        ular1.bergerak();
        System.out.println("\n");
        ular1.bernafas();
        System.out.println("\n");
    }
}
