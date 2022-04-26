import java.util.Scanner;
import java.util.Arrays;

public class EXE2019_8{
    public static void main(String [] args){
        System.out.print("Enter six integers, seperated by spaces: ");
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[6];
        String nums = input.nextLine();
        String Strnums[] = nums.split(" ");
        for(int i = 0; i < Strnums.length; i++){
            numbers[i] = Integer.parseInt(Strnums[i]);
        }

        Arrays.sort(numbers);

        for(int i = numbers.length-1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
    }
}