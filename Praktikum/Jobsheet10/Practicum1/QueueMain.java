import java.util.Scanner;

public class QueueMain {
    
    public static void menu(){
        System.out.println("Choose menu: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. First");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("=====================");
    }
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Insert maximum queue : ");
    int n  = sc.nextInt();

    Queue Q = new Queue(n);

    int choose;
    do{
        menu();
        se
    }
    }
}
