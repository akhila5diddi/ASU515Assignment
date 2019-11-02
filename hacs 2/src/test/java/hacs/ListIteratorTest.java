package hacs;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


/**
 * @author Akhila Diddi
 */


public class ListIteratorTest {
    @Test
    public void testListIterator() {
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = new ListIterator(arrayList);
        //checks if list iterator is getting created
        Assert.assertNotNull(listIterator);
        //checks if list has next object, since its empty it returns false
        Boolean hasNext = listIterator.hasNext();
        Assert.assertFalse(hasNext);


        Object next = listIterator.next();
        Assert.assertNull(next);


    }
}
