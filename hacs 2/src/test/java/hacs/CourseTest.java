package hacs;

import org.junit.Assert;
import org.junit.Test;

public class CourseTest {
    @Test
    public void testCourse(){
        Course course = new Course("SER515", 1);

        Assert.assertNotNull(course);
        //Course highLevelCourse = new Course("SER515", 0);

        String course1 = course.toString();
        Assert.assertNotNull(course1);







    }

}
