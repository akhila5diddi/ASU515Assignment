package hacs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * @author Akhila Diddi
 */


public class FacadeTest {
    Facade facade;

    @Before
    public void setup() {
        facade = new Facade();
    }

    @Test
    public void reportSolutions() throws Exception {
        Assignment assignment = new Assignment();
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();

        assignment.theSolutionList.add(solution1);
        assignment.theSolutionList.add(solution2);

        SolutionIterator solutionIterator = assignment.getSolutionIterator();
        //All the solutions are not reported initially
        while (solutionIterator.hasNext()) {
            Solution currentSolution = (Solution) solutionIterator.next();
            Assert.assertFalse(currentSolution.isReported());
        }

        //After the facade report solution is called - all the solutions of an assignment are marked as reported
        facade.reportSolutions(assignment);

        solutionIterator = assignment.getSolutionIterator();
        //All the solutions are not reported initially
        while (solutionIterator.hasNext()) {
            Solution currentSolution = (Solution) solutionIterator.next();
            Assert.assertTrue(currentSolution.isReported());
        }
    }

    @Test
    public void submitSolution() throws Exception {
        //Test when you submit a solution to an assignment, the solution appears in the assignment
        Assignment assignment = new Assignment();
        Solution solution = new Solution();

        //Before the solution is added, assert there are no items in the solution list
        Assert.assertEquals(assignment.theSolutionList.size(), 0);

        //After the solution is submitted, assert there is atleast one item in the solution list
        facade.submitSolution(assignment, solution);

        Assert.assertEquals(assignment.theSolutionList.size(), 1);
    }

    @Test
    public void createUser() throws Exception {
        //Create a student user and verify that facade contains student user
        String studentName = "yoyo";
        String professorName = "Instr2";

        UserInfoItem userInfoItem = new UserInfoItem();
        userInfoItem.strUserName = studentName;
        userInfoItem.UserType = UserInfoItem.USER_TYPE.Student;
        facade.createUser(userInfoItem);
        Assert.assertEquals(facade.person.userName, studentName);
        Assert.assertEquals(facade.person.type, UserTypeEnum.Student);

        //Create a professor and verify that facade contains professor user
        userInfoItem.strUserName = professorName;
        userInfoItem.UserType = UserInfoItem.USER_TYPE.Instructor;
        facade.createUser(userInfoItem);
        Assert.assertEquals(facade.person.userName, professorName);
        Assert.assertEquals(facade.person.type, UserTypeEnum.Instructor);
    }
}