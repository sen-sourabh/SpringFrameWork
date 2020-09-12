package MainTest;

import beans.Bus;
import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        
        ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
        Car car = (Car) ap.getBean("c");
        car.printData();
//        Bus bs = (Bus) ap.getBean("b");
//        bs.printDat();
    }
}
