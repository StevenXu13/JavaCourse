public class CartItem {
    Merchandise merchandise;
    int quantity;
    public CartItem(Merchandise merchandise, int quantity) {
        this.merchandise = merchandise;
        this.quantity = quantity;
    }
    // 获取购物车项中的商品
    public Merchandise getMerchandise() {
        return merchandise;
    }

    // 获取购物车项中的商品数量
    public int getQuantity() {
        return quantity;
    }

    // 增加购物车项中的商品数量
    public void increaseQuantity(int quantity) {
        if (quantity <= merchandise.stock) {
            this.quantity += quantity;
        } else {
            System.out.println("商品库存不足！");
        }
    }
    //减少购物车项中的商品数量
    public void decreaseQuantity(int quantity) {
        if (quantity <= this.quantity) {
            this.quantity -= quantity;
        } else {
            this.quantity = 0;
        }
    }
}
