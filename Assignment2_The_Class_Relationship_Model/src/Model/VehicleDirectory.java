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
}
