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
        upgradeButton = new JButton(String.valueOf(costPerUpgrade));
    }

    public JButton getUpgradeButton() {return upgradeButton;}
    public String getNameOfUpgrade() {return nameOfUpgrade;}
    public double getCostPerUpgrade() {return costPerUpgrade;}
    public double getAmountPerUpgrade() {return amountPerUpgrade;}
}
