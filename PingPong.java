import java.util.Random;
import java.util.Scanner;

class Ping implements Runnable {
    int count;

    Ping(int count) {
        this.count = count;
    }

    public void run() {
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            int spaces = rand.nextInt(20);
            System.out.println(" ".repeat(spaces) + "Ping");
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println("Ping thread interrupted.");
            }
        }
    }
}

class Pong implements Runnable {
    int count;

    Pong(int count) {
        this.count = count;
    }

    public void run() {
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            int spaces = rand.nextInt(20);
            System.out.println(" ".repeat(spaces) + "PONG");
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                System.out.println("PONG thread interrupted.");
            }
        }
    }
}

public class PingPong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many times you want to print Ping and PONG: ");
        int count = sc.nextInt();

        Thread t1 = new Thread(new Ping(count));
        Thread t2 = new Thread(new Pong(count));

        t1.start();
        t2.start();
    }
}
