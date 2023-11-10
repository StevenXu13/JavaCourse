public class Merchandise {
    String name;
    double price;
    int stock;
    public Merchandise(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
    //获取商品名称
    public String getName() {
        return name;
    }
    //获取商品价格
    public double getPrice() {
        return price;
    }
    //获取商品库存
    public int getStock() {
        return stock;
    }
    //减少库存
    public void decreaseStock(int quantity) {
        if (quantity <= stock) {
            stock -= quantity;
        } else {
            System.out.println("库存不足！");
        }
    }
}
