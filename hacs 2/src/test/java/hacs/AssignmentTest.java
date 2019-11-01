package hacs;

import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class AssignmentTest {

    @Test
    public void testIsOverDue() {
        Assignment assignment = new Assignment();
        Date todayDate = new Date();
        Date dueDate = new Date();

        //Test when dueDate is current day, the isOverdue should return false;
        assignment.SetDueDate(todayDate);
        Assert.assertFalse(assignment.IsOverDue());

        //Test when dueDate is future date, isOverdue should return false;
        Calendar c = Calendar.getInstance();
        c.setTime(todayDate);
        c.add(Calendar.DATE, 2);

        Date futureDate = c.getTime();
        assignment.SetDueDate(futureDate);
        Assert.assertFalse(assignment.IsOverDue());

        //Test when dueDate is past date, isOverdue should return true;
        c.setTime(todayDate);
        c.add(Calendar.DATE, -5);

        Date pastDate = c.getTime();
        assignment.SetDueDate(pastDate);
        Assert.assertTrue(assignment.IsOverDue());

        Object solution = assignment.AddSolution();
        Assert.assertNotNull(solution);

        SolutionList solutionList = new SolutionList();
        Solution sol = new Solution();
        assignment.AddSolution(sol);
        Assert.assertNotNull(assignment.theSolutionList);

        //String studentName = "CSE870";
        //Object sol1 = assignment.getSolution(studentName);
        //Assert.assertNotNull(sol1);

        Object solutionIterator = assignment.GetSolutionIterator();
        Assert.assertNotNull(solutionIterator);
        String assignmentSpec = "Answers";
        assignment.SetAssSpec(assignmentSpec);
        String toString = assignment.toString();

        //check this
        //Assert.assertNotNull(toString);


        String dueDateStr = assignment.getDueDateString();
        Assert.assertNotNull(dueDateStr);







    }
}