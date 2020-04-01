/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import eu.ensup.BO.EtudiantBO;
import eu.ensup.DAO.IEtudiantDAO;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author lorris
 */
public class TestDAO {
    
    public TestDAO() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
     @Test
    public void insert() {
         ClassPathXmlApplicationContext appContext =  new ClassPathXmlApplicationContext("spring-data.xml");
		
		IEtudiantDAO iEtudiantDAO = (IEtudiantDAO) appContext.getBean("IEtudiantDAO");
		EtudiantBO bo = new EtudiantBO("test","test");
		iEtudiantDAO.save(bo);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
