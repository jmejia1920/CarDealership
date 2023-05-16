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
    public static ArrayList<Dealership> dealerships = new ArrayList<>();

    public static void vehicleInventory(String fileName) throws IOException {
        try{
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = "";
        boolean isFirstLine= true;
        while((line = reader.readLine()) != null){
            if(isFirstLine){
                isFirstLine= false;
                continue;
            }
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
        public static void getDealership(String fileName){
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line= "";
            while((line = br.readLine())!=null ){
                String[] parts = line.split("\\|");
                String name = parts[0];
                String address = parts [1];
                String phone = parts [2];
                dealerships.add(new Dealership(name, address,phone));


            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        }
    }

