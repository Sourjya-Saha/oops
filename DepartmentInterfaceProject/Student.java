import java.util.Scanner;

// Class Student extends Hostel and implements Department
public class Student extends Hostel implements Department {
    // Attributes of the student and department
    String studentName;
    String regNo;
    String electiveSubject;
    double avgMarks;
    String depName;
    String depHead;

    // Method to get data for the student and hostel, and department
    public void getData() {
        Scanner sc = new Scanner(System.in);

        // Getting student details
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Registration Number: ");
        regNo = sc.nextLine();
        System.out.print("Enter Elective Subject: ");
        electiveSubject = sc.nextLine();
        System.out.print("Enter Average Marks: ");
        avgMarks = sc.nextDouble();
        sc.nextLine(); // Consume the leftover newline

        // Getting department details
        System.out.print("Enter Department Name: ");
        depName = sc.nextLine();
        System.out.print("Enter Department Head: ");
        depHead = sc.nextLine();

        // Getting hostel details
        System.out.print("Enter Hostel Name: ");
        hostelName = sc.nextLine();
        System.out.print("Enter Hostel Location: ");
        hostelLocation = sc.nextLine();
        System.out.print("Enter Number of Rooms: ");
        noOfRooms = sc.nextInt();
    }

    // Method to print data of the student and hostel, and department
    public void printData() {
        // Printing department details
        System.out.println("\nDepartment Name: " + depName);
        System.out.println("Department Head: " + depHead);

        // Printing student details
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);

        // Printing hostel details
        printHostelData();
    }
}
