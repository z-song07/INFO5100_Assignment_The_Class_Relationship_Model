/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author csong
 */
public class VehicleIdGenerator {
    private static int counter = 0;
    public static String getNextUniqueId() {
        counter++;
        return "V" + String.format("%03d", counter);
    }
}
