package hacs;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSolution(){
        Solution solution = new Solution();
        Assert.assertNotNull(solution);

        String string = solution.toString();
        Assert.assertNotNull(string);

        String grade = solution.getGradeString();
        Assert.assertNotNull(grade);

        int gradeInt = solution.getGradeInt();
        Assert.assertNotNull(gradeInt);

        Boolean isReported = solution.isReported();
        Assert.assertNotNull(isReported);




    }
}
