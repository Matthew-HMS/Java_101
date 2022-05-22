public class MemberManagement {
    public static void main(String [] args){
        Club c = new Club();
        Member m1 = (new Member("John", 200));
        Member m2 = (new Member("Mary", 500));
        Member m3 = (new Member("Helen", 100));
        Member m4 = (new Member("Peter", 300));
        c.addMember(m1);
        c.addMember(m2);
        c.addMember(m3);
        c.removeMember(m2);
        c.removeMember(m4);
        System.out.printf("The club now has %d members.\n", c.getCount());
        System.out.print(c);
        System.out.println("Total revenue from membership fee : " + c.totalFees());
    }
}
