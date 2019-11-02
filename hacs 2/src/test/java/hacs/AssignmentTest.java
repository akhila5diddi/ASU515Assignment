package hacs;

import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Akhila Diddi
 */


public class AssignmentTest {

    @Test
    public void testIsOverDue() {
        Assignment assignment = new Assignment();
        Date todayDate = new Date();
        Date dueDate = new Date();

        //Test when dueDate is current day, the isOverdue should return false;
        assignment.setDueDate(todayDate);
        Assert.assertFalse(assignment.isOverDue());

        //Test when dueDate is future date, isOverdue should return false;
        Calendar c = Calendar.getInstance();
        c.setTime(todayDate);
        c.add(Calendar.DATE, 2);

        Date futureDate = c.getTime();
        assignment.setDueDate(futureDate);
        Assert.assertFalse(assignment.isOverDue());

        //Test when dueDate is past date, isOverdue should return true;
        c.setTime(todayDate);
        c.add(Calendar.DATE, -5);

        Date pastDate = c.getTime();
        assignment.setDueDate(pastDate);
        Assert.assertTrue(assignment.isOverDue());

        Object solution = assignment.addSolution();
        Assert.assertNotNull(solution);

        SolutionList solutionList = new SolutionList();
        Solution sol = new Solution();
        assignment.addSolution(sol);
        Assert.assertNotNull(assignment.theSolutionList);

        //String studentName = "CSE870";
        //Object sol1 = assignment.getSolution(studentName);
        //Assert.assertNotNull(sol1);

        Object solutionIterator = assignment.getSolutionIterator();
        Assert.assertNotNull(solutionIterator);
        String assignmentSpec = "Answers";
        assignment.setAssignmentSpec(assignmentSpec);
        String toString = assignment.toString();


        String dueDateStr = assignment.getDueDateString();
        Assert.assertNotNull(dueDateStr);


    }
}