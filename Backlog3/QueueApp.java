import java.util.Scanner;

// Queue class using encapsulation
class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    // Constructor
    public Queue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Insert element into queue
    public void insert(int value) {
        if (size == queue.length) {
            System.out.println("Queue is full. Cannot insert " + value);
        } else {
            rear = (rear + 1) % queue.length;
            queue[rear] = value;
            size++;
            System.out.println("Inserted: " + value);
        }
    }

    // Delete element from queue
    public void delete() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot delete.");
        } else {
            int deletedValue = queue[front];
            front = (front + 1) % queue.length;
            size--;
            System.out.println("Deleted: " + deletedValue);
        }
    }

    // Display queue
    public void display() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }
}

// Main class for manual input
public class QueueApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter queue capacity: ");
        int capacity = scanner.nextInt();

        Queue q = new Queue(capacity);

        int choice;
        do {
            System.out.println("\nQUEUE OPERATIONS");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number to insert: ");
                    int num = scanner.nextInt();
                    q.insert(num);
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
