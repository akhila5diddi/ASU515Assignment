package hacs;

/**
 * Title: HACS Description: CSE870 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 *
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 */

public class Student extends Person {

    public Student() {
        type = UserTypeEnum.Student; // type=0: student
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

    @Override
    public boolean showMenu() {
        super.showMenu();
        showViewButtons();
        showComboxes();
        showRadios();
        show();
        return ifLogout();
    }
}