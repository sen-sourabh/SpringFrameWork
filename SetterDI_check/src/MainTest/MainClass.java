package MainTest;

import beans.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        String files[] = new String[]{"resource/spring.xml", "resource/engine.xml"};
        ApplicationContext ap = new ClassPathXmlApplicationContext(files);
//        ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
        Car car = (Car) ap.getBean("c");
        car.printData();
    }
}
