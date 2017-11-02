/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiar
 */
public class Airplane {
    private String planeID;
    private int capacity;
    
    public Airplane(String planeID, int capacity){
        this.capacity = capacity;
        this.planeID = planeID;
    }
    
    @Override
    public String toString(){
        return planeID + " (" + capacity + " ppl)";
    }
    
}
