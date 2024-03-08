import java.util.Scanner;

public class DragonMain07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan lebar area permainan: ");
        int width = sc.nextInt();
        
        System.out.print("Masukkan tinggi area permainan: ");
        int height = sc.nextInt();
        
        Dragon07 dragon1 = new Dragon07(0, 0, width, height);

        while (true) {
            dragon1.printPosition();
            System.out.print("Masukkan arah gerakan (a/w/s/d): ");
            String direction = sc.next();
            switch (direction) {
                case "a":
                dragon1.moveLeft();
                break;
                case "w":
                dragon1.moveUp();
                break;
                case "s":
                dragon1.moveDown();
                break;
                case "d":
                dragon1.moveRight();
                break;
                default:
                System.out.println("Arah tidak valid!");
            }
        }
    }
}
