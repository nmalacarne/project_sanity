/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.attribute;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nicholas
 */
public class DexterityTest {
    
    public DexterityTest() {
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
     * Test of decay method, of class Strength.
     */
    @Test
    public void testDecay() {
        AAttribute s = new Dexterity(4);
        for (int i = 0; i < 5; i++){s.decay();}
        Assert.assertEquals(1, s.getValue());
    }

    /**
     * Test of grow method, of class Strength.
     */
    @Test
    public void testGrow() {
        Dexterity d = new Dexterity(6);
        for (int i = 0; i < 5; i++){d.decay();}
        for (int i = 0; i < 3; i++){d.grow();}
        Assert.assertEquals(4, d.getValue());
    }

    /**
     * Test of getValue method, of class Strength.
     */
    @Test
    public void testGetValue() {
        Dexterity d = new Dexterity(2);
        for (int i = 0; i < 20; i++){d.decay();}
        for (int i = 0; i < 1; i++){d.grow();}
        Assert.assertEquals(1, d.getValue());
    }

    /**
     * Test of toString method, of class Strength.
     */
    @Test
    public void testToString() {
        Dexterity d = new Dexterity(2);
        assertEquals(d.getClass(), Dexterity.class);
    }
    
}
