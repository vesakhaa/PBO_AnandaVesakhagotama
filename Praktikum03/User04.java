public class User04 {
    public String username;
    public String emmail;
    public String password;
    public String name;
    

    public void displayInfo() {
        System.out.println("Username: " + username);
        System.out.println("Email: " + emmail);
        System.out.println("Password: " + password);
        System.out.println("Name: " + name);
    }

    public User04(String username, String email) {
        this.username = username;
        this.emmail = email;
        this.password = "polinema123";
    }
}
