package com.b_k;

import Employees.Employee;
import Vehicles.DeliveryCar;
import Vehicles.Ship;
import Vehicles.Transportable;
import Vehicles.Truck;

import java.util.ArrayList;
import java.util.Collections;
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

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);

        goods.add(goods1);
        goods.add(goods2);
        goods.add(goods3);
        goods.add(goods4);
        goods.add(goods5);

        while (true) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Dodaj pracownika");
            System.out.println("2. Dodaj jednostkę transportu");
            System.out.println("3. Dodaj towar");
            System.out.println("4. Załaduj towar do jednostki transportu");
            System.out.println("5. Usuń pracownika, jednostkę transportu lub towar");
            System.out.println("6. Sortuj pracowników alfabetycznie");
            System.out.println("7. Sortuj towary według wagi");
            System.out.println("8. Znajdź pracownika po jego wieku");
            System.out.println("9. Zakończ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Podaj imię pracownika:");
                    String firstName = scanner.nextLine();
                    System.out.println("Podaj nazwisko pracownika:");
                    String lastName = scanner.nextLine();
                    System.out.println("Podaj wiek pracownika:(min. 18 lat)");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Czy pracownik ma licencję na ciężarówkę? (true/false):");
                    boolean hasTruckLicense = scanner.nextBoolean();
                    System.out.println("Czy pracownik ma licencję na statek? (true/false):");
                    boolean hasShipLicense = scanner.nextBoolean();
                    scanner.nextLine();
                    if (age < 18) {
                        System.out.println("Błąd: Pracownik musi być pełnoletni.");
                        break;
                    }

                    Employee newEmployee = new Employee(firstName, lastName, age, hasTruckLicense, hasShipLicense);
                    employees.add(newEmployee);
                    System.out.println("Dodano pracownika: " + newEmployee.getName() + " " + newEmployee.getSureName());
                    break;

                case 2:
                    System.out.println("Wybierz jednostkę transportu (1 - Ciężarówka, 2 - Statek, 3 - samochód dostawczy):");
                    int transportOption = scanner.nextInt();
                    scanner.nextLine();

                    if (transportOption == 1) {
                        System.out.println("Podaj pojemność i marke ciężarówki(od 50m3 do 150m3)");
                        int capacity = scanner.nextInt();
                        scanner.nextLine();
                        String brand = scanner.nextLine();
                        scanner.nextLine();
                        if(capacity < 50  || capacity > 150){
                            System.out.println("Nieodpowiednia pojemność");
                            break;
                        }

                        Truck newTruck = new Truck(capacity, brand);
                        transportVehicles.add(newTruck);
                        System.out.println("Dodano nowy pojazd: " + newTruck.toString());
                    } else if (transportOption == 2) {
                        System.out.println("Podaj pojemność i marke statku(od 50m3 do 150m3)");
                        int capacity = scanner.nextInt();
                        scanner.nextLine();
                        String brand = scanner.nextLine();
                        scanner.nextLine();
                        if(capacity < 50  || capacity > 150){
                            System.out.println("Nieodpowiednia pojemność");
                            break;
                        }

                        Ship newShip = new Ship(capacity, brand);
                        transportVehicles.add(newShip);
                        System.out.println("Dodano nowy pojazd: " + newShip.toString());
                    } else if(transportOption == 3) {
                        System.out.println("Podaj pojemność i marke samochodu dostawczego(od 50m3 do 150m3)");
                        int capacity = scanner.nextInt();
                        scanner.nextLine();
                        String brand = scanner.nextLine();
                        scanner.nextLine();
                        if(capacity < 50  || capacity > 150){
                            System.out.println("Nieodpowiednia pojemność");
                            break;
                        }

                        DeliveryCar newCar = new DeliveryCar(capacity, brand);
                        transportVehicles.add(newCar);
                        System.out.println("Dodano nowy pojazd: " + newCar.toString());
                    } else {
                        System.out.println("Nie wybrałeś typu pojazdu!");
                    }
                    break;

                case 3:
                    System.out.println("Podaj nazwę towaru:");
                    String goodsName = scanner.nextLine();
                    System.out.println("Podaj wagę towaru:(od 10kg do 1000kg)");
                    double goodsWeight = scanner.nextDouble();
                    scanner.nextLine();
                    if(goodsWeight < 10 || goodsWeight > 1000){
                        System.out.println("Towar ma nieodpowiednią wagę");
                        break;
                    }
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
                    System.out.println("Wybierz rodzaj obiektu do usunięcia:");
                    System.out.println("1. Pracownik");
                    System.out.println("2. Jednostka transportu");
                    System.out.println("3. Towar");

                    int deleteOption = scanner.nextInt();
                    scanner.nextLine();

                    switch (deleteOption) {
                        case 1:
                            System.out.println("Wszyscy pracownicy:");
                            for (Employee employee : employees) {
                                System.out.println(employee.getName() + " " + employee.getSureName());
                            }
                            System.out.println("Którego prawcownika chcesz usunąć? (Podaj liczbę od 0 do " + employees.size() + ")");
                            int employeeId = scanner.nextInt();
                            scanner.nextLine();

                            if (employeeId >= 0 && employeeId < employees.size()) {
                                employees.remove(employeeId);
                                System.out.println("Usunięto pracownika.");
                            } else {
                                System.out.println("Niepoprawny indeks pracownika.");
                            }
                            break;

                        case 2:
                            System.out.println("Wszystkie jednostki transportu:");
                            System.out.println(transportVehicles.toString());
                            System.out.println("Podaj indeks jednostki transportu do usunięcia:(od 0 do " + transportVehicles.size() + ")");
                            int transportId = scanner.nextInt();
                            scanner.nextLine();

                            if (transportId >= 0 && transportId < transportVehicles.size()) {
                                transportVehicles.remove(transportId);
                                System.out.println("Usunięto jednostkę transportu.");
                            } else {
                                System.out.println("Niepoprawny indeks jednostki transportu.");
                            }
                            break;

                        case 3:
                            System.out.println("Wszystkie towary:");
                            for (Goods good : goods) {
                                System.out.println(good.getType() + " " + good.getWeight());
                            }
                            System.out.println("Podaj indeks towaru do usunięcia:");
                            int cargoIndex = scanner.nextInt();
                            scanner.nextLine();

                            if (cargoIndex >= 0 && cargoIndex < goods.size()) {
                                goods.remove(cargoIndex);
                                System.out.println("Usunięto towar.");
                            } else {
                                System.out.println("Niepoprawny indeks towaru.");
                            }
                            break;

                        default:
                            System.out.println("Niepoprawna opcja usuwania.");
                    }
                    break;

                case 6:
                    Collections.sort(employees);
                    System.out.println("Pracownicy posortowani alfabetycznie:");
                    for (Employee employee : employees) {
                        System.out.println(employee.getName() + " " + employee.getSureName());
                    }
                    break;

                case 7:
                    Collections.sort(goods);
                    System.out.println("Towary posortowane według wagi:");
                    for (Goods good : goods) {
                        System.out.println(good.getWeight() + " " + good.getType());
                    }
                    break;

                case 8:
                    findEmployeeByAge(scanner, employees);
                    break;

                case 9:
                    System.out.println("Koniec programu.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Niepoprawna opcja. Wybierz ponownie.");
            }
        }
    }
    private static void findEmployeeByAge(Scanner scanner, List<Employee> employees) {
        System.out.println("Podaj wiek pracownika do wyszukania:");
        int findAge = scanner.nextInt();

        for (Employee employee : employees) {
            if (employee.getAge() == findAge) {
                System.out.println("Znaleziono pracownika: " + employee.getName() + " " + employee.getSureName() + " " + employee.getAge());
                return;
            }
        }
        System.out.println("Nie ma takiego pracownika");
    }
}