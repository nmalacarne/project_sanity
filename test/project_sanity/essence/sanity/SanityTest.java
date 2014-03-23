/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.essence.sanity;

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
public class SanityTest {
    
    public SanityTest() {
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
     * Test of wound method, of class Sanity.
     */
    @Test
    public void testWound() {
        System.out.println("wound");
        Sanity instance = new Sanity();
        instance.wound();
        assertEquals(99, instance.getValue());
    }

    /**
     * Test of mend method, of class Sanity.
     */
    @Test
    public void testMend() {
        System.out.println("mend");
        Sanity instance = new Sanity();
        instance.wound();
        instance.mend();
        assertEquals(100, instance.getValue());
    }

    /**
     * Test of decay method, of class Sanity.
     */
    @Test
    public void testDecay() {
        System.out.println("decay");
        Sanity instance = new Sanity();
        instance.decay();
        assertEquals(99, instance.getValue());
    }

    /**
     * Test of grow method, of class Sanity.
     */
    @Test
    public void testGrow() {
        System.out.println("grow");
        Sanity instance = new Sanity();
        instance.grow();
        assertEquals(100, instance.getValue());
    }

    /**
     * Test of getValue method, of class Sanity.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Sanity instance = new Sanity();
        // decay 51 times
        for (int i = 0; i < 51; i++){instance.decay();}
        
        // wound 50 times
        for (int i = 0; i < 50; i++){instance.wound();}
        
        assertEquals(0, instance.getValue());
    }

    /**
     * Test of toString method, of class Sanity.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Sanity instance = new Sanity();
        String expResult = "";
        String result = instance.toString();
        assertEquals(instance.getClass().getSimpleName(), result);
    }
    
}
