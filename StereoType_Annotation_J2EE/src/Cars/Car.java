package Cars;

import Engines.Engine;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;

@Component
//@Named // 'javax.inject.Named' used in J2EE annotation and replace @component
public class Car {
    @Resource
    private Engine engine;
    
    public void printData() {
        System.out.println("EngName: " + engine.getEngname());
    }
}