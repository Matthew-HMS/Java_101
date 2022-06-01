public class Member extends Users {
    

    public Member(){}
    public Member(String account, String password, String name, String email, String phone, String identity){
        super(account, password, name, email, phone, identity);
    }
    
    public String toString(){
        return getAccount() + " " + getName() + " " + getPhone();
    }
    public void viewInfo(){}
    public void payFine(){}
    
}
