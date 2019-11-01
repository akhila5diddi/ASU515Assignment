package hacs;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class ListIteratorTest {
    @Test
    public void testListIterator(){
        ArrayList arrayList = new ArrayList();
        ListIterator listIterator = new ListIterator(arrayList);
        Assert.assertNotNull(listIterator);

        Boolean hasNext = listIterator.hasNext();
        Assert.assertNotNull(hasNext);

        if(hasNext == Boolean.TRUE){
            Object next = listIterator.next();
            Assert.assertNull(next);
            System.out.println("hi");
        }


    }
}
