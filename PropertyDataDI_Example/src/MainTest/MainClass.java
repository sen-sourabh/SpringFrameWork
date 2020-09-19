package MainTest;

import beans.CPool;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
        CPool cp = (CPool)ap.getBean("cp");
        cp.printData();
    }
}
