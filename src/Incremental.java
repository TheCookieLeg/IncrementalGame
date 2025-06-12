public class Incremental extends Thread {
    private static double money = 0.0;
    private static double moneyPerSecond = 0.0;

    public static void addMoney(double d) {
        money += d;
        money = Math.round(money*100.0) / 100.0;
        Main.setMoneyLabel(money);
    }

    public static boolean spendMoney(double cost) {
        if (cost <= money) {
            money -= cost;
            Main.setMoneyLabel(money);
            return true;
        } else {
            return false;
        }
    }

    public static void addIncremental(double d) {
        moneyPerSecond += d;
        moneyPerSecond = Math.round(moneyPerSecond * 100.0) / 100.0;
        Main.setMoneyPerSecondLabel(moneyPerSecond);
    }

    @Override
    public void run() {
        while (true) {
            addMoney(moneyPerSecond / 10);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
