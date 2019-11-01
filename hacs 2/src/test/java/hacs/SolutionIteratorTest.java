package hacs;

import org.junit.Assert;
import org.junit.Test;

public class SolutionIteratorTest {
    SolutionList solutionList = new SolutionList();
    @Test
    public void testSolutionIterator(){
        SolutionIterator solutionIterator = new SolutionIterator(solutionList);
        Assert.assertNotNull(solutionIterator);


        Boolean hasNextSolution = solutionIterator.hasNext();
        Assert.assertNotNull(hasNextSolution);






        Object next = solutionIterator.next();
        Assert.assertNull(next);



    }
}
