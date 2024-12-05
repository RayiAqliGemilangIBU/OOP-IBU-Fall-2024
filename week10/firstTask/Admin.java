package week10.firstTask;

@UserPermission(value = 1)
public class Admin {
    private String username;

    public Admin(String username){
        this.username = username;
    }
    public String getUsername(){
        return username;
    }
}
