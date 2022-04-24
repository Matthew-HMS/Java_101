import javax.swing.JOptionPane;

public class Case1_Selling {
    public static void main(String[] args) {
        Case1_Camera camera = new Case1_Camera();
        Case1_Phone phone = new Case1_Phone();
        String options[] = {"Camera", "Phone","Exit"};
        String output = "";
        int response,next = 0;
        do{
            response = JOptionPane.showOptionDialog(null, "Buy which product?", "LaLa Store", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
            switch(response){
                case 0:
                    camera.buy();
                    next = JOptionPane.showConfirmDialog(null, "Next customer?", "LaLa Store", JOptionPane.YES_NO_OPTION);
                    break;
                case 1:
                    phone.buy();
                    next = JOptionPane.showConfirmDialog(null, "Next customer?", "LaLa Store", JOptionPane.YES_NO_OPTION);
                    break;
                case 2:
                    output = "You have sold " + camera.getSalesTotal() + " cameras. The total income is $" + camera.getSalesTotal() * 15000.0 + ".\n" +
                    "You have sold " + phone.getSalesTotal() + " phones. The total income is $" + phone.getSalesTotal() * 9000.0 + ".\n";
                    JOptionPane.showMessageDialog(null, output);
                    System.exit(0);
                    break;
            }
        }while(next == 0);
        output = "You have sold " + camera.getSalesTotal() + " cameras. The total income is $" + camera.getSalesTotal() * 9000.0 + ".\n" +
        "You have sold " + phone.getSalesTotal() + " phones. The total income is $" + phone.getSalesTotal() * 15000.0 + ".\n";
        JOptionPane.showMessageDialog(null, output);

        System.exit(0);
        
    }
}
