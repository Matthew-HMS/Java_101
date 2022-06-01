public class Users {
    private String name;
    private String password;
    private String account;//ID
    private String identity;//Admim or member
    private String email;
    private String phone;

    
    public Users(){}
    public Users(String account, String password, String name, String email, String phone, String identity){
        setAccount(account);
        setPassword(password);
        setName(name);
        setEmail(email);
        setPhone(phone);
        setIdentity(identity);
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        return password;
    }
    public void setAccount(String account){
        this.account = account;
    }
    public String getAccount(){
        return account;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public void setIdentity(String identity){
        this.identity = identity;
    }
    public String getIdentity(){
        return identity;
    }

    public void logout(){}
    public void searchBook(){}
    public void borrowBook(){}
    public void returnBook(){}
    public void viewInfo(){}
    public void payFine(){}
    public void addBook(){}
    public void EditBook(){}
    public void DeleteBook(){}


    
}