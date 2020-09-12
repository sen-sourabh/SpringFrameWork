package MainTest;

import beans.Bank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
        Bank b = (Bank)ap.getBean("b");
        System.out.println(b.getClass().getCanonicalName());
        b.deposit();
        b.withdraw();
        b.calInt();
    }
}
