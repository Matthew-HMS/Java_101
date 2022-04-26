import java.util.Scanner;
import java.util.Arrays;

public class Test{
    public static void main(String [] args){
        System.out.print("Enter six integers, seperated by spaces: ");
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[6];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        Arrays.sort(numbers);

        for(int i = numbers.length-1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
    }
}