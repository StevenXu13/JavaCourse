public class freefall {
    public static void main(String[] args) {
        int height = 10000;
        for (int i = 0; i < 10; i += 1) {
            height = height >> 1;
        }
        System.out.println(height);
    }
}
