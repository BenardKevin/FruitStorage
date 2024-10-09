public class Main {
    public static void main(String[] args) {
        String ex1 = laGardeDesFruits(120);
        System.out.println(ex1);
    }

    public static String laGardeDesFruits(int stock) {
        final int MIN_STOCK = 100;
        if (stock < MIN_STOCK) return "Need to buy more !";
        return "Stock is good.";
    }
}
