package beans;

public class Car {
    private Enigne engine;
    
    public void setEnigne(Enigne engine) {
        this.engine = engine;
    }
    
    public void printData() {
        System.out.println("Enigne:" + engine.getModelyear());
    }
    
}
