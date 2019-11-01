package hacs;

import org.junit.Assert;
import org.junit.Test;

public class FacadeTest {
    @Test
    public void testFacade(){
        UserInfoItem userInfoItem = new UserInfoItem();
        ClassCourseList classCourseList = new ClassCourseList();
        Facade facade = new Facade();
        Assert.assertNotNull(facade);
        //its showing gui
        //Boolean login = facade.Login(userInfoItem);
        //Assert.assertNotNull(login);
        Course course = new Course("SER515", 1);
        facade.AddAssignment(course);


        //Assert.assertNotNull();

    }
}
