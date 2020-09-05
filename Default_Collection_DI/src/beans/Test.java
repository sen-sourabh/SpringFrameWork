package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
    private List fruit;
    private Set cricketer;
    private Map ccode;

    public void setCcode(Map ccode) {
        this.ccode = ccode;
    }

    public void setCricketer(Set cricketer) {
        this.cricketer = cricketer;
    }

    public void setFruit(List fruit) {
        this.fruit = fruit;
    }
    
    public void printData() {
        System.out.println("Fruits......");
        for (Object f: fruit) {
            System.out.println(f);
        }
        System.out.println("Cricketers.......");
        for (Object crick: cricketer) {
            System.out.println(crick);
        }
        System.out.println("Country Code.......");
        Set keys = ccode.keySet();
        for(Object key: keys) {
            System.out.println("Country: " + key + "| capital: " + ccode.get(key));
        }
    }
}
