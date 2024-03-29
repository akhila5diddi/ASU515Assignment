package hacs;

/**
 * Title:        HACS
 * Description:  CSE870 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 *
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 */

import java.text.DateFormat;
import java.util.Date;

public class Assignment {

    protected String assignmentName;
    protected String strAssignmentFilename;
    protected Date dueDate = new Date();
    protected String assignmentSpec;
    protected SolutionList theSolutionList = new SolutionList();
    protected Solution suggestSolution = new Solution();

    public Assignment() {
    }

    public void setDueDate(Date theDueDate) {
        this.dueDate = theDueDate;
    }

    public void setAssignmentSpec(String theSpec) {
        this.assignmentSpec = theSpec;
    }

    public boolean isOverDue() {
        Date today;
        today = new Date();
        return today.after(this.dueDate);
    }

    public Solution addSolution() {
        Solution mySolution = new Solution();
        return mySolution;
    }

    ////add the theSolution to the Solutionlist
    public void addSolution(Solution theSolution) {
        theSolutionList.add(theSolution);
    }

    public void submitSolution() {
    }

    public SolutionList getSolutionList() {
        return this.theSolutionList;
    }

    public SolutionIterator getSolutionIterator() {
        SolutionIterator theSolutionIterator = new SolutionIterator(theSolutionList);
        return theSolutionIterator;
    }

    public String toString() {
        return assignmentName;
    }

    public String getDueDateString() {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
        return dateFormat.format(dueDate);
    }

    public void accept(NodeVisitor visitor) {
        visitor.visitAssignment(this);
    }
}