package hacs;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Akhila Diddi
 */


public class SolutionIteratorTest {
    SolutionList solutionList = new SolutionList();

    @Test
    public void testSolutionIterator() {
        //creating a solution iterator object
        SolutionIterator solutionIterator = new SolutionIterator(solutionList);
        Assert.assertNotNull(solutionIterator);

        //checks if boolean value is being returned and since intially there will be no solutions, it return false
        Boolean hasNextSolution = solutionIterator.hasNext();
        Assert.assertFalse(hasNextSolution);


        //checks if next method is working
        Object next = solutionIterator.next();
        Assert.assertNull(next);


    }
}
