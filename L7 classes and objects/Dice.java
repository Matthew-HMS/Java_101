

import java.util.Random;

public class Dice {
    
    Random r = new Random();
    public void roll(){
        System.out.println(r.nextInt(40) + 1);
    }
}
