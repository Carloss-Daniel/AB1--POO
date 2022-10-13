package entities;

public class User {
    private String name;
    private String password;
  
    public User (String name, String password) {
      this.name = name;
      this.password = password;
    }
  
    public String getName () {
      return this.name;
    }
  
    public String getPassword () {
      return this.password;
    }
  
    private void setName (String name) {
      this.name = name;
    }
  
    private void setPassword (String password) {
      this.password = password;
    }
  }
  
