package Equipment_Inventory_Manager;
import java.util.Scanner;

public class main {
    
    private static Scanner scanner = new Scanner(System.in);
    private static hospitalTechnician hospitalTech;

    public static void main(String [] args) {
        System.out.println("\n\n\nAre you a Hospital Technician? Y(yes) OR N(no):");
        String loginTechnician = scanner.next();

        if (loginTechnician.equals("Y") || loginTechnician.equals("y")) {
            loginTechnician();
            setTechnicianDetails();
            displayTechnicianDetails();
        } else {
            System.out.println("\n\n\n--------------------Logging Out--------------------");
        }
    }

    public static void loginTechnician() {
        System.out.println("\n\n\n\n\n\n--------------------Welcome Hospital Technician--------------------");
    }

    public static void setTechnicianDetails() {
        System.out.println("\n\n\nEnter your Technician ID:");
        String setTechnicianID = scanner.next();
        System.out.println("\n\n\nEnter your Technician Name:");
        String setTechnicianName = scanner.next();
        System.out.println("\n\n\nEnter your Technician Role:");
        String setTechnicianRole = scanner.next();
        hospitalTech = new hospitalTechnician(setTechnicianID, setTechnicianName, setTechnicianRole);
    }

    public static void displayTechnicianDetails() {
        System.out.println("\n\n\n-----Technician Information-----");
        System.out.println("Technician ID: " + hospitalTech.getTechnicianID());
        System.out.println("Technician Name: " + hospitalTech.getName());
        System.out.println("Technician Role: " + hospitalTech.getRole());
        System.out.println("--------------------------------\n\n\n");
    }
}