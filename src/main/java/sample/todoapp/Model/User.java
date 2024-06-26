package sample.todoapp.Model;

public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String location;
    private String gender;

    public User(){

    }
    public User( String firstName, String lastName,
        String userName, String password, String location, String gender){
        this.firstName =firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.location = location;
        this.password = password;
        this.gender =gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getLocation() {
        return location;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
