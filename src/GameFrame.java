import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {

    public static JFrame frame;
    private JLabel moneyLabel;
    private JLabel moneyPerSecondLabel;
    private JButton clickButton;

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

        BoxLayout boxLayout = new BoxLayout(clickerPanel, BoxLayout.PAGE_AXIS);

        GridLayout gridLayout = new GridLayout(3, 1);
        clickerPanel.setLayout(boxLayout);

        // Blank space
        JLabel blankLabel = new JLabel("");
        blankLabel.setBackground(Color.DARK_GRAY);
        blankLabel.setMaximumSize(new Dimension(100, 150));
        clickerPanel.add(blankLabel);

        // Money text
        moneyLabel = Main.getMoneyLabel();
        moneyLabel.setForeground(Color.WHITE);
        moneyLabel.setMaximumSize(new Dimension(800, 100));
        moneyLabel.setFont(new Font("", Font.BOLD, 40));
        moneyLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        moneyLabel.setHorizontalAlignment(SwingConstants.CENTER);

        clickerPanel.add(moneyLabel, boxLayout);

        // Money per second text
        moneyPerSecondLabel = Main.getMoneyPerSecondLabel();
        moneyPerSecondLabel.setForeground(Color.WHITE);
        moneyPerSecondLabel.setMaximumSize(new Dimension(600, 100));
        moneyPerSecondLabel.setFont(new Font("", Font.BOLD, 20));
        moneyPerSecondLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        moneyPerSecondLabel.setHorizontalAlignment(SwingConstants.CENTER);

        clickerPanel.add(moneyPerSecondLabel, boxLayout);

        // Clicker button
        clickButton = Main.getClickerButton();
        clickButton.setBackground(Color.LIGHT_GRAY);
        clickButton.setForeground(Color.WHITE);
        clickButton.setFont(new Font("", Font.BOLD, 20));
        clickButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        clickButton.setMaximumSize(new Dimension(160, 80));
        clickerPanel.add(clickButton, boxLayout);

        mainPanel.add(clickerPanel, BorderLayout.CENTER);


        // Extra panel
        JPanel extraPanel = new JPanel();
        extraPanel.setBackground(Color.DARK_GRAY);
        extraPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE));


        mainPanel.add(extraPanel, BorderLayout.EAST);

        this.pack();
    }

    public void refreshUI()
    {
        moneyLabel.setText("MONEY UPDATE");
        moneyPerSecondLabel.setText("MONEY PER SECOND UPDATE");
    }
}
