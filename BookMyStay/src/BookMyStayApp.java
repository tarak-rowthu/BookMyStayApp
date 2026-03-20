public class BookMyStayApp {
    public static void main(String[] args) {
        String[] roomTypes = {"Single Room", "Double Room", "Deluxe Room"};
                int[] availability = {5, 3, 2};

                System.out.println("Welcome to the Hotel Booking Management System");
                System.out.println("Available Room Types:\n");

                for (int i = 0; i < roomTypes.length; i++) {
                    System.out.println(roomTypes[i] + " - Available: " + availability[i]);
                }

                System.out.println("\nSystem initialized successfully.");
            }
        }

