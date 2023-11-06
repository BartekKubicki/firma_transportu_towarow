import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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

        Goods goods1 = new Goods("Elektronika", 25.50);
        Goods goods2 = new Goods("Materiały budowlane", 50.80);
        Goods goods3 = new Goods("Artykuły spożywcze", 10.75);
        Goods goods4 = new Goods("Materiały sypkie", 100.40);
        Goods goods5 = new Goods("Surowce naturalne", 45.10);

        List<Transportable> transportVehicles = new ArrayList<>();
        List<Employee> employees = new ArrayList<>();
        List<Goods> goods = new ArrayList<>();

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

        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Dodaj pracownika");
            System.out.println("2. Dodaj jednostkę transportu");
            System.out.println("3. Dodaj towar");
            System.out.println("4. Załaduj towar do jednostki transportu");
            System.out.println("5. Zakończ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Podaj imię pracownika:");
                    String firstName = scanner.nextLine();
                    System.out.println("Podaj nazwisko pracownika:");
                    String lastName = scanner.nextLine();
                    System.out.println("Podaj wiek pracownika:");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Czy pracownik ma licencję na ciężarówkę? (true/false):");
                    boolean hasTruckLicense = scanner.nextBoolean();
                    System.out.println("Czy pracownik ma licencję na statek? (true/false):");
                    boolean hasShipLicense = scanner.nextBoolean();
                    scanner.nextLine();

                    Employee newEmployee = new Employee(firstName, lastName, age, hasTruckLicense, hasShipLicense);
                    employees.add(newEmployee);
                    System.out.println("Dodano pracownika: " + newEmployee.getName() + " " + newEmployee.getSureName());
                    break;

                case 2:
                    System.out.println("Wybierz jednostkę transportu (1 - Ciężarówka, 2 - Statek, 3 - samochód dostawczy):");
                    int transportOption = scanner.nextInt();
                    scanner.nextLine();

                    if (transportOption == 1) {
                        System.out.println("Podaj pojemność i marke ciężarówki");
                        int capacity = scanner.nextInt();
                        scanner.nextInt();
                        String brand = scanner.nextLine();
                        scanner.nextLine();
                        Truck newTruck = new Truck(capacity, brand);
                        transportVehicles.add(newTruck);
                    } else if (transportOption == 2) {
                        System.out.println("Podaj pojemność i marke statku");
                        int capacity = scanner.nextInt();
                        scanner.nextInt();
                        String brand = scanner.nextLine();
                        scanner.nextLine();
                        Ship newShip = new Ship(capacity, brand);
                        transportVehicles.add(newShip);
                    } else if(transportOption == 3) {
                        System.out.println("Podaj pojemność i marke samochodu dostawczego");
                        int capacity = scanner.nextInt();
                        scanner.nextInt();
                        String brand = scanner.nextLine();
                        scanner.nextLine();
                        DeliveryCar newCar = new DeliveryCar(capacity, brand);
                        transportVehicles.add(newCar);
                    } else {
                        System.out.println("Nie wybrałeś typu pojazdu!");
                    }
                    break;

                case 3:
                    System.out.println("Podaj nazwę towaru:");
                    String goodsName = scanner.nextLine();
                    System.out.println("Podaj wagę towaru:");
                    double goodsWeight = scanner.nextDouble();
                    scanner.nextDouble();
                    Goods newGoods = new Goods(goodsName,goodsWeight);
                    goods.add(newGoods);
                    break;

                case 4:
                    System.out.println("Wybierz jednostkę transportu do załadowania (numer):");
                    for (int i = 0; i < transportVehicles.size(); i++) {
                        System.out.println(i + ". " + transportVehicles.get(i).getClass().getSimpleName());
                    }
                    int transportIndex = scanner.nextInt();
                    scanner.nextLine();

                    if (transportIndex >= 0 && transportIndex < transportVehicles.size()) {
                        Transportable transportUnit = transportVehicles.get(transportIndex);

                        System.out.println("Wybierz towar do załadowania: ");
                        System.out.println("1 -- " + goods1.getType() + " " + goods1.getWeight());
                        System.out.println("2 -- " + goods2.getType() + " " + goods2.getWeight());
                        System.out.println("3 -- " + goods3.getType() + " " + goods3.getWeight());
                        System.out.println("4 -- " + goods4.getType() + " " + goods4.getWeight());
                        System.out.println("5 -- " + goods5.getType() + " " + goods5.getWeight());
                        System.out.println("6 -- dodaj własny towar do załadowania");
                        int options = scanner.nextInt();
                        scanner.nextLine();

                        switch (options) {
                            case 1:
                                transportUnit.loadGoods(goods1);
                                break;
                            case 2:
                                transportUnit.loadGoods(goods2);
                                break;
                            case 3:
                                transportUnit.loadGoods(goods3);
                                break;
                            case 4:
                                transportUnit.loadGoods(goods4);
                                break;
                            case 5:
                                transportUnit.loadGoods(goods5);
                                break;
                            case 6:
                                System.out.println("Podaj typ towaru:");
                                String potencialName = scanner.nextLine();
                                System.out.println("Podaj wagę towaru:");
                                double potencialWeight = scanner.nextDouble();
                                Goods potencialGoods = new Goods(potencialName, potencialWeight);
                                goods.add(potencialGoods);
                                transportUnit.loadGoods(potencialGoods);
                        }
                    } else {
                        System.out.println("Niepoprawny numer jednostki transportu.");
                    }
                    break;

                case 5:
                    System.out.println("Koniec programu.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Niepoprawna opcja. Wybierz ponownie.");
            }
        }

    }
}