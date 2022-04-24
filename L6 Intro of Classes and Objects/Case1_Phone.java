import javax.swing.JOptionPane;

public class Case1_Phone {

    private int salesTotal = 0;

    public void setSalesTotal(int salesTotal) {
        this.salesTotal = salesTotal;
    }
    public int getSalesTotal() {
        return salesTotal;
    }

    public void buy() {
        int amout = Integer.parseInt(JOptionPane.showInputDialog("How many phones do you want to buy?"));
        if (amout > 0) {
            JOptionPane.showMessageDialog(null, "You have bought " + amout + " phones.");
            salesTotal += amout;
        } 
        else {
            JOptionPane.showMessageDialog(null, "You have not bought any phones.");
        }
        
    }

    
    
}
