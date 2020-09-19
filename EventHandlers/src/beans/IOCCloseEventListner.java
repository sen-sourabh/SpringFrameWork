/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

/**
 *
 * @author Sourabh
 */
public class IOCCloseEventListner implements ApplicationListener<ContextClosedEvent>{

    @Override
    public void onApplicationEvent(ContextClosedEvent e) {
        System.out.println("On IOC Closed Method");
    }
    
}
