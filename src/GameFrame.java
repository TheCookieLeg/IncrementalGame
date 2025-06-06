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
        titlePanel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        JLabel titleLabel = new JLabel("Very original incremental game");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("", Font.BOLD, 40));
        titlePanel.add(titleLabel);
        mainPanel.add(titlePanel, BorderLayout.NORTH);

        // Upgrades panel
        JPanel upgradesPanel = new JPanel();
        upgradesPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        upgradesPanel.setBackground(Color.DARK_GRAY);
        JLabel upgradesLabel = new JLabel("Upgrades go here");
        upgradesLabel.setForeground(Color.WHITE);
        upgradesLabel.setFont(new Font("", Font.BOLD, 20));
        upgradesPanel.add(upgradesLabel);
        mainPanel.add(upgradesPanel, BorderLayout.WEST);

        // Clicker Panel
        JPanel clickerPanel = new JPanel();
        clickerPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        clickerPanel.setBackground(Color.DARK_GRAY);

        GridLayout gridLayout = new GridLayout(3, 1);
        clickerPanel.setLayout(gridLayout);

        // Money text
        JLabel moneyLabel = new JLabel("<html> <div style='width:500px;'> Money here! </div> </html>");
        moneyLabel.setForeground(Color.WHITE);
        moneyLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        moneyLabel.setFont(new Font("", Font.BOLD, 20));
        moneyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clickerPanel.add(moneyLabel, gridLayout);

        // Money per second text
        JLabel moneyPerSecondLabel = new JLabel("<html> <div style='width:500px;'> Money per second! </div> </html>");
        moneyPerSecondLabel.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        moneyPerSecondLabel.setForeground(Color.WHITE);
        moneyPerSecondLabel.setFont(new Font("", Font.BOLD, 14));
        clickerPanel.add(moneyPerSecondLabel, gridLayout);

        // Clicker button
        JButton clickButton = new JButton("Click Me");
        clickButton.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        clickButton.setBackground(Color.DARK_GRAY);
        clickButton.setForeground(Color.WHITE);
        clickButton.setFont(new Font("", Font.BOLD, 20));
        clickerPanel.add(clickButton, gridLayout);

        mainPanel.add(clickerPanel, BorderLayout.CENTER);


        // Extra panel
        JPanel extraPanel = new JPanel();
        extraPanel.setBackground(Color.DARK_GRAY);
        extraPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE));


        mainPanel.add(extraPanel, BorderLayout.EAST);


        pack();
    }

}
