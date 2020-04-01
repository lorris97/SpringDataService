/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.ensup.PRESENTATION;

import eu.ensup.SERVICE.EleveService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author lorris
 */
public class Launcher {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ApplicationContext appContext = (ApplicationContext) new ClassPathXmlApplicationContext("demospringinjection.xml");
		
		//EleveService eleveservice = (EleveService) appContext.getBean("eleveservice");
		
//		System.out.println(eleveservice.lireEleve(1).toString());
      //          eleveservice.destroy();
                
    
    }
    
}
