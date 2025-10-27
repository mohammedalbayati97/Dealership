package com.pluralsight;

public class Program {
    public static void main(String[] args) {
        DealershipFileManager fileManager = new DealershipFileManager();
        Dealership dealership = fileManager.getDealership();

        System.out.println("Dealership: " + dealership.getName());
        System.out.println("Cars loaded: " + dealership.getAllVehicles().size());
    }
}