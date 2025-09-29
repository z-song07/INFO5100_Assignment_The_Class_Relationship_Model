/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author csong
 */
public class VehicleDirectory {
    
    private ArrayList<Vehicle> vehicles;
    
    public VehicleDirectory() {
        this.vehicles = new ArrayList<Vehicle>();
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }
    
    public Vehicle addVehicle() {
        Vehicle v = new Vehicle();
        vehicles.add(v);
        return v;
    }
    
    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
    
    public ArrayList<Vehicle> searchVehicles(String queryStr) {
        ArrayList<Vehicle> results = new ArrayList<Vehicle>();
        
        // check if search by Vehicle ID
        if (validVehicleID(queryStr)) {
            for(Vehicle v: vehicles) {
                if(v.getVehicleID().equalsIgnoreCase(queryStr));
                results.add(v);
                //ID is unique
                return results; 
            }
        } else {
        // check if search by Vehicle Name/Model
            for (Vehicle v: vehicles) {
                if(v.getModel().equalsIgnoreCase(queryStr) || v.getMake().equalsIgnoreCase(queryStr)){
                    results.add(v);
                }
            }
        }
        return results;
    }

    private boolean validVehicleID(String str) {
        // check valid vehicle ID by regex
        return str.matches("V\\d{3}");
    }
}
