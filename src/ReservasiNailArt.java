import java.util.ArrayList;
import java.util.Scanner;

class NailArtReservation {
    private String customerName;
    private String serviceType;
    private double price;
    private static final double TAX_RATE = 0.1;

    public NailArtReservation(String customerName, String serviceType, double price) {
        this.customerName = customerName;
        this.serviceType = serviceType;
        this.price = price;
    }
    public String getCustomerName() {
        return customerName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public double getPrice() {
        return price;
    }

    public double calculateTotalPrice() {
        return getPrice() + calculateTax();
    }
    public double calculateTax() {
        return getPrice() * TAX_RATE;
    }

    public void displayReservationDetails() {
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Service Type: " + getServiceType());
        System.out.println("Price: " + getPrice());
        System.out.println("Total Price (with Tax): " + calculateTotalPrice());
    }
}

public class ReservasiNailArt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<NailArtReservation> reservations = new ArrayList<>();

        NailArtReservation reservation = createNewReservation(scanner);
        reservations.add(reservation);
        reservation.displayReservationDetails();
    }
    private static NailArtReservation createNewReservation(Scanner scanner) {
        System.out.println("Enter Customer Name:");
        String customerName = scanner.nextLine();
        System.out.println("Enter Service Type (Manicure/Pedicure):");
        String serviceType = scanner.nextLine();
        System.out.println("Enter Price:");
        double price = scanner.nextDouble();
        return new NailArtReservation(customerName, serviceType, price);
    }
}

