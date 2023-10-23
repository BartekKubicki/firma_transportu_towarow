public class Truck extends Vehicle{
    private int capacity;
    private String brand;

    public Truck(int capacity, String brand) {
        this.capacity = capacity;
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }
}
