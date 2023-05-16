package com.learntocode;

import java.util.ArrayList;

import static com.learntocode.DealershipFileManager.vehicles;

public class UserInterface {
    private static int numVehicles = 6;
    private static void display(){
        System.out.println("Welcome to the dealership.");
        System.out.println("===================================");
        System.out.println("1 - Find vehicles within price ");


       for (Vehicle vehicles: vehicles);
    }
    private static void getByPriceRequest(){
        for (Vehicle vehicles : vehicles){

        }
    }
    private static void getByMakeModelRequest(String make, String model){
        boolean found = false;

        for(int i = 0; i< numVehicles; i++){
            if (vehicles.get(i).getMake().equalsIgnoreCase(make)){
                found= true;
            }
        }

    }
    public static void getByYearRequest(String min, String max){
        for(Vehicle vehicles:vehicles){
        }
        }

    private static void getByColorRequest(){

    }
    private static void getMileageRequest(){

    }
    private static void getByVehicleTypeRequest(){

    }
    private static void getAllVehiclesRequest(){

    }
    private static void addVehiclesRequest(){

    }
    private static void removeVehicleRequest(){

    }
}
