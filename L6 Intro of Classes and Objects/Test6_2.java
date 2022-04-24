public class Test6_2 {
    public static void main(String[] args) {
        EXE6_2 account = new EXE6_2("John", 12345, 100.0);
        System.out.println(account);
        account.deposit(995.5);
        System.out.println(account);
        account.withdraw(800);
        System.out.println(account);
    }
}
