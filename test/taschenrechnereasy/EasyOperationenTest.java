/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taschenrechnereasy;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.Math.*;

/**
 *
 * @author stenlux
 */
public class EasyOperationenTest {
    
    public EasyOperationenTest() {
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
     * Test of SetAddi method, of class EasyOperationen.
     */
    @Test
    public void testSetAddi() {
        System.out.println("SetAddi");
        double a = 3.0;
        double b = 4.0;
        EasyOperationen instance = new EasyOperationen();
        instance.SetAddi(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SetSubtra method, of class EasyOperationen.
     */
    @Test
    public void testSetSubtra() {
        System.out.println("SetSubtra");
        double a = 0.0;
        double b = 0.0;
        EasyOperationen instance = new EasyOperationen();
        instance.SetSubtra(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SetMulti method, of class EasyOperationen.
     */
    @Test
    public void testSetMulti() {
        System.out.println("SetMulti");
        double a = 0.0;
        double b = 0.0;
        EasyOperationen instance = new EasyOperationen();
        instance.SetMulti(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SetDivi method, of class EasyOperationen.
     */
    @Test
    public void testSetDivi() {
        System.out.println("SetDivi");
        double a = 0.0;
        double b = 0.0;
        EasyOperationen instance = new EasyOperationen();
        instance.SetDivi(a, b);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAddi method, of class EasyOperationen.
     */
    @Test
    public void testGetAddi() {
        System.out.println("getAddi");
        EasyOperationen instance = new EasyOperationen();
        //TEST1
        double expResult = 791.1;
        instance.SetAddi(556.34, 234.76);
        double result = instance.getAddi();
        assertEquals(expResult, result, 0.0);
        //TEST2
        expResult = 10043502517033.57;
        instance.SetAddi(5678645768456.87, 4364856748576.7);
        result = instance.getAddi();
        assertEquals(expResult, result, 0.0);
        //TEST3
        expResult = -47.16;
        instance.SetAddi(-12.4, -34.76);
        result = instance.getAddi();
        assertEquals(expResult, result, 0.0);
        //TEST4
        expResult = -559099.68;
        instance.SetAddi(-345643.23, -213456.45);
        result = instance.getAddi();
        assertEquals(expResult, result, 0.0001);
        //TEST5
        expResult = 6098.33;
        instance.SetAddi(6534.00, -435.67);
        result = instance.getAddi();
        assertEquals(expResult, result, 0.0);
        
        
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSubtra method, of class EasyOperationen.
     */
    @Test
    public void testGetSubtra() {
        System.out.println("getSubtra");
        EasyOperationen instance = new EasyOperationen();
        //TEST1
        double expResult = 3220.33;
        instance.SetSubtra(3456.00, 235.67);
        double result = instance.getSubtra();
        assertEquals(expResult, result, 0.0);
       //TEST2
        expResult = 6287001.01;
        instance.SetSubtra(-456754.87, -6743755.88);
        result = instance.getSubtra();
        assertEquals(expResult, result, 0.0);
        //TEST3
        expResult = -90000001.33;
        instance.SetSubtra(9999999.56, 100000000.89);
        result = instance.getSubtra();
        assertEquals(expResult, result, 0.0);
        //TEST4
        expResult = -6661019;
        instance.SetSubtra(5647, 6666666);
        result = instance.getSubtra();
        assertEquals(expResult, result, 0.0);
        //TEST5
        expResult = -8465649;
        instance.SetSubtra(-8465637, 12);
        result = instance.getSubtra();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMulti method, of class EasyOperationen.
     */
    @Test
    public void testGetMulti() {
        System.out.println("getMulti");
        EasyOperationen instance = new EasyOperationen();
        //TEST1
        double expResult = 156.00;
        instance.SetMulti(12.0, 13.0);
        double result = instance.getMulti();
        assertEquals(expResult, result, 0.0);
        //TEST2
        expResult = 2359631.97;
        instance.SetMulti(786543.99, 3);
        result = instance.getMulti();
        assertEquals(expResult, result, 0.00001);
        //TEST3
        expResult = 2970059598.00;
        instance.SetMulti(652187, 4554);
        result = instance.getMulti();
        assertEquals(expResult, result, 0.0);
        //TEST4
        expResult = 90165296.00;
        instance.SetMulti(-65432, -1378.0);
        result = instance.getMulti();
        assertEquals(expResult, result, 0.0);
        //TEST5
        expResult = -4971121302.00;
        instance.SetMulti(-87654, 56713.0);
        result = instance.getMulti();
        assertEquals(expResult, result, 0.0);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDivi method, of class EasyOperationen.
     */
    @Test
    public void testGetDivi() {
        System.out.println("getDivi");
        EasyOperationen instance = new EasyOperationen();
        //TEST1
        double expResult = 0.92;
        instance.SetDivi(12.0, 13.0);
        double result = instance.getDivi();
        assertEquals(expResult, result, 0.01);
        //TEST2
        expResult = -262181.33;
        instance.SetDivi(-786543.99, 3);
        result = instance.getDivi();
        assertEquals(expResult, result, 0.00001);
        //TEST3
        expResult = 0;
        instance.SetDivi(0, 4554);
        result = instance.getDivi();
        assertEquals(expResult, result, 0.0);
        //TEST4
        expResult = 0;
        instance.SetDivi(-65432, 0);
        result = instance.getDivi();
        assertEquals(expResult, result, 0.0);
        //TEST5
        expResult = 3.58;
        instance.SetDivi(23456, 6540);
        result = instance.getDivi();
        assertEquals(expResult, result, 0.01);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
