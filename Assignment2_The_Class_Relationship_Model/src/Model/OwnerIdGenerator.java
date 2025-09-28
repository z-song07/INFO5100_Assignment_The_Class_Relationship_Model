/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author csong
 */
public class OwnerIdGenerator {
    private static int counter = 0;
    
    public static String getNextUniqueID() {
        counter++;
        return "O" + String.format("%03d", counter);
    }
    
}
