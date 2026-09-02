public class dragon {
    int x;
    int y;
    int direction;

    public dragon() {
        x = 0;
        y = 0;
        direction = 2; //degault arah langsung ke kanan
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid!");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1: 
                y += steps;
                break;
            case 2: 
                x += steps;
                break;
            case 3: 
                y -= steps;
                break;
            case 4: 
                x -= steps;
                break;
        }
    }

    public void printStatus() {
        System.out.println("Posisi Dragon : (" + x + ", " + y + ")");
        System.out.println("Arah Dragon   : " + direction);
        System.out.println("=====================");
    }

}
