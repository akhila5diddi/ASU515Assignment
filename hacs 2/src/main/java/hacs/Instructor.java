package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class Instructor extends Person {
	public Instructor() {
		type = 1;// type=1 :instructor
	}

	@Override
	public CourseMenu createCourseMenu(Course theCourse, CourseMenuEnum levelOfCourse) {
		if (levelOfCourse == CourseMenuEnum.HighLevelCourseMenu) {
			// 0: Highlevel defined in CourseSelectDlg.
			theCourseMenu = new HighLevelCourseMenu();
		} else {
			// 1: LowLevel
			theCourseMenu = new LowLevelCourseMenu();
		}
		return theCourseMenu;
	}

	public boolean ShowMenu() {
		super.ShowMenu();
		showAddButton();
		showViewButtons();
		showComboxes();
		showRadios();
		show();
		return ifLogout();
	}
}