package SguTask;


public class User {
    public String[] users = new String[] {"lof", "popo", "loko", "", ""};
    String pass = "lof2";
    String currentUser;
    

    
    public boolean enter(String login1, String password) {
    boolean result = false;
    if(users.equals(login1) && pass.equals(password)) {
        result = true;}
    
    return result;
    }
    
}
