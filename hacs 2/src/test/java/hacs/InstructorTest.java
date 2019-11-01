package hacs;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class InstructorTest {

    @Test
    public void testInstructor(){
        Instructor instructor = new Instructor();
        Assert.assertNotNull(instructor);
        Course lowLevelCourse = new Course("SER515", 1);
        Course highLevelCourse = new Course("SER515", 0);
        // Creating high level course
        CourseMenu highLevelCourseMenu = instructor.CreateCourseMenu(lowLevelCourse, CourseMenuEnum.HighLevelCourseMenu);
        Assert.assertNotNull(highLevelCourseMenu);

        // Creating low level course
        CourseMenu lowLevelCourseMenu = instructor.CreateCourseMenu(lowLevelCourse, CourseMenuEnum.LowLevelCourseMenu);
        Assert.assertNotNull(instructor.CreateCourseMenu(lowLevelCourse, CourseMenuEnum.LowLevelCourseMenu));

        // Assert that the course object that is created is a low level course when low level course menu is passed
        LowLevelCourseMenu testLowLevelCourseMenu = (LowLevelCourseMenu) lowLevelCourseMenu;
        Assert.assertNotNull(testLowLevelCourseMenu);

        // Assert that the course object that is created is a low level course when low level course menu is passed
        HighLevelCourseMenu testHighLevelCourseMenu = (HighLevelCourseMenu) highLevelCourseMenu;
        Assert.assertNotNull(testHighLevelCourseMenu);
    }
}
