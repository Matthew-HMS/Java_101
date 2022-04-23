import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;

public class EXE4_4 {
    public static void main(String [] args){
        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "1. guess number\n2. lottery\n3. exit program"));
        switch(option){
            case 1:
                guessNumber();
                break;
            case 2:
                lottery();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
    public static void guessNumber(){
        Random r = new Random();
        int ans = r.nextInt(42) + 1;
        int guess = 0;
        String input = JOptionPane.showInputDialog(null, "Guess a number between 1 and 42");
        do{
            
            guess = Integer.parseInt(input);
            
            if(guess == ans){
                JOptionPane.showMessageDialog(null, "You guessed right!");
            }
            else if(guess > ans){
                input = JOptionPane.showInputDialog(null, "You guessed wrong!\n The number is lower than " + guess);
            }
            else{
                input = JOptionPane.showInputDialog(null, "You guessed wrong!\n The number is higher than " + guess);
            }
        }while(guess != ans);
    }
    public static void lottery(){
        Random r = new Random();
        int ans[] = new int[6];
        int guess[] = new int[6];
        ArrayList<Integer> correct = new ArrayList<Integer>();

        int count = 0;
        for(int i = 0; i < ans.length; i++){
            ans[i] = r.nextInt(42) + 1;
            for(int j = i-1; j >= 0; j--){
                if(ans[i] == ans[j]){
                    ans[i] = r.nextInt(42) + 1;
                    j = i-1;
                }
                
            }
        }
        Arrays.sort(ans);
        String input = JOptionPane.showInputDialog(null, "Guess 6 numbers between 1 and 42");
        String[] inputArray = input.split(" ");

        for(int i = 0; i < inputArray.length; i++){
            guess[i] = Integer.parseInt(inputArray[i]);
        }
        Arrays.sort(guess);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans.length; j++){
                if(ans[i] == guess[j]){
                    count++;
                    correct.add(ans[i]);
                }
            }
        }
        String output = "Lottery numbers : ";
        for(int value : ans){
            output += value + " ";
        }
        output += "\nYour numbers : ";
        for(int value : guess){
            output += value + " ";
        }
        output +=  "\nYou guessed " + count + " numbers correctly\n" + ((count != 0) ? "The numbers are : " : "Maybe come back next time");
        for(int value : correct){
            output += value + " ";
        }
        JOptionPane.showMessageDialog(null, output);
    }
}
