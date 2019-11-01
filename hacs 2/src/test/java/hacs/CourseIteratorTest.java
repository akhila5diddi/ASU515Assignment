package hacs;

import org.junit.Assert;
import org.junit.Test;

public class CourseIteratorTest {

    @Test
    public void testCourseIterator(){
        ClassCourseList courseList = new ClassCourseList();
        CourseIterator courseIterator = new CourseIterator(courseList);
        Assert.assertNotNull(courseIterator);

        Boolean hasNextCourse = courseIterator.hasNext();
        Assert.assertNotNull(hasNextCourse);






        Object next = courseIterator.next();
        Assert.assertNull(next);












    }
}
