package Btnhom.DTO;

public class Account {
    private int id,  employeeId;
    private String username, password, name;
    
    public Account() {
        
    }
    
    public Account(int id, String username, String password, String name, int employeeId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.employeeId = employeeId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    
}
