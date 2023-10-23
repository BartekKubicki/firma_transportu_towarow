public class Ship extends Vehicle{
    private int capacity;
    private String brand;

    public Ship(int capacity, String brand) {
        this.capacity = capacity;
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }
}
