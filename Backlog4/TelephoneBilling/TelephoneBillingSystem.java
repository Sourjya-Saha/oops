import java.util.Scanner;

// Base class
class Call {
    protected int duration; // in minutes

    public Call(int duration) {
        this.duration = duration;
    }

    public double calculateBill() {
        return 0.0; // Base default
    }
}

// Local Call class
class LocalCall extends Call {
    public LocalCall(int duration) {
        super(duration);
    }

    @Override
    public double calculateBill() {
        int units = (int) Math.ceil(duration / 3.0); // 1 unit per 3 minutes
        return units * 1.0; // ₹1 per unit
    }
}

// STD Call class
class STDCall extends Call {
    private String timeOfCall; // "day" or "night"
    private String originCode;
    private String destinationCode;

    public STDCall(int duration, String timeOfCall, String originCode, String destinationCode) {
        super(duration);
        this.timeOfCall = timeOfCall;
        this.originCode = originCode;
        this.destinationCode = destinationCode;
    }

    @Override
    public double calculateBill() {
        double ratePerMinute;

        // a) Time of call (day/night)
        if (timeOfCall.equalsIgnoreCase("day")) {
            ratePerMinute = 2.5;
        } else {
            ratePerMinute = 1.5;
        }

        // b) STD code comparison
        if (!originCode.equals(destinationCode)) {
            ratePerMinute += 0.5; // different STD code surcharge
        }

        return duration * ratePerMinute;
    }
}

// Main class
public class TelephoneBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("TELEPHONE BILLING SYSTEM");
        System.out.println("1. Local Call");
        System.out.println("2. STD Call");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter duration of local call (in minutes): ");
                int localDuration = scanner.nextInt();
                LocalCall local = new LocalCall(localDuration);
               System.out.println("Local Call Bill: Rs." + local.calculateBill());
                break;

            case 2:
                System.out.print("Enter duration of STD call (in minutes): ");
                int stdDuration = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                System.out.print("Enter time of call (day/night): ");
                String timeOfCall = scanner.nextLine();

                System.out.print("Enter origin STD code: ");
                String origin = scanner.nextLine();

                System.out.print("Enter destination STD code: ");
                String destination = scanner.nextLine();

                STDCall std = new STDCall(stdDuration, timeOfCall, origin, destination);
                System.out.println("STD Call Bill: Rs." + std.calculateBill());
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
