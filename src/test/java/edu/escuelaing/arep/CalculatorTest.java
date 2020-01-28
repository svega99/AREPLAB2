/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep;

import edu.escuelaing.arep.Calculator.Calculator;
import edu.escuelaing.arep.LinkedListImpl.LinkedList;
import junit.framework.*;
import static junit.framework.Assert.*;

/**
 *
 * @author santiago.vega-r
 */
public class CalculatorTest extends TestCase{
    
    public CalculatorTest( String testName )
    {
        super( testName );
    }


    public static Test suite()
    {
        return new TestSuite( CalculatorTest.class );
    }


    
    public void testDeberiaCalcularMedia(){
        LinkedList lh= new LinkedList<Double>();
        lh.add(160.0);
        lh.add(591.0);
        lh.add(114.0);
        lh.add(229.0);
        lh.add(230.0);
        lh.add(270.0);
        lh.add(128.0);
        lh.add(1657.0);
        lh.add(624.0);
        lh.add(1503.0);
        double mean = Calculator.getMean(lh);
        assertEquals(550.6, (double)Math.round(mean * 10d) / 10d);
        
        lh= new LinkedList<Double>();
        lh.add(15.0);
        lh.add(69.9);
        lh.add(6.5);
        lh.add(22.4);
        lh.add(28.4);
        lh.add(65.9);
        lh.add(19.4);
        lh.add(198.7);
        lh.add(38.8);
        lh.add(138.2);
        
        mean = Calculator.getMean(lh);
        assertEquals(60.32, (double)Math.round(mean * 100d) / 100d);
        
    }
    
   
    public void testDeberiaCalcularDesviacionEstandar(){
        LinkedList lh= new LinkedList<Double>();
        lh.add(160.0);
        lh.add(591.0);
        lh.add(114.0);
        lh.add(229.0);
        lh.add(230.0);
        lh.add(270.0);
        lh.add(128.0);
        lh.add(1657.0);
        lh.add(624.0);
        lh.add(1503.0);
        double mean = Calculator.getStandardDeviation(lh);
        assertEquals(572.03, (double)Math.round(mean * 100d) / 100d);
        
        lh= new LinkedList<Double>();
        lh.add(15.0);
        lh.add(69.9);
        lh.add(6.5);
        lh.add(22.4);
        lh.add(28.4);
        lh.add(65.9);
        lh.add(19.4);
        lh.add(198.7);
        lh.add(38.8);
        lh.add(138.2);
        
        mean = Calculator.getStandardDeviation(lh);
        assertEquals(62.26, (double)Math.round(mean * 100d) / 100d);
        
    }
}
