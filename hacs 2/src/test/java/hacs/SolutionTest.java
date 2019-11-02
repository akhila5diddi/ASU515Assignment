package hacs;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Akhila Diddi
 */


public class SolutionTest {
    @Test
    public void testSolution() {
        Solution solution = new Solution();
        //Checks if a new solution instance is created
        Assert.assertNotNull(solution);

        String string = solution.toString();

        //Checks if string is being created from to string method
        Assert.assertNotNull(string);

        //Checks if grade is being fetched  from get grade method
        String grade = solution.getGradeString();
        Assert.assertNotNull(grade);

        //Checks if  grade is being fetched  from getGradeInt method in integer format
        int gradeInt = solution.getGradeInt();
        Assert.assertNotNull(gradeInt);

        //checks if isReported Method is working or not
        Boolean isReported = solution.isReported();
        Assert.assertNotNull(isReported);


    }
}
