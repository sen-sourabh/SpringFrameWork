package MainTest;

import beans.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
        Test t = (Test) ap.getBean("t");
        t.printData();
    }
}
