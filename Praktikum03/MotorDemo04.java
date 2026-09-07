public class MotorDemo04 {
    public static void main(String[] args) {
         // motor 1
        // Motor04 motor1 = new Motor04();
        // motor1.platNomor = "B 0838 XZ";
        // int kecepatanBaru = 50;

        // if(!motor1.statusMesin && kecepatanBaru > 0) {
        //     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin Off");
        // } else{
        //     motor1.kecepatan = kecepatanBaru;
        // }

        // motor1.displayInfo();

        //motor 2
        // Motor04 motor2 = new Motor04();
        // motor2.platNomor = "N 9840 AB";
        // motor2.statusMesin = true;
        // kecepatanBaru = 40;

        // if(!motor2.statusMesin && kecepatanBaru > 0) {
        //     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin Off");
        // } else{
        //     motor2.kecepatan = kecepatanBaru;
        // }

        // motor2.displayInfo();

        //motor 3
        // Motor04 motor3 = new Motor04();
        // motor3.platNomor = "D 8343 CV";
        // kecepatanBaru = 60;

        // if(!motor3.statusMesin && kecepatanBaru > 0) {
        //     System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin Off");
        // } else{
        //     motor3.kecepatan = kecepatanBaru;
        // }

        // motor3.displayInfo();

         // motor 1
        Motor04 motor1 = new Motor04();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.setKecepatan(50);
        motor1.displayInfo();

         //motor 2
        Motor04 motor2 = new Motor04();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setStatusMesin(true);
        motor2.setKecepatan(40);
        motor2.displayInfo();

         //motor 3
        Motor04 motor3 = new Motor04();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(60);
        motor3.displayInfo();
    }
}
