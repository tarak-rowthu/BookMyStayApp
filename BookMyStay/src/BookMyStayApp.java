import java.util.HashMap;
public class BookMyStayApp {
    public static void main(String[] args) {
        HashMap<String, Integer> roomInventory = new HashMap<>();
            roomInventory.put("Single Room", 5);
            roomInventory.put("Double Room", 3);
            roomInventory.put("Deluxe Room", 2);

            System.out.println("Welcome to the Hotel Booking Management System");
            System.out.println("Room Inventory:\n");
            for (String roomType : roomInventory.keySet()) {
                System.out.println(roomType + " - Available: " + roomInventory.get(roomType));
            }

            System.out.println("\nSystem initialized successfully.");
        }
    }
