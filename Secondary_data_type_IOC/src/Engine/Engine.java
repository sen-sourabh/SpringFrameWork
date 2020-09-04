package Engine;

public class Engine {
    private int modelyear;

    Engine() {
        System.out.println("This is Engine.");
    }
    
    public void setModelyear(int modelyear) {
        this.modelyear = modelyear;
    }
    
    public int getModelyear() {
        return modelyear;
    }
}
