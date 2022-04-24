import java.util.Random;

public class EXE5_1{
    public static void main(String args[]){
        Random r = new Random();
        int num[] = new int[6];
        for(int value : num){
            value = r.nextInt(42)+1;
            System.out.print(value + " ");
        }

        
    }
}