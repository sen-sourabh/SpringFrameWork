package springdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
    public static void main(String[] args) {
        
        ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
        Test test = (Test) ap.getBean("t");
        test.hello();        
    }
}