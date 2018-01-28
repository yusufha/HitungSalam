/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungsalam;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author YusufHA
 */
public class HitungSalamIT {
    
    public HitungSalamIT() {
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
     * Test of Input method, of class HitungSalam.
     */
//     

    /**
     * Test of Hitung method, of class HitungSalam.
     */
    @Test
    public void testHitung() {
        System.out.println("Bener");
        double org = 10.0;
        HitungSalam instance = new HitungSalam();
        double expResult = 45.0;
        double result = instance.Hitung(org);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of main method, of class HitungSalam.
     */
//    @Test
//    public void testMain() {
//        System.out.println("main");
//        String[] args = null;
//        HitungSalam.main(args);
//    }
    
}
