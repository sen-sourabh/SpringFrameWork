package MainPackage;

import Car.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        
//        CALL/PASS BY REFERENCE
//        String files[] = new String[]{"resource/car.xml", "resource/engine.xml"};
//        ApplicationContext ap = new ClassPathXmlApplicationContext(files);

//        CALL/PASS BY VALUE
        ApplicationContext ap = new ClassPathXmlApplicationContext("resource/car-engine.xml");
        Car car = (Car) ap.getBean("c");
        car.printCarData();
    }
}