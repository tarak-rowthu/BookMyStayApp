import java.util.HashMap;
import java.util.Scanner;
public static void main(String[] args) {
    HashMap<String, Integer> roomInventory = new HashMap<>();
        roomInventory.put("Single Room", 5);
        roomInventory.put("Double Room", 3);
        roomInventory.put("Deluxe Room", 2);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Hotel Booking Management System");
        System.out.print("Enter room type to search: ");
        String searchRoom = scanner.nextLine();
        if (roomInventory.containsKey(searchRoom)) {
            int available = roomInventory.get(searchRoom);

            if (available > 0) {
                System.out.println(searchRoom + " is available. Rooms left: " + available);
            } else {
                System.out.println(searchRoom + " is currently not available.");
            }
        } else {
            System.out.println("Invalid room type.");
        }

        scanner.close();
    }

