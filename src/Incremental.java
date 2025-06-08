public class Incremental {
    private static double money = 0.0;

    public static void addMoney(double d) {
        money += d;
        Main.setMoneyLabel(money);
    }

    public static void spendMoney(double cost) {
        if (cost < money) {
            money -= cost;
        }
    }
}
