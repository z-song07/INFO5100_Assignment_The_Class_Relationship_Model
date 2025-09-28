/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author csong
 */
public class VehicleServiceManager {
    private VehicleDirectory vehicleDirectory;
    private ServiceCatalog serviceCatalog;
    
    public VehicleServiceManager() {
        this.vehicleDirectory = new VehicleDirectory();
        this.serviceCatalog = new ServiceCatalog();
        
        //generate sample data
        populateSameData();
    }

    private void populateSameData() {
        //populate services
        Service s1 = serviceCatalog.addService();
        s1.setServiceType("Oil Change");
        s1.setCost(60);
        s1.setMechanicName("Bob Smith");
        s1.setServiceDuration(2);
        
        Service s2 = serviceCatalog.addService();
        s2.setServiceType("Car Wash");
        s2.setCost(20);
        s2.setMechanicName("Amy Doe");
        s2.setServiceDuration(1);
        
        Service s3 = serviceCatalog.addService();
        s3.setServiceType("Puncture");
        s3.setCost(60);
        s3.setMechanicName("Jack Kim");
        s3.setServiceDuration(2);
        
        //populate Owners
        Owner owner1 = new Owner();
        owner1.setOwnerFirstName("Alex");
        owner1.setOwnerLastName("Lee");
        
        Owner owner2 = new Owner();
        owner2.setOwnerFirstName("Samantha");
        owner2.setOwnerLastName("Davis");
        
        Owner owner3 = new Owner();
        owner3.setOwnerFirstName("David");
        owner3.setOwnerLastName("Johnson");
        
        Owner owner4 = new Owner();
        owner4.setOwnerFirstName("Bob");
        owner4.setOwnerLastName("Garcia");
        
        Owner owner5 = new Owner();
        owner5.setOwnerFirstName("Emily");
        owner5.setOwnerLastName("Brown");
        
        //populate Vehicles
        Vehicle v1= vehicleDirectory.addVehicle();
        v1.setMake("Honda");
        v1.setModel("Civic");
        v1.setYear(2019);
        v1.setRegistrationNumber("HJYS123");
        v1.setServiceOpted(s1);
        v1.setOwner(owner1);
        
        Vehicle v2= vehicleDirectory.addVehicle();
        v2.setMake("Toyota");
        v2.setModel("Camry");
        v2.setYear(2019);
        v2.setRegistrationNumber("GSJ873");
        v2.setServiceOpted(s1);
        v2.setOwner(owner2);
        
        Vehicle v3= vehicleDirectory.addVehicle();
        v3.setMake("Honda");
        v3.setModel("Civic");
        v3.setYear(2020);
        v3.setRegistrationNumber("BBSH123");
        v3.setServiceOpted(s3);
        v3.setOwner(owner3);
        
        Vehicle v4= vehicleDirectory.addVehicle();
        v4.setMake("Tesla");
        v4.setModel("Model Y");
        v4.setYear(2024);
        v4.setRegistrationNumber("ABC456");
        v4.setServiceOpted(s2);
        v4.setOwner(owner4);
        
        Vehicle v5= vehicleDirectory.addVehicle();
        v5.setMake("Ford");
        v5.setModel("Fusion");
        v5.setYear(2021);
        v5.setRegistrationNumber("NMC725");
        v5.setServiceOpted(s3);
        v5.setOwner(owner5);
    }
    
    public VehicleDirectory getVehicleDirectory() {
        return vehicleDirectory;
    }

    public ServiceCatalog getServiceCatalog() {
        return serviceCatalog;
    }
}
