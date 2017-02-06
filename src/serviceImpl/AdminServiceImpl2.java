package serviceImpl;

import domain.MemberBean;
import domain.PatientsBean;
import service.AdminService;
import domain.DoctorBean;
import domain.NurseBean;

public class AdminServiceImpl2 implements AdminService {
	private DoctorBean[] doctorsList;
	private NurseBean[] nursesList;
	private int doccount;
	private int nurcount;

	public AdminServiceImpl2() {
		doccount = nurcount= 0;
		doctorsList = new DoctorBean[doccount];
		nursesList = new NurseBean[nurcount];
	}

	@Override
	public String getBmi(PatientsBean pat) {
		double weight = Double.parseDouble(pat.getWeight());
		double height = Double.parseDouble(pat.getHeight());
		double bmi = weight / (height * height);
		String result = "";
		if (bmi > 30.0) {
			result = "고도비만";
		} else if (bmi > 25.0) {
			result = "비만";
		} else if (bmi > 23.0) {
			result = "과체중";
		} else if (bmi > 18.5) {
			result = "정상";
		} else {
			result = "저체중";
		}
		return result;
	}

	@Override
	public void regist(MemberBean member) {

		if (member instanceof DoctorBean) {
			DoctorBean doctor = (DoctorBean) member; // member 에 type을 Doctors의
														// 타입으로 변환.
			if (doccount == doctorsList.length) {
				DoctorBean[] temp = new DoctorBean[doccount + 10];
				System.arraycopy(doctorsList, 0, temp, 0,doccount);
				doctorsList = temp;
			}
			doctorsList[doccount] = doctor;
			doccount++;

		} else if (member instanceof NurseBean) { // 닥터랑 널스랑 구분할 무언가가 필요해 보임.
			NurseBean nurse = (NurseBean) member;
			if (nurcount == nursesList.length) {
				NurseBean[] temp = new NurseBean[nurcount + 10];
				System.arraycopy(doctorsList, 0, temp, 0, nurcount);
				nursesList = temp;
			}
			nursesList[nurcount++] = nurse;
		}
	}

	@Override
	public MemberBean findById(MemberBean member) {
		MemberBean mem = new MemberBean();
		if (member instanceof DoctorBean) {
			for (int i = 0; i < doccount; i++) {
				DoctorBean doc = (DoctorBean) member;
				if (member.equals(doctorsList[i].getUid())) {
					mem = doctorsList[i];
					break;
				}
			}
		} else {
			if (member instanceof NurseBean) {
				for (int i = 0; i < nurcount; i++) {
					NurseBean nur = (NurseBean) member;
					if (member.equals(nursesList[i].getUid())) {
						mem = nursesList[i];
						break;
					}
				}
			}
		}
	return mem;
	}
	@Override
	public MemberBean[] findByName(MemberBean member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoctorBean[] list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NurseBean[] nureselist() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void change(MemberBean member) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(MemberBean member) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean exist(MemberBean member) {

		boolean check = false;
		if (member instanceof DoctorBean) {
			DoctorBean doctor = (DoctorBean) member;

			for (int i = 0; i < doccount; i++) {
				if (member.equals(doctorsList[i].getUid())) {
					check = true;
					break;
				}
			}
		} else {
			NurseBean nur = (NurseBean) member;
			for (int i = 0; i < nurcount; i++) {
				if (member.equals(nursesList[i].getUid())) {
					check = true;
					break;
				}
			}
		}
		return false;
	}

	@Override
	public int countByName(MemberBean member) {
		// TODO Auto-generated method stub
		return 0;
	}
}
