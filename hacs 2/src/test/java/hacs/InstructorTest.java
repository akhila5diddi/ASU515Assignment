package hacs;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;


/**
 * @author Akhila Diddi
 */


public class InstructorTest {

    @Test
    public void testInstructor() {
        Instructor instructor = new Instructor();
        Assert.assertNotNull(instructor);
        Course lowLevelCourse = new Course("SER515", CourseMenuEnum.LowLevelCourseMenu);
        Course highLevelCourse = new Course("SER515", CourseMenuEnum.HighLevelCourseMenu);
        // Creating high level course
        CourseMenu highLevelCourseMenu = instructor.createCourseMenu(lowLevelCourse, CourseMenuEnum.HighLevelCourseMenu);
        Assert.assertNotNull(highLevelCourseMenu);

        // Creating low level course
        CourseMenu lowLevelCourseMenu = instructor.createCourseMenu(lowLevelCourse, CourseMenuEnum.LowLevelCourseMenu);
        Assert.assertNotNull(instructor.createCourseMenu(lowLevelCourse, CourseMenuEnum.LowLevelCourseMenu));

        // Assert that the course object that is created is a low level course when low level course menu is passed
        LowLevelCourseMenu testLowLevelCourseMenu = (LowLevelCourseMenu) lowLevelCourseMenu;
        Assert.assertNotNull(testLowLevelCourseMenu);

        // Assert that the course object that is created is a low level course when low level course menu is passed
        HighLevelCourseMenu testHighLevelCourseMenu = (HighLevelCourseMenu) highLevelCourseMenu;
        Assert.assertNotNull(testHighLevelCourseMenu);
    }
}
