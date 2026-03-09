public class VehicleHierarchy {
    public static void main(String[] args) {
        Car toyotaCH = new Car("Toyota", "Camry Hybrid", 2020, 4);
        Car audiR8 = new Car("Audi", "R8", 2024, 2);
        Motorcycle yamaha = new Motorcycle("Yamaha", "YZF-R1", 2022, true);
        Motorcycle harley = new Motorcycle("Harley", "Demon", 2027, false);

        Vehicle[] vehicles = {
                toyotaCH,
                audiR8,
                yamaha,
                harley
        };
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }
}
class Vehicle { //SuperClass (parent)
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Make is: " + make);
        System.out.println("Model is: " + model);
        System.out.println("Year is: " + year);
    }

}
class Car extends Vehicle {
    int numDoors;
    public Car(String make, String model, int year, int numDoors) {
        super(make, model, year);
        this.numDoors = numDoors;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors is: " + numDoors + "\n");

    }


}
class Motorcycle extends Vehicle {
    boolean hasSidecar;
    public Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }
    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has sidecar: " + hasSidecar + "\n");
    }


}