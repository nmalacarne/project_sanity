/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.attribute;

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
public class IntelligenceTest {
    
    public IntelligenceTest() {
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
     * Test of decay method, of class Intelligence.
     */
    @Test
    public void testDecay() {
        System.out.println("decay");
        Intelligence instance = new Intelligence(3);
        for (int i = 0; i < 5; i++){instance.decay();}
        assertEquals(1, instance.getValue());
    }

    /**
     * Test of grow method, of class Intelligence.
     */
    @Test
    public void testGrow() {
        System.out.println("grow");
        Intelligence instance = new Intelligence(3);
    }

    /**
     * Test of getValue method, of class Intelligence.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Intelligence instance = new Intelligence(3);
    }

    /**
     * Test of toString method, of class Intelligence.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Intelligence instance = new Intelligence(3);
    }
    
}
