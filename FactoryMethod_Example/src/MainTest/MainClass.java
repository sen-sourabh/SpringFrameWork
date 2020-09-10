package MainTest;

import beans.Test;
import java.util.Calendar;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
        Test t1 = (Test) ap.getBean("t");
        Calendar cal1 = (Calendar) ap.getBean("cal");
        Test t2 = (Test) ap.getBean("t");
        Calendar cal2 = (Calendar) ap.getBean("cal");
        System.out.println(t1 == t2);
        System.out.println(cal1 == cal2);
    }
}
