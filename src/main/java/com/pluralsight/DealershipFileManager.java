package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DealershipFileManager {

    private static final String INVENTORY_FILE = "src/main/resources/inventory.csv";

    public Dealership getDealership() {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Dealership dealership = null;




        try
                (BufferedReader reader = new BufferedReader(new FileReader(INVENTORY_FILE))) {


            String header = reader.readLine();
            String[] dealerInfo = header.split("\\|");

            String name = dealerInfo[0];
            String address = dealerInfo[1];
            String phone = dealerInfo[2];

            dealership = new Dealership(name, address, phone, vehicles);


            String line;
            while ((line = reader.readLine()) != null) {
                String[] p = line.split("\\|");

                int vin = Integer.parseInt(p[0]);
                int year = Integer.parseInt(p[1]);
                String make = p[2];
                String model = p[3];
                String type = p[4];
                String color = p[5];
                int odometer = Integer.parseInt(p[6]);
                double price = Double.parseDouble(p[7]);

                Vehicle v = new Vehicle(vin, year, make, model, type, color, odometer, price);
                dealership.addVehicle(v);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + INVENTORY_FILE);
        }

        return dealership;
    }


    }