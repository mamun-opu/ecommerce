package org.example.ecommerce.models.users;

public abstract class User {
    private String id;
    private String username;
    private String email;

    public User(String id, String username, String email){
        this.id = id;
        this.username = username;
        this.email = email;
    }

    // common method for all users
    public abstract void viewDashboard();

    public String getId(){ return id; }
    public String getName(){ return username; }
    public String getEmail(){ return email; }

}
