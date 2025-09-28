/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author csong
 */
public class Vehicle {
    private String vehicleID;
    private String make;
    private String model;
    private int year;
    private String registrationNumber;
    private Owner owner;
    private Service serviceOpted;
    
    public Vehicle() {
        this.vehicleID = VehicleIdGenerator.getNextUniqueId();
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    
    
    public String getVehicleID() {
        return vehicleID;
    }

//    public void setVehicleID(String vehicleID) {
//        this.vehicleID = vehicleID;
//    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Service getServiceOpted() {
        return serviceOpted;
    }

    public void setServiceOpted(Service serviceOpted) {
        this.serviceOpted = serviceOpted;
    }
    
}
