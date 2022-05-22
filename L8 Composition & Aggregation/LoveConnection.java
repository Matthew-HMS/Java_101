public class LoveConnection {
    public static void main(String [] args){
        Man m1 = new Man("John",100000);
        Man m2 = new Man("Jay",60000);
        Woman w1 = new Woman("Mary",true);
        Woman w2 = new Woman("Helen",false);

        Couple c1 = new Couple(m1,w1);
        System.out.println(c1);
        c1.changeMan(m2);
        System.out.println(c1);
    }
}
