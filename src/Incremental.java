import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Incremental extends Thread {
    private static double money = 0.0;
    private static double moneyPerSecond = 0.0;

    static DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
    static DecimalFormat df = new DecimalFormat("0.00", symbols);

    public static void addMoney(double d) {
        money += d;
        money = Math.round(money*100.0) / 100.0;

        Main.setMoneyLabel(df.format(money));

    }

    public static boolean spendMoney(double cost) {
        if (cost <= money) {
            money -= cost;
            Main.setMoneyLabel(df.format(money));
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
        // Adds money per second, but does it every 100 miliseconds instead of every second, to make it seem quicker
        // This is why the moneyPerSecond is divided by 10
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
