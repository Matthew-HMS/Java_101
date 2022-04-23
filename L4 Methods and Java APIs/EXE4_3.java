import java.util.Random;

public class EXE4_3 {

    Random r = new Random();
    public void roll(){
        System.out.println("Rolling...");
        int num = r.nextInt(6) + 1;
        System.out.println("You rolled a " + num);
    }
}
