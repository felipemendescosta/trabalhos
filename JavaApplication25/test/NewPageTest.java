/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felip
 */
public class NewPageTest {
    
    public NewPageTest() {
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

    /**
     * Test of getContentPane method, of class NewPage.
     */
    @Test
    public void testGetContentPane() {
        System.out.println("getContentPane");
        NewPage instance = new NewPage();
        Object expResult = null;
        Object result = instance.getContentPane();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVisible method, of class NewPage.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        boolean b = false;
        NewPage instance = new NewPage();
        instance.setVisible(b);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
