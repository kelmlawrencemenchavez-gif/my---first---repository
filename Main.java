public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle("Toyota", "Corolla", 2000);
        Vehicle vehicle2 = new Vehicle("Honda", "Civic", 2010);
        Vehicle vehicle3 = new Vehicle("Ford", "Mustang", 1990);

        
        System.out.println("=== VEHICLE 1 ===");
        vehicle1.displayInfo();
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        System.out.println();

        System.out.println("=== VEHICLE 2 ===");
        vehicle2.displayInfo();
        System.out.println("Age: " + vehicle2.calculateAge());
        System.out.println("Vintage: " + vehicle2.isVintage());

        System.out.println();

        System.out.println("=== VEHICLE 3 ===");
        vehicle3.displayInfo();
        System.out.println("Age: " + vehicle3.calculateAge());
        System.out.println("Vintage: " + vehicle3.isVintage());

        
        System.out.println();
        System.out.println("=== GETTERS ===");
        System.out.println("Vehicle 1 Brand: " + vehicle1.getBrand());
        System.out.println("Vehicle 1 Model: " + vehicle1.getModel());
        System.out.println("Vehicle 1 Year: " + vehicle1.getYear());

        
        System.out.println();
        System.out.println("=== setYear() TESTS ===");

        boolean result;

        result = vehicle1.setYear(2000);
        System.out.println("setYear(2000): " + result);
        System.out.println("Stored year: " + vehicle1.getYear());
        System.out.println("Age: " + vehicle1.calculateAge());
        System.out.println("Vintage: " + vehicle1.isVintage());

        result = vehicle1.setYear(1885);
        System.out.println("setYear(1885): " + result);
        System.out.println("Stored year: " + vehicle1.getYear());

        result = vehicle1.setYear(2027);
        System.out.println("setYear(2027): " + result);
        System.out.println("Stored year: " + vehicle1.getYear());

        
        System.out.println();
        System.out.println("=== CONSTRUCTOR VALIDATION TESTS ===");

        Vehicle invalidVehicle1 = new Vehicle("Test", "Invalid 1885", 1885);
        System.out.println("Vehicle with year 1885:");
        System.out.println("Initial year: " + invalidVehicle1.getYear());

        Vehicle invalidVehicle2 = new Vehicle("Test", "Invalid 2027", 2027);
        System.out.println("Vehicle with year 2027:");
        System.out.println("Initial year: " + invalidVehicle2.getYear());
    }
}
