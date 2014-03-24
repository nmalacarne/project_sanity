/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project_sanity.range;

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
public class RangeTest {
    
    public RangeTest() {
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
     * Test of getMIN method, of class Range.
     */
    @Test
    public void testGetMIN() {

    }

    /**
     * Test of getMAX method, of class Range.
     */
    @Test
    public void testGetMAX() {

    }

    /**
     * Test of rangeCheck method, of class Range.
     */
    @Test
    public void testRangeCheck() {
        System.out.println("rangeCheck");
        Range instance = new Range(0, 100);
        assertEquals(100, instance.rangeCheck(133));
    }

    /**
     * Test of minCheck method, of class Range.
     */
    @Test
    public void testMinCheck() {

    }

    /**
     * Test of maxCheck method, of class Range.
     */
    @Test
    public void testMaxCheck() {

    }
    
}
