import java.util.ArrayList;
import java.util.List;

class Cart {
    List<CartItem> cartItems;

    //初始化购物车
    public Cart() {
        cartItems = new ArrayList<>();
    }

    // 将商品添加到购物车
    public void addItem(Merchandise merchandise, int quantity) {
        CartItem existingItem = findCartItem(merchandise);
        if (existingItem != null) {
            existingItem.increaseQuantity(quantity);
        } else {
            if (quantity >= merchandise.getStock()) {
                cartItems.add(new CartItem(merchandise, merchandise.getStock()));
            } else {
                cartItems.add(new CartItem(merchandise, quantity));
            }
        }
    }

    // 从购物车中删除商品
    public void removeItem(Merchandise merchandise, int quantity) {
        CartItem existingItem = findCartItem(merchandise);
        if (existingItem != null) {
            existingItem.decreaseQuantity(quantity);
            if (existingItem.getQuantity() == 0) {
                cartItems.remove(existingItem);
            }
        }
    }

    // 清空购物车
    public void clearCart() {
        cartItems.clear();
    }

    // 计算购物车中商品的总数量
    public int getTotalQuantity() {
        int totalQuantity = 0;
        for (CartItem item : cartItems) {
            totalQuantity += item.getQuantity();
        }
        return totalQuantity;
    }

    // 计算购物车中商品的总价格
    public double getTotalPrice() {
        double totalPrice = 0.0;
        for (CartItem item : cartItems) {
            totalPrice += item.getMerchandise().getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    // 生成订单
    public void generateOrder() {
        System.out.println("订单详情：");
        for (CartItem item : cartItems) {
            Merchandise merchandise = item.getMerchandise();
            int quantity = item.getQuantity();
            System.out.println("商品名称: " + merchandise.getName() + " 单价: " + merchandise.getPrice() + " 数量: " + quantity);
        }
        System.out.println("总数量: " + getTotalQuantity());
        System.out.println("总价: " + getTotalPrice());
    }

    // 辅助方法：根据商品查找购物车项
    private CartItem findCartItem(Merchandise merchandise) {
        for (CartItem item : cartItems) {
            if (item.getMerchandise() == merchandise) {
                return item;
            }
        }
        return null;
    }
}
