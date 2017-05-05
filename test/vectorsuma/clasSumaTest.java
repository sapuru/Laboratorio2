/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorsuma;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author macbook
 */
public class clasSumaTest {
    
    public clasSumaTest() {
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
     * Test of sumaVecAB method, of class clasSuma.
     */
    @Test
    public void testSumaVecAB_intArr_intArr() {
        System.out.println("sumaVecAB");
        int[] vectorA = {2, 3, 4, 5};
        int[] vectorB = {6, 7, 8, 9};
        clasSuma instance = new clasSuma();
        int[] expResult = {8, 10, 12, 14};
        int[] result = instance.sumaVecAB(vectorA, vectorB);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sumaVecAB method, of class clasSuma.
     */
//    @Test
//    public void testSumaVecAB_3args() {
//        System.out.println("sumaVecAB");
//        int[] vectorA = null;
//        int[] vectorB = null;
//        int[] vectorC = null;
//        clasSuma instance = new clasSuma();
//        instance.sumaVecAB(vectorA, vectorB, vectorC);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of sumaVecAB method, of class clasSuma.
     */
//    @Test
//    public void testSumaVecAB_3args() {
//        System.out.println("sumaVecAB");
//        int[] vectorA = null;
//        int[] vectorB = null;
//        int[] vectorC = null;
//        clasSuma instance = new clasSuma();
//        instance.sumaVecAB(vectorA, vectorB, vectorC);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
    
}
