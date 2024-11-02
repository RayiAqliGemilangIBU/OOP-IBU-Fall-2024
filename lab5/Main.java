package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Sedan", 10000, 90);
        Truck truck1 = new Truck("Freightliner", 50000, 80);
        Motorcycle motorcycle1 = new Motorcycle("Sportbike", 5000, 85);


        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car1);
        vehicles.add(truck1);
        vehicles.add(motorcycle1);


        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.service());
            vehicle.simulateYear();


            if (vehicle instanceof Car) {
                Car car = (Car) vehicle;
                car.drive(100);
                System.out.println("Car health after driving: " + car.getHealth());
            } else if (vehicle instanceof Truck) {
                Truck truck = (Truck) vehicle;
                truck.haul(6000);
                System.out.println("Truck health after hauling: " + truck.getHealth());
            } else if (vehicle instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) vehicle;
                motorcycle.race(200);
                System.out.println("Motorcycle health after racing: " + motorcycle.getHealth());
            }


            System.out.println("Remaining lifespan: " + vehicle.calculateRemainingLifespan() + " miles\n");
        }


        System.out.println("Performing maintenance:");
        for (Vehicle vehicle : vehicles) {
            vehicle.performMaintenance(vehicle);
            System.out.println(vehicle.getModelName() + " maintenance completed.\n");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a vehicle to perform maintenance:");
        System.out.println("1. Car\n2. Truck\n3. Motorcycle");
        int choice = scanner.nextInt();

        if (choice == 1) {
            car1.performMaintenance(car1);
        } else if (choice == 2) {
            truck1.performMaintenance(truck1);
        } else if (choice == 3) {
            motorcycle1.performMaintenance(motorcycle1);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
