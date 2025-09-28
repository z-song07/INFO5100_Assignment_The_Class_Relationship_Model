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
public class ServiceCatalog {
    
    private ArrayList<Service> services;
    
    public ServiceCatalog() {
        this.services = new ArrayList<Service>();
    }

    public ArrayList getServices() {
        return services;
    }

    public void setServices(ArrayList services) {
        this.services = services;
    }
    
    public Service addService() {
        Service s = new Service();
        services.add(s);
        return s;
    }
    
    public void removeService(Service serv) {
        services.remove(serv);
    }
}
