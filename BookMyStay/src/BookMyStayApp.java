import java.util.HashMap;
import java.util.Scanner;
public static void main(String[] args) {

 HashMap<String, Integer> roomInventory = new HashMap<>();
            roomInventory.put("Single Room", 5);
            roomInventory.put("Double Room", 3);
            roomInventory.put("Deluxe Room", 2);

            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to the Hotel Booking Management System");

            System.out.print("Enter room type to book: ");
            String roomType = scanner.nextLine();

            if (roomInventory.containsKey(roomType)) {
                int available = roomInventory.get(roomType);

                if (available > 0) {

                    roomInventory.put(roomType, available - 1);
                    System.out.println("Booking confirmed for " + roomType);
                    System.out.println("Remaining rooms: " + roomInventory.get(roomType));
                } else {
                    System.out.println("Sorry, " + roomType + " is fully booked.");
                }
            } else {
                System.out.println("Invalid room type.");
            }

            scanner.close();
        }



