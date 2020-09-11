package MainTest;

import beans.Test;
import java.util.Scanner;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {
        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resource/spring.xml"); //Invoking afterPropertiesSet method and craete object
        Test t = (Test) cap.getBean("t");
        System.out.print("Enter Name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        t.save(name); //Invoking Save method only
        cap.close(); //Invoking Destroy method only
    }
}
