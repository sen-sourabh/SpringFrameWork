package MainTest;

import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext  ap = new ClassPathXmlApplicationContext("resource/spring.xml");
        Car c1 = (Car)ap.getBean("cf");
        c1.drive();
    }
}
