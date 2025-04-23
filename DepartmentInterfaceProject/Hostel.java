// Class Hostel
public class Hostel {
    // Attributes of the Hostel
    String hostelName;
    String hostelLocation;
    int noOfRooms;

    // Method to get data for hostel
    public void getHostelData(String hostelName, String hostelLocation, int noOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.noOfRooms = noOfRooms;
    }

    // Method to print hostel data
    public void printHostelData() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + noOfRooms);
    }
}
