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
    
    Bus() {
        System.out.println("Default bus Constructor.");
    }
    public Bus(Enigne engine) {
        System.out.println("Parameter Bus Constructor");
        this.engine = engine;
    }

    public void setEngine(Enigne engine) {
        System.out.println("Setter method");
        this.engine = engine;
    }
    
    public void printDat() {
        System.out.println("Engine bus: "+engine.getModelyear());
    }
}
