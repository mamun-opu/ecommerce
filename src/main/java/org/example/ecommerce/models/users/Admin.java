package org.example.ecommerce.models.users;

public class Admin extends User{

    public Admin(String id, String name, String email){
        super(id, name, email);
    }

    @Override
    public void viewDashboard() {
        System.out.println("Admin Dashboard: Manage users, products, orders");
    }

}