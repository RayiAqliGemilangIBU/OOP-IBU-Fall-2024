package week10.firstTask;

@UserPermission(value = 0)
public class User {
    private String username;

    public User(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
}
