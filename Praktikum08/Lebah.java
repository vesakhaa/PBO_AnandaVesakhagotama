public class Lebah extends Hewan {
    public String kasta;

    public Lebah(String kasta, double berat, String makanan, String habitat) {
        super(berat, makanan, habitat);
        this.kasta = kasta;
    }

    @Override
    public void bergerak() {
        System.out.println("Mergepakkan sayap ke depan");
        System.out.println("Memutar sayap hampir 90 derjat");
        System.out.println("Mergepakkan sayap ke belakang");
    }

    /**
     * (non-Javadoc)
     * 
     * @see Hewan#bernafas()
     */
    @Override
    public void bernafas() {
        System.out.println("Otot perut mengendur, udara masuk melalui lubang di segmen tubuh");
        System.out.println("Trakea mengirimkan oksigen");
        System.out.println("Otot perut berkontraksi, udara dikeluarkan");
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kasta : " + this.kasta);
    }
}
