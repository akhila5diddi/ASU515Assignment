package hacs;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Akhila Diddi
 */


public class CourseIteratorTest {

    @Test
    public void testCourseIterator() {
        ClassCourseList courseList = new ClassCourseList();
        CourseIterator courseIterator = new CourseIterator(courseList);
        Assert.assertNotNull(courseIterator);

        //Checks if there is a next course, returns false since thre are none
        Boolean hasNextCourse = courseIterator.hasNext();
        Assert.assertFalse(hasNextCourse);

        //check if next course method is working
        Object next = courseIterator.next();
        Assert.assertNull(next);


    }
}
