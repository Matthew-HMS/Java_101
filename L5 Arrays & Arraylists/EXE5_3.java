import java.util.Random;
import java.util.Arrays;

public class EXE5_3 {
    public static void main(String args[]){
        Random r = new Random();
        int num[] = new int[6];
        int temp;
        for(int i = 0; i < num.length; i++){
            
            do{
                temp = r.nextInt(42)+1;
            }while(Arrays.binarySearch(num, temp) >= 0);
            Arrays.sort(num);
            num[0] = temp;
        }
        for(int value : num){
            System.out.print(value + " ");
        }

        
    }
}
