/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestMain;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Sourabh
 */
public class MainClass {
    public static void main(String[] args) {
        ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resources/spring.xml");
        cap.start();
        cap.stop();
        cap.close();
        cap.refresh();
    }
}
