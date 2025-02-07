package org.example.ecommerce.models.users;

public class Customer extends User{
    public Customer(String id, String username, String email){
        super(id, username, email);
    }

    @Override
    public void viewDashboard(){
        System.out.println("Displaying customer dashboard with order history");
    }
}
