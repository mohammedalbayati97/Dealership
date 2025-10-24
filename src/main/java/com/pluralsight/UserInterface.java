package com.pluralsight;

public class UserInterface {

    private Dealership dealership;

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    public void display() {
        System.out.println("Dealership App (Phase 1)");
        System.out.println("Menu coming in Phase 2...");
    }
}