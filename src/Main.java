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
                Incremental.addMoney(1);
            }
        });


        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new GameFrame();
                frame.setVisible(true);
                //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);


            }
        });




        upgradeButtons.add(new Upgrade("Clicker", 0.1, 10));
        upgradeButtons.add(new Upgrade("Assembly line", 1, 100));
        upgradeButtons.add(new Upgrade("Turbo clicker", 10, 1000));



        for (int j = 0; j < upgradeButtons.size(); j++)
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
