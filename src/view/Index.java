package view;

import javax.swing.JOptionPane;

import controller.AdminController;
import controller.PatientController;
import enums.IndexButt;

public class Index {
	public static void main(String[] args) {
		   IndexButt[] indexArr={IndexButt.CLOSE,IndexButt.MEMBER_USER,IndexButt.ADMIN};
		   IndexButt select = (IndexButt) JOptionPane.showInputDialog(
				null, // frame
				"ADMIN PAGE", // frame title
				"SELECT USER MENU", // order
				JOptionPane.QUESTION_MESSAGE, // type
				null, // icon
				indexArr, // Array of choices
				indexArr[1]// default
		);

		switch (select) {
		case CLOSE:
			return;
		case ADMIN:
			PatientController c = new PatientController();
			c.start();
			break;
		case MEMBER_USER:
			AdminController s = new AdminController();
			s.start();
			break;
		}
	}

}
