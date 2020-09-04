package Car;

import Engine.Engine;

public class Car {
    private String carname;
    private Engine engine;
    
    Car() {
        System.out.println("This is Car.");
    }
    
    public void setCarname(String carname) {
        this.carname = carname;
    }
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void printCarData() {
        System.out.println("CarName: "+ carname + ". Engine modelyear: "+engine.getModelyear());
    }
    
}
