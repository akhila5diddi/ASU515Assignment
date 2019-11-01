package hacs;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    @Test
    public void testPerson(){
        Person person = new Person() {
            @Override
            public CourseMenu CreateCourseMenu(Course theCourse, CourseMenuEnum theLevel) {
                return null;
            }

        };

        //Assert.assertNotNull(person);
        Boolean Logout = person.ifLogout();
        //Assert.assertNotNull(Logout);


    }
}
