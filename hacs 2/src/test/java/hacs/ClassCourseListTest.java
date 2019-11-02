package hacs;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Akhila Diddi
 */

public class ClassCourseListTest {

    @Test
    public void inititalizeFromFile() {
        ClassCourseList classCourseList = new ClassCourseList();
        classCourseList.initializeFromFile("testfile.txt");
    }

    @Test
    public void testClassCourseList() {
        ClassCourseList classCourseList = new ClassCourseList();
        Assert.assertNotNull(classCourseList);


        //If there is no course in the class course, it returns null
        Assert.assertNull(classCourseList.findCourseByCourseName("CSE555"));

        //Adding courses
        Course course1 = new Course("SER501", CourseMenuEnum.HighLevelCourseMenu);
        Course course2 = new Course("SER515", CourseMenuEnum.LowLevelCourseMenu);

        classCourseList.add(course1);
        classCourseList.add(course2);

        //Assert not null, when you find a course in the courseList
        Assert.assertNotNull(classCourseList.findCourseByCourseName("SER501"));

        Assert.assertEquals(course1, classCourseList.findCourseByCourseName("SER501"));


    }
}
