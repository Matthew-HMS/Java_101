import javax.swing.JOptionPane;

public class EXE4_2 {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog(null, "Please enter an English sentence : ");
        int ans = countA(text);
        JOptionPane.showMessageDialog(null, "The number of 'A' is " + ans);

    }
    public static int countA(String txt){
        int count = 0;
        for(int i = 0; i < txt.length(); i++){
            if(txt.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }
}
