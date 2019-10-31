package hacs;

import org.junit.Assert;
import org.junit.Test;

public class StudentTest {

    @Test
    public void testStudent() {
        Student student = new Student();

        // New student object is created
        Assert.assertNotNull(student);

        Course lowLevelCourse = new Course("SER515", 1);
        Course highLevelCourse = new Course("SER515", 0);

        // Creating high level course
        CourseMenu highLevelCourseMenu = student.createCourseMenu(lowLevelCourse, CourseMenuEnum.HighLevelCourseMenu);
        Assert.assertNotNull(highLevelCourseMenu);

        // Creating low level course
        CourseMenu lowLevelCourseMenu = student.createCourseMenu(lowLevelCourse, CourseMenuEnum.LowLevelCourseMenu);
        Assert.assertNotNull(student.createCourseMenu(lowLevelCourse, CourseMenuEnum.LowLevelCourseMenu));

        // Assert that the course object that is created is a low level course when low level course menu is passed
        LowLevelCourseMenu testLowLevelCourseMenu = (LowLevelCourseMenu) lowLevelCourseMenu;
        Assert.assertNotNull(testLowLevelCourseMenu);

        // Assert that the course object that is created is a low level course when low level course menu is passed
        HighLevelCourseMenu testHighLevelCourseMenu = (HighLevelCourseMenu) highLevelCourseMenu;
        Assert.assertNotNull(testHighLevelCourseMenu);
    }

    @Test
    public void testStudent2() {
        Student student = new Student();

        // New student object is created
        Assert.assertNotNull(student);

        Course lowLevelCourse = new Course("SER515", 1);
        Course highLevelCourse = new Course("SER515", 0);

        // Creating high level course
        CourseMenu lowLevelCourseMenu = student.createCourseMenu(lowLevelCourse, CourseMenuEnum.HighLevelCourseMenu);
        Assert.assertNotNull(lowLevelCourseMenu);

        // Creating low level course
        CourseMenu highLevelCourseMenu = student.createCourseMenu(lowLevelCourse, CourseMenuEnum.LowLevelCourseMenu);
        Assert.assertNotNull(student.createCourseMenu(highLevelCourse, CourseMenuEnum.LowLevelCourseMenu));

        // Assert that the course object that is created is a low level course when low level course menu is passed
        LowLevelCourseMenu testLowLevelCourseMenu = (LowLevelCourseMenu) lowLevelCourseMenu;
        Assert.assertNotNull(testLowLevelCourseMenu);

        // Assert that the course object that is created is a low level course when low level course menu is passed
        HighLevelCourseMenu testHighLevelCourseMenu = (HighLevelCourseMenu) highLevelCourseMenu;
        Assert.assertNotNull(testHighLevelCourseMenu);
    }
}