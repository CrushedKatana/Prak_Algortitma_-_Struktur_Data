public class Dragon07 {
    private int x;
    private int y;
    private int width;
    private int height;

    public Dragon07 (int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    void moveLeft() {
        x--;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    void moveRight() {
        x++;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    void moveUp() {
        y--;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    void moveDown() {
        y++;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    void printPosition() {
        System.out.println("Posisi dragon: (" + x + ", " + y + ")");
    }

    void detectCollision() {
        System.out.println("Game Over!");
        System.exit(0);
    }
}
