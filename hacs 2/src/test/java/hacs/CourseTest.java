package hacs;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Akhila Diddi
 */

public class CourseTest {
    @Test
    public void testCourse() {
        Course course = new Course("SER515", CourseMenuEnum.HighLevelCourseMenu);

        Assert.assertNotNull(course);
        //Course highLevelCourse = new Course("SER515", 0);

        //converts course1 to string
        String course1 = course.toString();
        Assert.assertNotNull(course1);

        Assignment assignment = new Assignment();
        course.addAssignment(assignment);


    }

}
