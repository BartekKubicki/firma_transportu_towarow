public class DeliveryCar extends Vehicle{
    private int capacity;
    private String brand;

    public DeliveryCar(int capacity, String brand) {
        this.capacity = capacity;
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }
}
