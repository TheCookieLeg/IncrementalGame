import javax.swing.*;

public class Upgrade {
    private String nameOfUpgrade;
    private double amountPerUpgrade;
    private double costPerUpgrade;
    private double totalAmount;
    private JButton upgradeButton;

    public Upgrade(String nameOfUpgrade, double amountPerUpgrade, double costPerUpgrade) {
        this.nameOfUpgrade = nameOfUpgrade;
        this.amountPerUpgrade = amountPerUpgrade;
        this.costPerUpgrade = costPerUpgrade;

        upgradeButton = new JButton(String.valueOf(amountPerUpgrade));
    }

    private void setUpgradeButton(JButton button) {upgradeButton.setText(String.valueOf(costPerUpgrade));}

    private JButton getUpgradeButton() {return upgradeButton;}
    
    }
