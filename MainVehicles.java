// Абстрактный класс Vehicle
abstract class Vehicle {
    int id;
    String brand;
    String model;
    int year;

    abstract void startEngine();

    abstract void stopEngine();

    abstract void accelerate(int speed);

    abstract void brake();

    abstract void displayInfo();
}

// Интерфейс Flyable
interface Flyable {
    void takeOff();

    void land();
}

// Интерфейс Swimmable
interface Swimmable {
    void startSwimming();

    void stopSwimming();
}

// Класс Car
class Car extends Vehicle {
    int fuelCapacity;
    int currentFuelLevel;

    @Override
    void displayInfo() {
        System.out.println("Car: " + brand + " " + model + " (" + year + ")");
    }

    @Override
    void startEngine() {
        System.out.println("Car engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    @Override
    void accelerate(int speed) {
        System.out.println("Car accelerating to " + speed + " km/h.");
    }

    @Override
    void brake() {
        System.out.println("Car braking.");
    }
}

// Класс Aircraft
class Aircraft extends Vehicle implements Flyable {
    int maxAltitude;
    boolean isFlying;

    @Override
    void displayInfo() {
        System.out.println("Aircraft: " + brand + " " + model + " (" + year + ")");
    }

    @Override
    void startEngine() {
        System.out.println("Aircraft engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Aircraft engine stopped.");
    }

    @Override
    void accelerate(int speed) {
        System.out.println("Aircraft increasing speed to " + speed + " km/h.");
    }

    @Override
    void brake() {
        System.out.println("Aircraft braking.");
    }

    @Override
    public void takeOff() {
        System.out.println("Aircraft taking off.");
    }

    @Override
    public void land() {
        System.out.println("Aircraft landing.");
    }
}

// Класс Boat
class Boat extends Vehicle implements Swimmable {
    int maxSpeed;
    boolean isSailing;

    @Override
    void displayInfo() {
        System.out.println("Boat: " + brand + " " + model + " (" + year + ")");
    }

    @Override
    void startEngine() {
        System.out.println("Boat engine started.");
    }

    @Override
    void stopEngine() {
        System.out.println("Boat engine stopped.");
    }

    @Override
    void accelerate(int speed) {
        System.out.println("Boat increasing speed to " + speed + " knots.");
    }

    @Override
    void brake() {
        System.out.println("Boat braking.");
    }

    @Override
    public void startSwimming() {
        System.out.println("Boat starting to move in the water.");
    }

    @Override
    public void stopSwimming() {
        System.out.println("Boat stopping movement in the water.");
    }
}

// Главный класс Main
public class MainVehicles {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Camry";
        car.year = 2022;

        Aircraft aircraft = new Aircraft();
        aircraft.brand = "Boeing";
        aircraft.model = "747";
        aircraft.year = 2000;

        Boat boat = new Boat();
        boat.brand = "Yamaha";
        boat.model = "242X";
        boat.year = 2021;

        car.startEngine();
        car.accelerate(60);
    }
}