public class Test {
    public static void main(String[] args) {
        // 创建商品并初始化库存
        Merchandise oil = new Merchandise("花生油", 60.0, 10);
        Merchandise instantNoodle = new Merchandise("方便面", 5.0, 300);

        // 创建购物车
        Cart cart = new Cart();

        // 添加商品到购物车
        cart.addItem(oil, 60);
        cart.addItem(instantNoodle, 100);

        // 生成订单
        cart.generateOrder();
        System.out.println();

        // 从购物车中删除商品
        cart.removeItem(oil, 30);
        System.out.println("删除花生油");
        cart.generateOrder();
        System.out.println();

        // 清空购物车
        cart.clearCart();
        System.out.println("清空购物车后");
        cart.generateOrder();
        System.out.println();
    }
}
