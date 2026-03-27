import java.util.HashMap;
import java.util.Scanner;
public static void main(String[] args) {
    class Service {
        private String serviceName;
        private double cost;

        public Service(String serviceName, double cost) {
            this.serviceName = serviceName;
            this.cost = cost;
        }

        public String getServiceName() {
            return serviceName;
        }

        public double getCost() {
            return cost;
        }
    }

    class AddOnServiceManager {
        private Map<String, List<Service>> servicesByReservation;

        public AddOnServiceManager() {
            servicesByReservation = new HashMap<>();
        }

        public void addService(String reservationId, Service service) {
            servicesByReservation
                    .computeIfAbsent(reservationId, k -> new ArrayList<>())
                    .add(service);
        }

        public double calculateTotalServiceCost(String reservationId) {
            double total = 0.0;
            List<Service> services = servicesByReservation.get(reservationId);

            if (services != null) {
                for (Service s : services) {
                    total += s.getCost();
                }
            }

            return total;
        }
    }

            AddOnServiceManager manager = new AddOnServiceManager();

            String reservationId = "Single-1";

            manager.addService(reservationId, new Service("Breakfast", 500));
            manager.addService(reservationId, new Service("Spa", 700));
            manager.addService(reservationId, new Service("Airport Pickup", 300));

            double totalCost = manager.calculateTotalServiceCost(reservationId);

            System.out.println("Add-On Service Selection");
            System.out.println("Reservation ID: " + reservationId);
            System.out.println("Total Add-On Cost: " + totalCost);
        }

