abstract class Vehicle implements Transportable{
    protected Goods goods;

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
