import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Adam", "Kowalski", 25, true, false);
        Employee employee2 = new Employee("Karol", "Nowak", 20, true, false);
        Employee employee3 = new Employee("Krzysztof", "Wybicki", 30, false, true);
        Employee employee4 = new Employee("Wojciech", "Mazur", 18, true, false);
        Employee employee5 = new Employee("Piotr", "Wiśniewski", 45, false, true);

        Transportable truck1 = new Truck(500, "BMW");
        Transportable truck2 = new Truck(1000, "Toyota");
        Transportable truck3 = new Truck(250, "Hiyundai");
        Transportable truck4 = new Truck(370, "Skoda");
        Transportable truck5 = new Truck(210, "BMW");

        Transportable ship1 = new Ship(470, "Toyota");
        Transportable ship2 = new Ship(990, "BMW");
        Transportable ship3 = new Ship(1100, "Hiyundai");
        Transportable ship4 = new Ship(260, "Toyota");
        Transportable ship5 = new Ship(390, "Skoda");

        Transportable deliveryCar1 = new DeliveryCar(200, "Skoda");
        Transportable deliveryCar2 = new DeliveryCar(150, "Opel");
        Transportable deliveryCar3 = new DeliveryCar(130, "Audi");
        Transportable deliveryCar4 = new DeliveryCar(125, "Hiyundai");
        Transportable deliveryCar5 = new DeliveryCar(230, "Mercedes");

        List<Transportable> transportVehicles = new ArrayList<>();

        transportVehicles.add(truck1);
        transportVehicles.add(truck2);
        transportVehicles.add(truck3);
        transportVehicles.add(truck4);
        transportVehicles.add(truck5);

        transportVehicles.add(ship1);
        transportVehicles.add(ship2);
        transportVehicles.add(ship3);
        transportVehicles.add(ship4);
        transportVehicles.add(ship5);

        transportVehicles.add(deliveryCar1);
        transportVehicles.add(deliveryCar2);
        transportVehicles.add(deliveryCar3);
        transportVehicles.add(deliveryCar4);
        transportVehicles.add(deliveryCar5);
    }
}