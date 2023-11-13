package Vehicles;

import com.b_k.Goods;

abstract class Vehicle implements Transportable{
    protected Goods goods;
    private int capacity;
    private String brand;

    public Vehicle(int capacity, String brand) {
        this.capacity = capacity;
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Pojazd" +
                " pojemność: " + capacity +
                ", marka: " + brand;
    }

    @Override
    public void loadGoods(Goods goods) {
        this.goods = goods;
        System.out.println("Załadowano towar: " + goods.getType());
    }

    @Override
    public void unloadGoods() {
        if (goods != null) {
            System.out.println("Wyładowano towar: " + goods.getType());
            goods = null;
        }
        else
        {
            System.out.println("Brak towaru do wyładowania.");
        }
    }
}
