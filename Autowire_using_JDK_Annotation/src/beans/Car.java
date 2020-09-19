package beans;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    @Resource
    private Enigne engine;  //No need to have setters or constructor here.
    public void printData() {
        System.out.println("Enigne:" + engine.getModelyear());
    }
    
}
