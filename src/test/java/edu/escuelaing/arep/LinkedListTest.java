package edu.escuelaing.arep;

import edu.escuelaing.arep.LinkedListImpl.LinkedList;
import static junit.framework.Assert.*;
import junit.framework.*;


public class LinkedListTest extends TestCase{

    public LinkedListTest( String testName )
    {
        super( testName );
    }


    public static Test suite()
    {
        return new TestSuite( LinkedListTest.class );
    }


	
	public void testDeberiaAgregar() {
            LinkedList lh= new LinkedList<Integer>();
            for (int i=0;i<15;i++){
                assertTrue(lh.add(i));
            }
            
            assertEquals(15,lh.size());
            
	}
        
        
        public void testDeberiaRemoverPorIndice() {
            LinkedList lh= new LinkedList<Integer>();
            for (int i=0;i<15;i++){
                assertTrue(lh.add(i));
            }
            assertEquals(15,lh.size());
            
            assertEquals(4,lh.remove(4));
            
            assertEquals(14,lh.size());
            
	}
        
        
        public void testDeberiaRemoverPorObjeto() {
            LinkedList lh= new LinkedList<Integer>();
            for (int i=0;i<15;i++){
                assertTrue(lh.add(i));
            }

            assertEquals(15,lh.size());
            
            assertTrue(lh.removeForObject(10));
            
            assertEquals(14,lh.size());
            

               
	}
        
        
        public void testDeberiaDarmeUnObjetoPorSuIndice() {
            LinkedList lh= new LinkedList<Integer>();
            for (int i=0;i<15;i++){
                assertTrue(lh.add(i));
            }
 
            assertEquals(15,lh.size());
            
            assertEquals(lh.get(6),6);
               
	}
        

}
