/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.time.LocalDate;

/**
 *
 * @author csong
 */
public class Owner {
    private String ownerID;
    private String ownerFirstName;
    private String ownerLastName;
    private LocalDate serviceDate;

    public LocalDate getServiceDate() {
        return serviceDate;
    }

    public void setServiceDate(LocalDate serviceDate) {
        this.serviceDate = serviceDate;
    }
    
    public Owner() {
        this.ownerID = OwnerIdGenerator.getNextUniqueID();
    }
    
    public String getOwnerID() {
        return ownerID;
    }

//    public void setOwnerID(String ownerID) {
//        this.ownerID = OwnerIdGenerator.getNextUniqueID();
//    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public void setOwnerFirstName(String ownerFirstName) {
        this.ownerFirstName = ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }
    
}
