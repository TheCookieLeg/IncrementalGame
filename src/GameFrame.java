import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame {

    public GameFrame() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1280, 720));


        //Main Panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        this.add(mainPanel);
        getContentPane().setBackground(Color.DARK_GRAY);

        // Title panel
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.DARK_GRAY);
        JLabel titleLabel = new JLabel("Very original incremental game");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("", Font.BOLD, 40));
        titlePanel.add(titleLabel);
        mainPanel.add(titlePanel, BorderLayout.NORTH);

        // Upgrades panel
        JPanel upgradesPanel = new JPanel();
        upgradesPanel.setBackground(Color.DARK_GRAY);
        JLabel upgradesLabel = new JLabel("Upgrades go here");
        upgradesLabel.setForeground(Color.WHITE);
        upgradesLabel.setFont(new Font("", Font.BOLD, 20));
        upgradesPanel.add(upgradesLabel);
        mainPanel.add(upgradesPanel, BorderLayout.WEST);

        // Clicker Panel
        JPanel clickerPanel = new JPanel();
        clickerPanel.setBackground(Color.DARK_GRAY);
        clickerPanel.setLayout(new BoxLayout(clickerPanel, BoxLayout.Y_AXIS));

        clickerPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 3;
        c.insets = new Insets(10, 10, 10, 10);
        c.anchor = GridBagConstraints.CENTER;

        JLabel moneyLabel = new JLabel("<html> <div style='width:500px;'> Money here! </div> </html>");
        moneyLabel.setForeground(Color.WHITE);
        moneyLabel.setFont(new Font("", Font.BOLD, 20));
        clickerPanel.add(moneyLabel);
        mainPanel.add(clickerPanel, BorderLayout.CENTER);




        pack();
    }

}
