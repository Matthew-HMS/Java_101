import java.util.*;

public class Register {//can't repeat account
    
    private Users users [] = new Users[30];
    Scanner s = new Scanner(System.in);

    public Users register(){
        System.out.print("Your national ID : ");
        String account = s.nextLine();
        System.out.print("Your account password : ");
        String password = s.nextLine();
        System.out.print("Your name : ");
        String name = s.nextLine();
        System.out.print("Your email : ");
        String email = s.nextLine();
        System.out.print("Your phone number: ");
        String phone = s.nextLine();
        System.out.print("Your identity : ");
        String identity = s.nextLine();
        if (account == "" || password == "" || name == "" || email == "" || phone == "" || identity == ""){
            System.out.println("Register failed! You didn't input all information required.");
            return null;
        }
        if (identity != "Admin" && identity != "Student" && identity != "Teacher" && identity != "Staff"){
            System.out.println("Register failed! Your identity is not correct.");
            return null;
        }
        else {
            Users user = new Users(account, password, name, email, phone, identity);
            System.out.println("You have successfully registered!");
            System.out.println(account + " " + password + " " + name + " " + email + " " + phone + " " + identity);
            for(int i = 0; i < users.length; i++){
                if(users[i] == null){
                    users[i] = user;
                    break;
                }
            }
            return user;
        }
    }
    
    public int login(){
        
        System.out.println("Please input your account number : ");
        String account = s.nextLine();
        for(int i = 0; i < users.length; i++){
            if(users[i] != null){
                if(users[i].getAccount().equals(account)){
                    System.out.println("Please input your password : ");
                    String password = s.nextLine();
                    if(users[i].getPassword().equals(password)){
                        System.out.println("Login successfully!");
                        return 1;
                    }
                    else{
                        System.out.println("Wrong password!");
                        return 0;
                    }
                }
                
            }
            
        }
        System.out.println("No such account!");
        return 0;
    }
    public String toString(){
        String output = "";
        for(int i = 0; i < users.length; i++){
            if(users[i] != null){
                output += users[i].toString() + "\n";
            }
        }
        return output;
    }
}
