import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Locale;

public class Main {


    public static JFrame frame;
    private static double m = 0;
    private static JLabel moneyLabel = new JLabel(m + ",-");
    private static JLabel moneyPerSecondLabel = new JLabel("0,-/s");
    private static JButton clickerButton = new JButton("Click Me");

    public static Upgrade upgrade;
    public static ArrayList<Upgrade> upgradeButtons = new ArrayList<Upgrade>();

    public static void main(String[] args) {

        clickerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Incremental.addClickMoney();
            }
        });


        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new GameFrame();
                frame.setVisible(true);
                //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);


            }
        });


        upgradeButtons.add(new Upgrade("Clicker", 1, 10));
        upgradeButtons.add(new Upgrade("Manual labor", 0.5, 20));
        upgradeButtons.add(new Upgrade("Assembly lines", 5, 100));
        upgradeButtons.add(new Upgrade("Assembly robots", 50, 1000));
        upgradeButtons.add(new Upgrade("Quantum computing", 500, 10000));
        upgradeButtons.add(new Upgrade("Artifical Intelligence", 5000, 100000));
        upgradeButtons.add(new Upgrade("Cookies as encouragement", 100000, 1000000));

        upgradeButtons.get(0).getUpgradeButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Incremental.spendMoney(upgradeButtons.get(0).getCostPerUpgrade())) {
                    Incremental.addMoneyPerClick(1);
                    upgradeButtons.get(0).increaseCost();
                    upgradeButtons.get(0).setUpgradeButtonText(upgradeButtons.get(0).getCostPerUpgrade());
                }
            }
        });

        for (int j = 1; j < upgradeButtons.size(); j++)
        {
            int index = j;
            upgradeButtons.get(index).getUpgradeButton().addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (Incremental.spendMoney(upgradeButtons.get(index).getCostPerUpgrade())) {
                        Incremental.addIncremental(upgradeButtons.get(index).getAmountPerUpgrade());
                        upgradeButtons.get(index).increaseCost();
                        upgradeButtons.get(index).setUpgradeButtonText(upgradeButtons.get(index).getCostPerUpgrade());
                    }
                }
            });
        }

        Thread moneyThread = new Incremental();
        moneyThread.start();
    }


    // Getters
    public static JLabel getMoneyLabel() {return moneyLabel;}
    public static JLabel getMoneyPerSecondLabel() {return moneyPerSecondLabel;}
    public static JButton getClickerButton() {return clickerButton;}

    // Setters
    public static void setMoneyLabel(String s) {moneyLabel.setText(s + ",-");}
    public static void setMoneyPerSecondLabel(double d) {moneyPerSecondLabel.setText(d + ",-/s");}

}
