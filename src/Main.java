import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class Main {

    public static JFrame frame;
    private static double m = 0;
    private static JLabel moneyLabel = new JLabel(m + ",-");
    private static JLabel moneyPerSecondLabel = new JLabel("0,-/s");
    private static JButton clickerButton = new JButton("Click Me");

    private static ArrayList<Upgrade> upgradeButtons = new ArrayList<Upgrade>();

    public static void main(String[] args) {

        clickerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Incremental.addMoney(1);
            }
        });

        upgradeButtons.add(new Upgrade("Clicker", 10, 1));

        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new GameFrame();
                frame.setVisible(true);
                //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }


    // Getters
    public static JLabel getMoneyLabel() {return moneyLabel;}
    public static JLabel getMoneyPerSecondLabel() {return moneyPerSecondLabel;}
    public static JButton getClickerButton() {return clickerButton;}

    // Setters
    public static void setMoneyLabel(double d) {moneyLabel.setText(d + ",-");}
    public static void setMoneyPerSecondLabel(double d) {moneyPerSecondLabel.setText(d + ",-/s");}

}
