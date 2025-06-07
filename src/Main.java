import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main {

    public static JFrame frame;

    private static JButton clickerButton = new JButton("Click Me");

    private static JLabel moneyLabel = new JLabel("Money text");
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new GameFrame();
                frame.setVisible(true);
                //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            }
        });
    }

    public static JButton getClickerButton() {return clickerButton;}


}
