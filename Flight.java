/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiar
 */
public class Flight {
    private Airplane plane;
    private String origin;
    private String destination;
    
    public Flight(Airplane plane, String origin, String destination){
        this.plane = plane;
        this.origin = origin;
        this.destination = destination;
    }
    
    @Override
    public String toString(){
        return this.plane.toString() + " (" + origin + "-" + destination + ")";
    }
    
}
