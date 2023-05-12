package com.learntocode;

import javax.sound.sampled.Line;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DealershipFileManager {
    private static final String File_Name = "dealership.csv";
    public static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void getDealerships(String fileName) throws IOException {
        try{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = "";
        while((line = reader.readLine()) != null){
            String[] parts = line.split("\\|");
            int vin  = Integer.parseInt(parts[0]);
            int year = Integer.parseInt(parts[1]);
            String make = parts[2];
            String model = parts[3];
            String vehicleType = parts[4];
            String color = parts [5];
            int odometer = Integer.parseInt(parts[6]);
            double price = Double.parseDouble(parts[7]);
            vehicles.add(new Vehicle(vin,year,make,model,vehicleType,color,odometer,price));
        }
            reader.close();
        } catch (IOException e) {
            System.out.println("Sorry something went wrong.");
        }
        }
    }

