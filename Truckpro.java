```java
import java.util.Scanner;

// Creating an interface
interface Vehicle {
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
    void printState();
}

// Bike class
class Bike implements Vehicle {

    int speed, gear;

    public void changeGear(int a) {
        gear = a;
    }

    public void speedUp(int a) {
        speed += a;
    }

    public void applyBrakes(int a) {
        speed -= a;
    }

    public void printState() {
        System.out.println("Bike -> Speed: " + speed + " Gear: " + gear);
    }
}

// Truck class
class Truck implements Vehicle {

    int speed, gear;

    public void changeGear(int a) {
        gear = a;
    }

    public void speedUp(int a) {
        speed += a;
    }

    public void applyBrakes(int a) {
        speed -= a;
    }

    public void printState() {
        System.out.println("Truck -> Speed: " + speed + " Gear: " + gear);
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Bike input
        Bike bike = new Bike();

        System.out.println("Enter Bike Gear:");
        bike.changeGear(input.nextInt());

        System.out.println("Enter Bike Speed Increase:");
        bike.speedUp(input.nextInt());

        System.out.println("Enter Bike Brake Decrease:");
        bike.applyBrakes(input.nextInt());

        System.out.println("\nCurrent Bike State:");
        bike.printState();

        // Truck input
        Truck truck = new Truck();

        System.out.println("\nEnter Truck Gear:");
        truck.changeGear(input.nextInt());

        System.out.println("Enter Truck Speed Increase:");
        truck.speedUp(input.nextInt());

        System.out.println("Enter Truck Brake Decrease:");
        truck.applyBrakes(input.nextInt());

        System.out.println("\nCurrent Truck State:");
        truck.printState();

        input.close();
    }
}
```

