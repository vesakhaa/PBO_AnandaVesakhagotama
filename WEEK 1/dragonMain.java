public class dragonMain {
    public static void main(String[] args) {
        dragon Dragon1 = new dragon();
        dragon Dragon2= new dragon();

        System.out.println("--Status Awal Dragon 1--");
        Dragon1.printStatus();

        System.out.println("--Dragon 1 Bergerak--");
        Dragon1.move(5);
        Dragon1.printStatus();

        System.out.println("--Status Awal Dragon 2--");
        Dragon2.printStatus();

        System.out.println("--Dragon 2 Mengubah Arah--");
        Dragon2.changeDirection(1);
        Dragon2.move(2);
        Dragon2.printStatus();
    }

    
}
