package MainPackage;

import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
        Car c = (Car) ap.getBean("c");
        c.printCarData();
    }
}
