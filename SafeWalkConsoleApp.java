import java.util.Scanner;

public class SafeWalkConsoleApp {

    public static void sendEmergencyMessage(String location) {
        String to = "nithinbollineni04@gmail.com";
        String from = "syedhumdan1112@gmail.com";

        String message = "To: " + to + "\n" +
                         "From: " + from + "\n" +
                         "Subject: Emergency Alert!\n\n" +
                         "Help needed! Last known location: " + location;

        System.out.println("\n=== Simulated Email Sent ===");
        System.out.println(message);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SafeWalk Emergency Console ===");
        System.out.print("Enter your current location or Google Maps link: ");
        String location = scanner.nextLine();

        if (location != null && !location.trim().isEmpty()) {
            sendEmergencyMessage(location);
        } else {
            System.out.println("Error: Location input cannot be empty.");
        }

        scanner.close();
    }
}
