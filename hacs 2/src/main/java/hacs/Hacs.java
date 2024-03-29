package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @author mjfindler
 * @version 2.0
 * <p>
 * Update to Java 8
 */

public class Hacs {

    static Facade theFacade = new Facade();

    public Hacs() {
    }

    public static void main(String[] args) {
//		String strUsername;
//		String strUserType = null;
        UserInfoItem userinfoitem = new UserInfoItem();
        theFacade.createCourseList();
        while (true) {
            boolean bExit = false;
            bExit = Facade.login(userinfoitem);
            if (bExit)
                break;
            // userinfoitem.strUserName = "Inst1";
            // userinfoitem.userType = 1;
            theFacade.createUser(userinfoitem);
            theFacade.attachCourseToUser();
            if (userinfoitem.UserType == UserInfoItem.USER_TYPE.Student) // if is a student remind him of the due date
                theFacade.remind();
            boolean bLogout = false;
            while (!bLogout) {
                bLogout = theFacade.selectCourse();
                if (bLogout)
                    break;
                bLogout = theFacade.courseOperation();
            }
        }
//    System.out.println(userinfoitem.strUserName +userinfoitem.userType );
    }
}