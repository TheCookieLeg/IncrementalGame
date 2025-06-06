import javax.swing.*;

public class Main {

    public static JFrame frame;
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new GameFrame();
                frame.setVisible(true);
                //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);


            }
        });
    }

}
