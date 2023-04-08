public class User {

    private String user = "User.01";
    private String password = "9022003";
    

    //Métodos GET

    public String getUser(){
        return user;
    }
    public String getPass(){
        return password;
    }

    //Métodos SET

    public void setUser(String newUser){
        this.user = newUser;
    }
    public void setPass(String newPassword){
        this.password = newPassword;
    }    
}
