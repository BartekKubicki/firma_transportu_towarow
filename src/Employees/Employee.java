package Employees;

public class Employee implements Comparable<Employee>{
    private String name;
    private String sureName;
    private int age;
    private static boolean licenseToDriveATruck = true;
    private static boolean licenseToDriveAShip = true;

    public Employee(String name, String sureNname, int age, boolean licenseToDriveATruck, boolean licenseToDriveAShip) {
        this.name = name;
        this.sureName = sureNname;
        this.age = age;
        this.licenseToDriveATruck = licenseToDriveATruck;
        this.licenseToDriveAShip = licenseToDriveAShip;
    }

    public String getName() {
        return name;
    }

    public String getSureName() {
        return sureName;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSureNname(String sureNname) {
        this.sureName = sureNname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLicenseToDriveATruck(boolean licenseToDriveATruck) {
        this.licenseToDriveATruck = licenseToDriveATruck;
    }

    public void setLicenseToDriveAShip(boolean licenseToDriveAShip) {
        this.licenseToDriveAShip = licenseToDriveAShip;
    }

    public static boolean isLicenseToDriveATruck() {
        return licenseToDriveATruck;
    }

    public static boolean isLicenseToDriveAShip() {
        return licenseToDriveAShip;
    }

    @Override
    public int compareTo(Employee otherEmployee) {
        return this.getName().compareTo(otherEmployee.getName());
    }
}
