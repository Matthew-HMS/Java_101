public class Test {
    public static void main(String [] args){
        A a = new A();
        B b = a;
        C c = a;

        c.m2();
        //b.m3();
    }
}
