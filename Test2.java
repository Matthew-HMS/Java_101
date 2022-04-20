import java.util.Scanner;
public class Test2{
    public static void main(String [] args){
    

    Scanner input = new Scanner(System.in);
    System.out.print( "Enter a number: " );
    int num = input.nextInt();
    
    System.out.printf("%8s","number");
    System.out.printf("%8s","square");
    System.out.printf("%8s","cube");
    System.out.println("");
    

    for(int i = 0; i <= num; i++){
        System.out.printf("%8d",i);
        System.out.printf("%8d",i*i);
        System.out.printf("%8d",i*i*i);
        System.out.println("");
    }
    }
}