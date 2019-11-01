package hacs;

import org.junit.Assert;
import org.junit.Test;

public class ClassCourseListTest {
    @Test
    public void testClassCourseList(){
         ClassCourseList classCourseList = new ClassCourseList();
        Assert.assertNotNull(classCourseList);
        //Course lowLevelCourse = new Course("SER515", 1);
        //String theFileName = "CourseInfo.txt";
        String courseName = "CSE870";

        //Check this
        Course course1 = classCourseList.FindCourseByCourseName(courseName.toString());
        //Assert.assertEquals("CSE870", course1);
        Assert.assertNull(course1);





    }
}
