package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class Instructor extends Person {
    public Instructor() {
        type = UserTypeEnum.Instructor; //type=1 :instructor
    }

    public CourseMenu createCourseMenu(Course theCourse, CourseMenuEnum courseMenu) {
        if (courseMenu == CourseMenuEnum.HighLevelCourseMenu) {
            // High-level defined in CourseSelectDlg.
            theCourseMenu = new HighLevelCourseMenu();
        } else {
            // LowLevel
            theCourseMenu = new LowLevelCourseMenu();
        }
        return theCourseMenu;
    }

    public boolean showMenu() {
        super.showMenu();
        showAddButton();
        showViewButtons();
        showComboxes();
        showRadios();
        show();
        return ifLogout();
    }
}