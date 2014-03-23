/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.essence.blood;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicholas
 */
public class BloodTest {
    
    public BloodTest() {
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
     * Test of getValue method, of class Blood.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Blood instance = new Blood();
        int expResult = 100;
        int result = instance.getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of decay method, of class Blood.
     */
    @Test
    public void testDecay() {
        System.out.println("decay");
        Blood instance = new Blood();
        instance.decay();
    }

    /**
     * Test of grow method, of class Blood.
     */
    @Test
    public void testGrow() {
        System.out.println("grow");
        Blood instance = new Blood();
        instance.grow();
    }

    /**
     * Test of toString method, of class Blood.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Blood instance = new Blood();
        String expResult = "";
        String result = instance.toString();
        assertEquals(instance.getClass().getSimpleName(), result);
    }
    
    /**
     * Test of toString method, of class Blood.
     */
    @Test
    public void testWound() {
        System.out.println("wound");
        Blood instance = new Blood();
        instance.wound();
        instance.wound();
        instance.mend();
        instance.mend();
        instance.mend();
        assertEquals(100, instance.getValue());
    }
}
