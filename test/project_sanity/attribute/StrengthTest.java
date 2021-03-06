/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.attribute;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author nicholas
 */
public class StrengthTest {
    
    public StrengthTest() {
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
        Strength s = new Strength(3);
        for (int i = 0; i < 0; i++){s.decay();}
        assertEquals(1, s.getValue());
    }

    /**
     * Test of grow method, of class Strength.
     */
    @Test
    public void testGrow() {
        Strength s = new Strength(3);
        for (int i = 0; i < 3; i++){s.decay();}
        for (int i = 0; i < 3; i++){s.grow();}
        assertEquals(3, s.getValue());
    }

    /**
     * Test of getValue method, of class Strength.
     */
    @Test
    public void testGetValue() {
        Strength s = new Strength(3);
        for (int i = 0; i < 20; i++){s.decay();}
        for (int i = 0; i < 1; i++){s.grow();}
        assertEquals(1, s.getValue());
    }

    /**
     * Test of toString method, of class Strength.
     */
    @Test
    public void testToString() {
        Strength s = new Strength(3);
        assertEquals(s.getClass(), Strength.class);
    }
    
}
