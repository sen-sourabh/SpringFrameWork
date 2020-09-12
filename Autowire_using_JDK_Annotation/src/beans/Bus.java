/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author Sourabh
 */
public class Bus {
    private Enigne engine;
    
    public void printDat() {
        System.out.println("Engine bus: "+engine.getModelyear());
    }
}
