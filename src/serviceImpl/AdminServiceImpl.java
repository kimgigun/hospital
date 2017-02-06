package serviceImpl;

import domain.MemberBean;
import domain.PatientsBean;
import service.AdminService;
import domain.DoctorBean;
import domain.NurseBean;

public class AdminServiceImpl implements AdminService {
	private DoctorBean[] doctorsList;
	private NurseBean[] nursesList;
	private int[] countArr;

	public AdminServiceImpl(){
	/*	countArr[0] = countArr[0]=0;*/
		countArr=new int[2];
		doctorsList=new DoctorBean[countArr[0]];
		nursesList=new NurseBean[countArr[1]];
		
	}
	
	@Override
	public void regist(MemberBean member) {

		if (member instanceof DoctorBean) {
			DoctorBean doctor = (DoctorBean) member; // member 에 type을 Doctors의
														// 타입으로 변환.
			if (countArr[0] == doctorsList.length) {
				DoctorBean[] temp = new DoctorBean[countArr[0] + 10];
				System.arraycopy(doctorsList, 0, temp, 0, countArr[0]);
				doctorsList = temp;
			}
			doctorsList[countArr[0]] = doctor;
			countArr[0]++;

		} else if (member instanceof NurseBean) { 
			NurseBean nurse = (NurseBean) member;
			if (countArr[0] == nursesList.length) {
				NurseBean[] temp = new NurseBean[countArr[0] + 10];
				System.arraycopy(doctorsList, 0, temp, 0, countArr[1]);
				nursesList = temp;
			}
			nursesList[countArr[1]++] = nurse;
		}
	}


	@Override
	public MemberBean findById(MemberBean member) {
		MemberBean mem = new MemberBean();
		if (member instanceof DoctorBean) {
			DoctorBean doctor = (DoctorBean) member;
			for (int i = 0; i < countArr[0]; i++) {
				if (member.equals(doctorsList[i].getUid())) {
					mem = doctorsList[i];
					break;
				}
			}
		} else {
			if (member instanceof NurseBean) {
				NurseBean nur = (NurseBean) member;
				for (int i = 0; i < countArr[i]; i++) {
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
		MemberBean arr= new MmberBean[count];
		return null;
	}

	@Override
	public DoctorBean[] list() {
		
		return doctorsList;
	}

	@Override
	public NurseBean[] nureselist() {
		return nursesList;
	}

	@Override
	public int count() {
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int countByName(MemberBean member) {
		// TODO Auto-generated method stub
		return 0;
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
}
