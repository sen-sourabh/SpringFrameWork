package beans;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
    private Vector fruit;
    private TreeSet cricketer;
    private HashMap ccode;

    public void setCcode(HashMap ccode) {
        this.ccode = ccode;
    }

    public void setCricketer(TreeSet cricketer) {
        this.cricketer = cricketer;
    }

    public void setFruit(Vector fruit) {
        this.fruit = fruit;
    }

    
    
    public void printData() {
        System.out.println("Fruits......");
        fruit.forEach((f) -> {
            System.out.println(f);
        });
        System.out.println("Cricketers.......");
        cricketer.forEach((crick) -> {
            System.out.println(crick);
        });
        System.out.println("Country Code.......");
        Set keys = ccode.keySet();
        keys.forEach((key) -> {
            System.out.println("Country: " + key + "| capital: " + ccode.get(key));
        });
    }
}
