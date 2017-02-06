package controller;
import javax.swing.*;
import domain.*;
import serviceImpl.AdminServiceImpl;
import constants.Hospital;
/*import test.Bmi;*/
public class PatientController {
	
	public void start() {
		PatientsBean pat = null;
		while (true) {
			/*
			 * [의사]한석규(남) 36세, han@test.com, 010 - 1234 -5678 [간호사]박신혜(여) 25세,
			 * park@test.com, 010 - 1234 -5678 [환자]홍길동(남) 15세, hong@test.com,
			 * 010 - 1234 -5678
			 */
			switch (JOptionPane.showInputDialog(Hospital.EXE_OPTION)) {
			case "0":
				return;
			case "1":

				DoctorBean doc = new DoctorBean();
				String docInfo = JOptionPane.showInputDialog(Hospital.DOC_SPEC);
				String[] docInfoArr = docInfo.split(",");
				doc.setUid((docInfoArr[0]));
				doc.setMajorTreat(docInfoArr[1]);
				doc.setName(docInfoArr[2]);
				doc.setSsn(docInfoArr[3]);
				doc.setPhone(docInfoArr[4]);
				doc.setEmail(docInfoArr[5]);
				doc.setDocPosition(docInfoArr[6]);
				JOptionPane.showMessageDialog(null, doc.toString());
				/*
				 * doc.setUid(Integer.parseInt(JOptionPane.showInputDialog(
				 * DOC_SPEC)));
				 */

				break;
			case "2":
				NurseBean nur = new NurseBean();
				String nurInfo = JOptionPane.showInputDialog(Hospital.NUR_SPEC);
				String[] nurInfoArr = nurInfo.split(",");
				nur.setUid(( nurInfoArr[0]));
				nur.setMajorJob(nurInfoArr[1]);
				nur.setName(nurInfoArr[2]);
				nur.setSsn(nurInfoArr[3]);
				nur.setPhone(nurInfoArr[4]);
				nur.setEmail(nurInfoArr[5]);
				nur.setNurPosition(nurInfoArr[6]);
				JOptionPane.showMessageDialog(null, nur.toString());
				break;
			case "3":
				pat = new PatientsBean();
				String patInfo = JOptionPane.showInputDialog(Hospital.PAT_SPEC);
				String[] patInfoArr = patInfo.split(",");
				pat.setUid(String.valueOf(patInfoArr[0]));
				pat.setName(patInfoArr[1]);
				JOptionPane.showMessageDialog(null, pat.toString());
				break;
			case "4":
				AdminServiceImpl bmi=new AdminServiceImpl();
				pat.setHeight((JOptionPane.showInputDialog("키를 입력하세요.")));
				pat.setWeight((JOptionPane.showInputDialog("몸무게를 입력하세요.")));
				JOptionPane.showMessageDialog(null,bmi.getBmi(pat)+"입니다." );
				break;
			}
		}
	}
}