package com.b_k;

public class Goods implements Comparable<Goods> {
    private String type;
    private double weight;

    public Goods(String type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Goods otherGoods) {
        return Double.compare(this.weight, otherGoods.weight);
    }
}
