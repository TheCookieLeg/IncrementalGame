import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Upgrade {
    static DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
    static DecimalFormat df = new DecimalFormat("0.00", symbols);
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
        upgradeButton.setSize(new Dimension(80, 50));
    }

    public JButton getUpgradeButton() {return upgradeButton;}
    public String getNameOfUpgrade() {return nameOfUpgrade;}
    public double getCostPerUpgrade() {return costPerUpgrade;}
    public double getAmountPerUpgrade() {return amountPerUpgrade;}

    public void increaseCost() {this.costPerUpgrade *= 1.1;}

    public void setUpgradeButtonText(double d) {
        costPerUpgrade = Math.round(costPerUpgrade*100) / 100;
        upgradeButton.setText(df.format(costPerUpgrade));
    }
}
